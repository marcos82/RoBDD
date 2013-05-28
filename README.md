RoBDD
=====

[![Build Status](https://travis-ci.org/Axxiss/RoBDD.png?branch=master)](https://travis-ci.org/Axxiss/RoBDD)

RoBDD stands for Robolectric BDD.

RoBDD is the glue between [Gherkin][3] and [Robolectric][1]. Providing developers a tool to create Android apps
following BDD principles without the need to run the test on an AVD.

To avoid using this set of predefined steps wrongly, please take a look at the article  [The training wheels came off][4]


Current status
==============

Currently only some stepsdefs are defined, without Gherkin support. I intend to
add support to Gherkin in a future, right now I need to find out how to run
both cucumber and robolectric runners on the same test.

So if you know gow to do it, please get in touch.


Installation
============

1. Clone the repo.
2. Add it as a dependency into your project.
3. Start testing.


Usage
=====

Take a look to steps folder under test.


Contribute
==========

If you missing a feature or a current feature is not working correctly, you can
contribute by adding/fixing it. You just need to follow a quite simple
guidelines:

1. Comments: Relevant comments must be added.
2. Code style: Follow Android code style.
3. Test: All PRs must have tests and obviously test must pass.


License
=======

This software is released under GPLv3. Go to [GNU General Public License][2] site for more information.

[1]: http://pivotal.github.io/robolectric/index.html
[2]: http://www.gnu.org/licenses/gpl.html
[3]: https://github.com/cucumber/cucumber/wiki/Gherkin
[4]: http://aslakhellesoy.com/post/11055981222/the-training-wheels-came-off?5cc9f1c0
