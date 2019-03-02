package pl.mpas.advanced_programming.abstract_class.comparing.ref_method;

import pl.mpas.advanced_programming.abstract_class.comparing.Auto;

public class CompareByBrand {

   public int orderByBrand(Auto first, Auto second){
       return first.getBrand().compareTo(second.getBrand());
    }

}
