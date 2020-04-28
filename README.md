# Weft
Weft is an open source project project that aims to provide a set of [Unpick definitions](https://github.com/WeaveMC/unpick/wiki/Unpick-Format) that covers every inlined constant in the Minecraft: Java Edition codebase. The intent is to make it easier for modders to understand the decompiled code, making mod creation a little bit easier.

### Usage
#### Weft
The only way to apply sets of Unpick definitions (e.g Weft) right now is [Warp](https://github.com/WeaveMC/warp), an addon for [Fabric's](https://github.com/FabricMC) Gradle plugin, [Loom](https://github.com/FabricMC/fabric-loom). No equivalent for ForgeGradle is currently available.

#### Weft Constant Library
Minecraft constants, such as the setBlockState() flags, have their backing fields in the Weft Constant Library, as the compiler has optimised the fields out of the Minecraft binary. Warp fetches the WCL automatically for its own use when decompiling, but it does not put the WCL on the classpath.  
To put the WCL on the classpath so you can use its constants in code you write, add the following to your Gradle dependencies.  
`compileOnly 'io.github.weavemc:weft:<weft version here>:constants'`  
Note that this only creates a compile time dependency, due to inlining, the WCL will not be required at runtime.

### Contributing
See [here](https://github.com/WeaveMC/weft/wiki/Contributing)

### Discord
If you need support with warp or weft, you can find it [here](https://discordapp.com/invite/NSUCTCK).
