package buildersNew;

import pogo.Category;
import pogo.PetStoreDog;
import pogo.TagsItem;

import java.util.Arrays;

public class PetStoreDogGenerator {

    public static PetStoreDog setNewDog(){
        return PetStoreDog
                .builder()
                .id(123456)
                .name("Reks")
                .tags(Arrays.asList(new TagsItem("friendly", 1), new TagsItem("playful", 2)))
                .photoUrls(Arrays.asList("www.testExample", "www.test2example"))
                .category(new Category("dogs", 1))
                .status("available")
                .build();
    }
}
