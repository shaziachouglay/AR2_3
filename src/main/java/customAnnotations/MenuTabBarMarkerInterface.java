package customAnnotations;

/**
 * This Interface is created to be implemented to enums for Navigation Options enums so method can call multiple enums through this interface as a hook.
 * e.g: class NavigationMenubar.java an Enum named BSA_SUB_TAB_MENU_OPTIONS implements this interface as a Marker Interface.
 * This allows method click_MenuTabBarOptions(MenuTabBarMarkerInterface option) to call all the enums where its implemented.
 * So Menu Option for all the sections can now implement MenuTabBarMarkerInterface and also use click_MenuTabBarOptions method.
 *
 */
public interface MenuTabBarMarkerInterface {


    default void getMenuTabBarMarkerInterfaceInfo(){
        System.out.println("Market Interface to be used for Menu tab Bar");
    }
}
