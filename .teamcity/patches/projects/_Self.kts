package patches.projects

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.GitHubIssueTracker
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.githubIssues
import jetbrains.buildServer.configs.kotlin.v2019_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the root project
accordingly, and delete the patch script.
*/
changeProject(DslContext.projectId) {
    params {
        add {
            password("env.KEYSTORE_URL", "credentialsJSON:a7ae1c82-8058-4061-8d12-7f6bc2618d2e", display = ParameterDisplay.HIDDEN)
        }
        add {
            password("env.KEYSTORE_PASSWORD", "credentialsJSON:d7b964e3-a1fd-47a8-b892-6f601fe47479", display = ParameterDisplay.HIDDEN)
        }
    }

    features {
        val feature1 = find<GitHubIssueTracker> {
            githubIssues {
                id = "MinecraftForge_MinecraftForge__IssueTracker"
                displayName = "MinecraftForge/MinecraftForge"
                repositoryURL = "https://github.com/MinecraftForge/MinecraftForge"
            }
        }
        feature1.apply {
        }
    }
}