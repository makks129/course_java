//package collection.networking;
//
//import collection.social_network.Group;
//import collection.social_network.GroupProfile;
//import collection.social_network.User;
//import collection.social_network.UserProfile;
//import com.google.gson.Gson;
//
//import java.util.*;
//
//public class Test {
//
//    public static void main(String[] args) {
//
//
//        User max = createUser("Maxim", 29, UserProfile.GENDER_MALE);
//        User stepa = createUser("Stepa", -1, UserProfile.GENDER_MALE);
//        User masha = createUser("Masha", -1, UserProfile.GENDER_FEMALE);
//        User kostya = createUser("Kostya", -1, UserProfile.GENDER_MALE);
//        User lena = createUser("Lena", -1, UserProfile.GENDER_FEMALE);
//        User sasha = createUser("Sasha", -1, UserProfile.GENDER_MALE);
//
//        GroupProfile groupProfile = new GroupProfile(UUID.randomUUID().toString(), "Brunoyam Java Course");
//        Group group = new Group(groupProfile, max);
//        group.addUser(stepa);
//        group.addUser(masha);
//        group.addUser(kostya);
//        group.addUser(lena);
//        group.addUser(sasha);
//        List<Group> groups = new ArrayList<>();
//        groups.add(group);
//
//        max.setGroups(groups);
//        stepa.setGroups(groups);
//        masha.setGroups(groups);
//        kostya.setGroups(groups);
//        lena.setGroups(groups);
//        sasha.setGroups(groups);
//
//
//        List<User> friends = Arrays.asList(stepa, masha, kostya, lena, sasha);
//        max.setFriends(friends);
//
//        friends = Arrays.asList(max, masha, kostya, lena, sasha);
//        stepa.setFriends(friends);
//
//        friends = Arrays.asList(stepa, max, kostya, lena, sasha);
//        masha.setFriends(friends);
//
//        friends = Arrays.asList(stepa, masha, max, lena, sasha);
//        kostya.setFriends(friends);
//
//        friends = Arrays.asList(stepa, masha, kostya, max, sasha);
//        lena.setFriends(friends);
//
//        friends = Arrays.asList(stepa, masha, kostya, lena, max);
//        sasha.setFriends(friends);
//
//
//
//        List<User> users = Arrays.asList(max, stepa, masha, kostya, lena, sasha);
//
//        String json = new Gson().toJson(users);
//        System.out.println(json);
//
//    }
//
//    private static User createUser(String name, int age, int gender) {
//        UserProfile profile = new UserProfile(UUID.randomUUID().toString(), name);
//        profile.setAge(age);
//        profile.setGender(gender);
//        return new User(profile);
//    }
//
//}
