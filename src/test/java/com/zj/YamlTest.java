package com.zj;

import com.zj.model.Person;
import org.junit.Test;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.LinkedHashMap;

/**
 * Created by zhangjun on 17/4/6.
 */
public class YamlTest {

    @Test
    public void testLoad() throws FileNotFoundException {
        URL url =  YamlTest.class.getClassLoader().getResource("John.yaml");
        File file = new File(url.getFile());
        Yaml yaml = new Yaml();
        Object load = yaml.load(new FileInputStream(file));
        System.out.println(load.getClass());
        System.out.println(((LinkedHashMap)load).get("name"));
        System.out.println(yaml.dump(load));
    }

    @Test
    public void testLoadWithClass() throws FileNotFoundException {
        URL url =  YamlTest.class.getClassLoader().getResource("John.yaml");
        File file = new File(url.getFile());
        Yaml yaml = new Yaml();
        Person person = yaml.loadAs(new FileInputStream(file),Person.class);
        System.out.println(person.getName());
    }

    @Test
    public void testOptions(){
        Person john = createPerson();
        DumperOptions options = new DumperOptions();
        options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
        Yaml yaml = new Yaml(options);
        String dump = yaml.dump(john);
        System.out.println(dump);
    }

    @Test
    public void testCountDoc() throws FileNotFoundException{
        URL url =  YamlTest.class.getClassLoader().getResource("John.yaml");
        File file = new File(url.getFile());
        Yaml yaml = new Yaml();
        int counter = 0;
        for (Object data : yaml.loadAll(new FileInputStream(file))) {
            System.out.println(((LinkedHashMap)data).get("spring"));
            counter++;
        }
        System.out.println(counter);
    }


    private Person createPerson(){
        Person john = new Person();
        john.setAge(37);
        john.setName("John Smith");
        Person sponse = new Person();
        sponse.setName("Jane Smith");
        sponse.setAge(25);
        john.setSpouse(sponse);
        Person[] children = {new Person(), new Person()};
        children[0].setName("Jimmy Smith");
        children[0].setAge(15);
        children[1].setName("Jenny Smith666");
        children[1].setAge(12);
        john.setChildren(children);
        return john;
    }


}
