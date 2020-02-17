package sortlambda;

import sortlambda.data.Language;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortLambda {

  public static void main( String[] argv ) {

    List<Language> languages = new ArrayList<>();

    languages.add(new Language("Java", 1995));
    languages.add(new Language("Fortran", 1957));
    languages.add(new Language("Forth", 1970));
    languages.add(new Language("C", 1972));
    languages.add(new Language("Kotlin", 2011));
    languages.add(new Language("Python", 1990));

    languages.sort( (x,y) -> x.getYear() - y.getYear() );

    System.out.println( languages );

  }

}
