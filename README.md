# alt_tabber

Running the program:
1. Open the program called "alternate_tabber_test"
2. At the top bar, press the little black down arrow next to the green/white arrow button (run button)
3. Select Run As -> Java Application

Keys: 
- 1 for alt-tab
- 2 for ctrl-windows-left (switch to left window)
- 3 for ctrl-windows-right (switch to right window)

Setup in Eclipse:
1. Open Eclipse
2. Go to File -> Import
3. Choose Git -> Project from Git
4. Choose Clone URI (skip this step if you don't see this page)
5. Go to the Connection -> Protocol, and choose https
6. Paste into the URI blank: https://github.com/zanzan13531/alt_tabber.git
7. The two spaces below it should auto-fill
8. Then just keep pressing next, and once you can, press finish
9. You are ready to run it, see instructions above

Ignore all the rest of the files, but if you must know:
- Main.java: The main runnable file (runs the UI)
- UI.java: A UI that I'm going to keep working 
- tabber.java: The original alt-tabber program, it might still work
- globalListenerTest: The original global key listener example that I used

This project uses the JNativeHook library: https://github.com/kwhat/jnativehook
