package Builders;

import pogo.Category;
import pogo.PetStoreDog;
import pogo.TagsItem;
import java.util.Collections;
import java.util.List;

public class PetStoreDogGenerator {

    static Category category = new Category("string", 0);
    static List<String> photoUrls = Collections.singletonList("string");
    static List<TagsItem> tags = Collections.singletonList(new TagsItem("string", 0));

    public static PetStoreDog setNewDog(){
        return PetStoreDog
                .builder()
                .id(123456)
                .name("Reks")
                .tags(tags)
                .photoUrls(photoUrls)
                .category(category)
                .status("available")
                .build();
    }
}
