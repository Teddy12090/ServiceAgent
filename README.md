# Environment

1. Append the path contains `adb` into the environment variable `Path`.
   - Android\sdk\platform-tools

# Execution

```shell
# open wifi
$adb shell am startservice [Arguments] taipeitech.ssl.serviceagent/.AgentService
```

## Wifi

| Description | Argument                             |
|:
| Open wifi   | -a setWifiEnabled --ez enabled true  |
| Close wifi  | -a setWifiEnabled --ez enabled false |

```shell
# open wifi
$adb shell am startservice -a setWifiEnabled --ez enabled true taipeitech.ssl.serviceagent/.AgentService

# close wifi
$adb shell am startservice -a setWifiEnabled --ez enabled false taipeitech.ssl.serviceagent/.AgentService
```
