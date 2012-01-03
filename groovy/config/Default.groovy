import javax.vecmath.Vector2f
import org.lwjgl.opengl.DisplayMode
import org.lwjgl.opengl.PixelFormat

System {

    versionTag = "Pre Alpha"

    // Max amount of particles
    maxParticles = 256

    // Size of the dynamic cloud texture
    cloudResolution = new Vector2f(64, 64)

    // Cloud update interval in ms
    cloudUpdateInterval = (Integer) 1000

    // Defines the maximum amount of threads used for chunk generation
    maxThreads = 1

    // Enable/or disable the persisting of chunks
    saveChunks = true

    // Size of the chunk cache
    chunkCacheSize = 1024 + 512

    Debug {

        debug = false
        debugCollision = false

        renderChunkBoundingBoxes = false

        demoFlight = false
        godMode = false

    }
}

Graphics {

    // Synchronizes the Display to the given amount of FPS
    // Disabled if a value <= 0 is provided
    fpsLimit = 0

    gamma = 2.2d
    animatedWaterAndGrass = true

    pixelFormat = new PixelFormat().withDepthBits(24)
    displayMode = new DisplayMode(1280, 720)

    aspectRatio = 16.0d / 9.0d

    fullscreen = false

    viewingDistanceNear = 8
    viewingDistanceModerate = 16
    viewingDistanceFar = 24
    viewingDistanceUltra = 32

    // Splits chunk meshes into multiple sub-meshes to support frustum and occlusion culling techniques
    verticalChunkMeshSegments = 8

}

Physics {
    generatePhysicsMeshes = true
}

HUD {

    crosshair = true
    placingBox = true

}

Controls {

    mouseSens = 0.075d

}

Player {

    fov = 80.0d

    cameraBobbing = true

    maxGravity = 1.0d
    maxGravitySwimming = 0.04d

    gravity = 0.008d
    gravitySwimming = gravity * 4d;

    friction = 0.08d

    walkingSpeed = 0.04d
    runningFactor = 1.8d
    jumpIntensity = 0.16d

}

World {

    spawnOrigin = new Vector2f(-24429, 20547)

    defaultSeed = "Blockmania42"

    dayNightLengthInMs = new Long((60 * 1000) * 20) // 20 minutes in ms
    initialTimeOffsetInMs = new Long(60 * 1000) // 120 seconds in ms

    Biomes {

        Forest {

            grassDensity = 0.3d

        }

        Plains {

            grassDensity = 0.1d

        }

        Snow {

            grassDensity = 0.001d

        }

        Mountains {

            grassDensity = 0.2d

        }

        Desert {

            grassDensity = 0.001d

        }

    }
}
