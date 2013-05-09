RoBDD
=====

RoBDD stands for [Robolectric][1] BDD. It's a Robolectric BDD wrappers.

Currently is just for doing TDD with a BDD syntax inside JUnit tests.

On a future it will support [Gherkin][3] syntax.


Usage
=====

Include the library on your project and call the step you need.

     @RunWith(RobolectricTestRunner.class)
     public class MyActivityTest {
         @Test
         public void testActivity(){
             RoBDD.iShouldSee(theActivity, R.id.text_view, "the text");
         }
     }


License
=======

This software is released under GPLv3. Go to [GNU General Public License][2] site for more information.

[1]: http://pivotal.github.io/robolectric/index.html
[2]: http://www.gnu.org/licenses/gpl.html
[3]: https://github.com/cucumber/cucumber/wiki/Gherkin