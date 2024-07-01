Java 8 has introduced a new class Optional in java.util package. It is used to represent a value is present or absent. The main advantage of this new construct is that No more too many null checks and NullPointerException. It avoids any runtime NullPointerExceptions and supports us in developing clean and neat Java APIs or Applications. Like Collections and arrays, it is also a Container to hold at most one value. Let us explore this new construct with some useful examples.

Advantages of Java 8 Optional:

Null checks are not required.
No more NullPointerException at run-time.
We can develop clean and neat APIs.
No more Boiler plate code

1. Optional Basic example
Optional.ofNullable() method returns a Non-empty Optional if a value present in the given object. Otherwise returns empty Optional.

Optionaal.empty() method is useful to create an empty Optional object.

OptionalBasicExample.java

package com.mkyong;

import java.util.Optional;

public class OptionalBasicExample {

    public static void main(String[] args) {

        Optional<String> gender = Optional.of("MALE");
        String answer1 = "Yes";
        String answer2 = null;

        System.out.println("Non-Empty Optional:" + gender);
        System.out.println("Non-Empty Optional: Gender value : " + gender.get());
        System.out.println("Empty Optional: " + Optional.empty());

        System.out.println("ofNullable on Non-Empty Optional: " + Optional.ofNullable(answer1));
        System.out.println("ofNullable on Empty Optional: " + Optional.ofNullable(answer2));
        
        // java.lang.NullPointerException
        System.out.println("ofNullable on Non-Empty Optional: " + Optional.of(answer2));

    }

}

Output


Non-Empty Optional:Optional[MALE]
Non-Empty Optional: Gender value : MALE
Empty Optional: Optional.empty

ofNullable on Non-Empty Optional: Optional[Yes]
ofNullable on Empty Optional: Optional.empty

Exception in thread "main" java.lang.NullPointerException
	at java.util.Objects.requireNonNull(Objects.java:203)
	at java.util.Optional.<init>(Optional.java:96)
	at java.util.Optional.of(Optional.java:108)
	//...

2. Optional.map and flatMap
OptionalMapFlapMapExample.java

package com.mkyong;

import java.util.Optional;

public class OptionalMapFlapMapExample {

    public static void main(String[] args) {

        Optional<String> nonEmptyGender = Optional.of("male");
        Optional<String> emptyGender = Optional.empty();

        System.out.println("Non-Empty Optional:: " + nonEmptyGender.map(String::toUpperCase));
        System.out.println("Empty Optional    :: " + emptyGender.map(String::toUpperCase));

        Optional<Optional<String>> nonEmptyOtionalGender = Optional.of(Optional.of("male"));
        System.out.println("Optional value   :: " + nonEmptyOtionalGender);
        System.out.println("Optional.map     :: " + nonEmptyOtionalGender.map(gender -> gender.map(String::toUpperCase)));
        System.out.println("Optional.flatMap :: " + nonEmptyOtionalGender.flatMap(gender -> gender.map(String::toUpperCase)));
        
    }

}


Output


Non-Empty Optional:: Optional[MALE]
Empty Optional    :: Optional.empty
Optional value   :: Optional[Optional[male]]
Optional.map     :: Optional[Optional[MALE]]
Optional.flatMap :: Optional[MALE]

3. Optional.filter
OptionalFilterExample.java

package com.mkyong;

import java.util.Optional;

public class OptionalFilterExample {

    public static void main(String[] args) {

        Optional<String> gender = Optional.of("MALE");
        Optional<String> emptyGender = Optional.empty();

        //Filter on Optional
        System.out.println(gender.filter(g -> g.equals("male"))); //Optional.empty
        System.out.println(gender.filter(g -> g.equalsIgnoreCase("MALE"))); //Optional[MALE]
        System.out.println(emptyGender.filter(g -> g.equalsIgnoreCase("MALE"))); //Optional.empty

    }

}

Output


Optional.empty
Optional[MALE]
Optional.empty

4. Optional isPresent and ifPresent
Optional.isPresent() returns true if the given Optional object is non-empty. Otherwise it returns false.

Optional.ifPresent() performs given action if the given Optional object is non-empty. Otherwise it returns false.

OptionalIfPresentExample.java

package com.mkyong;

import java.util.Optional;

public class OptionalIfPresentExample {

    public static void main(String[] args) {

        Optional<String> gender = Optional.of("MALE");
        Optional<String> emptyGender = Optional.empty();

        if (gender.isPresent()) {
            System.out.println("Value available.");
        } else {
            System.out.println("Value not available.");
        }

        gender.ifPresent(g -> System.out.println("In gender Option, value available."));

        //condition failed, no output print
        emptyGender.ifPresent(g -> System.out.println("In emptyGender Option, value available."));

    }

}

Output


Value available.
In gender Option, value available.

5. Optional orElse methods
It returns the value if present in Optional Container. Otherwise returns given default value.

OptionalOrElseExample.java

package com.mkyong;

import java.util.Optional;

public class OptionalOrElseExample {

    public static void main(String[] args) {

        Optional<String> gender = Optional.of("MALE");
        Optional<String> emptyGender = Optional.empty();

        System.out.println(gender.orElse("<N/A>")); //MALE
        System.out.println(emptyGender.orElse("<N/A>")); //<N/A>

        System.out.println(gender.orElseGet(() -> "<N/A>")); //MALE
        System.out.println(emptyGender.orElseGet(() -> "<N/A>")); //<N/A>

    }

}

Output


MALE
<N/A>
MALE
<N/A>

6. Without Java 8 Optional
As everyone is familiar with Online Shopping. Let us assume that we want to implement a Mobile Product Module for a famous e-Commerce website.

Let us implement Mobile Domain module Without Java 8 Optional.

ScreenResolution.java

package com.mkyong.without.optional;

public class ScreenResolution {

	private int width;
	private int height;
	
	public ScreenResolution(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	
}

DisplayFeatures.java

package com.mkyong.without.optional;

public class DisplayFeatures {

	private String size; // In inches
	private ScreenResolution resolution;
	
	public DisplayFeatures(String size, ScreenResolution resolution){
		this.size = size;
		this.resolution = resolution;
	}
	
	public String getSize() {
		return size;
	}
	public ScreenResolution getResolution() {
		return resolution;
	}
	
}

Mobile.java

package com.mkyong.without.optional;

public class Mobile {

	private long id;
	private String brand;
	private String name;
	private DisplayFeatures displayFeatures;
	// Likewise we can see Memory Features, Camera Features etc.
	
	public Mobile(long id, String brand, String name, 
                            DisplayFeatures displayFeatures){
		this.id = id;
		this.brand = brand;
		this.name = name;
		this.displayFeatures = displayFeatures;
	}

	public long getId() {
		return id;
	}

	public String getBrand() {
		return brand;
	}

	public String getName() {
		return name;
	}

	public DisplayFeatures getDisplayFeatures() {
		return displayFeatures;
	}
	
}

Here if we observe getMobileScreenWidth() method, it has lot of boiler plate code with lots null checks. Before Java 8, we should do all these non-sense stuff to avoid Runtime NullPointerExceptions.

MobileService.java

package com.mkyong.without.optional;

public class MobileService {
	
	public int getMobileScreenWidth(Mobile mobile){

		if(mobile != null){
			DisplayFeatures dfeatures = mobile.getDisplayFeatures();
			if(dfeatures != null){
				ScreenResolution resolution = dfeatures.getResolution();
				if(resolution != null){
					return resolution.getWidth();
				}
			}
		}
		return 0;

	}

}

Develop one test application to test these Domain objects.

MobileTesterWithoutOptional.java

package com.mkyong.without.optional;

public class MobileTesterWithoutOptional {
	
	public static void main(String[] args) {

		ScreenResolution resolution = new ScreenResolution(750,1334);
		DisplayFeatures dfeatures = new DisplayFeatures("4.7", resolution);
		Mobile mobile = new Mobile(2015001, "Apple", "iPhone 6s", dfeatures);
		
		MobileService mService = new MobileService();
		
		int mobileWidth = mService.getMobileScreenWidth(mobile);
		System.out.println("Apple iPhone 6s Screen Width = " + mobileWidth);
		
		ScreenResolution resolution2 = new ScreenResolution(0,0);
		DisplayFeatures dfeatures2 = new DisplayFeatures("0", resolution2);
		Mobile mobile2 = new Mobile(2015001, "Apple", "iPhone 6s", dfeatures2);		
		int mobileWidth2 = mService.getMobileScreenWidth(mobile2);
		System.out.println("Apple iPhone 16s Screen Width = " + mobileWidth2);

	}

}

Output


Apple iPhone 6s Screen Width = 750
Apple iPhone 16s Screen Width = 0

7. With Java 8 Optional
Now develop same domain models using Java 8 Optional construct with clean and neat way.

P.S ScreenResolution.java no change. Please refer above section.

DisplayFeatures.java

package com.mkyong.with.optional;

import java.util.Optional;

public class DisplayFeatures {

	private String size; // In inches
	private Optional&lt;ScreenResolution&gt; resolution;
	
	public DisplayFeatures(String size, Optional<ScreenResolution> resolution){
		this.size = size;
		this.resolution = resolution;
	}
	
	public String getSize() {
		return size;
	}
	public Optional<ScreenResolution> getResolution() {
		return resolution;
	}
	
}

Mobile.java

package com.mkyong.with.optional;

import java.util.Optional;

public class Mobile {

	private long id;
	private String brand;
	private String name;
	private Optional&lt;DisplayFeatures&gt; displayFeatures;
	// Like wise we can see MemoryFeatures, CameraFeatures etc.
	// For simplicity, using only one Features
	
	public Mobile(long id, String brand, String name, Optional&lt;DisplayFeatures&gt; displayFeatures){
		this.id = id;
		this.brand = brand;
		this.name = name;
		this.displayFeatures = displayFeatures;
	}

	public long getId() {
		return id;
	}

	public String getBrand() {
		return brand;
	}

	public String getName() {
		return name;
	}

	public Optional&lt;DisplayFeatures&gt; getDisplayFeatures() {
		return displayFeatures;
	}
	
}

Here we can observe that how clean our getMobileScreenWidth() API without null checks and boiler plate code. We don not worry about NullPointerExceptions at run-time.

MobileService.java

package com.mkyong.with.optional;

import java.util.Optional;

public class MobileService {

  public Integer getMobileScreenWidth(Optional<Mobile> mobile){
	return mobile.flatMap(Mobile::getDisplayFeatures)
		 .flatMap(DisplayFeatures::getResolution)
		 .map(ScreenResolution::getWidth)
		 .orElse(0);

  }

}

Now develop one test component

MobileTesterWithOptional.java

package com.mkyong.with.optional;

import java.util.Optional;

public class MobileTesterWithOptional {
	
  public static void main(String[] args) {
	ScreenResolution resolution = new ScreenResolution(750,1334);
	DisplayFeatures dfeatures = new DisplayFeatures("4.7", Optional.of(resolution));
	Mobile mobile = new Mobile(2015001, "Apple", "iPhone 6s", Optional.of(dfeatures));
		
	MobileService mService = new MobileService();
		
	int width = mService.getMobileScreenWidth(Optional.of(mobile));
	System.out.println("Apple iPhone 6s Screen Width = " + width);

	Mobile mobile2 = new Mobile(2015001, "Apple", "iPhone 6s", Optional.empty());		
	int width2 = mService.getMobileScreenWidth(Optional.of(mobile2));
	System.out.println("Apple iPhone 16s Screen Width = " + width2);
  }
}

Output


Apple iPhone 6s Screen Width = 750
Apple iPhone 16s Screen Width = 0

8. Where does Java Optional fits?
If we observe above real-time Retail Domain use-case, we should know that Java Optional construct is useful at the following places.

8.1 Method Parameter


public void setResolution(Optional<ScreenResolution> resolution) {
	this.resolution = resolution;
}

8.2 Method Return Type


public Optional<ScreenResolution> getResolution() {
	return resolution;
}

8.3 Constructor Parameter


public DisplayFeatures(String size, Optional<ScreenResolution> resolution){
	this.size = size;
	this.resolution = resolution;
}

8.4 Variable Declaration


private Optional<ScreenResolution> resolution;

8.5 Class Level


public class B

public class A<T extends Optional<B>> { }