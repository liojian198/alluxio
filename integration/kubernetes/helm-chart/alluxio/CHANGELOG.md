0.1.0

- Init support
- Modularized the directory structure
- Java and docker native integration(Consider memory, https://developers.redhat.com/blog/2017/03/14/java-inside-docker/)
- Made more configurable, like node selector, tolerance

0.2.0

- Two choices to decide short circuit: copying from directory directly or unix socket
- Simplified tiered storage (Combine alluxio properties and Persistent volume)
- Use init container to do format /no format with intelligence
- Fuse daemonset

0.3.0

- Both support one layer contains multiple storages(https://docs.alluxio.io/os/user/stable/en/advanced/Alluxio-Storage-Management.html#single-tier-storage) and multiple layers

0.4.0

- Added local time zone

0.5.0

- Merged with Alluxio Helm chart structure
- Added multiple template directories for sample use cases
- Merged helm-generate.sh which generates the templates 


0.5.1

- Fix tiered store issue
- Fix the issue of the user group of worker is not configurable

0.5.2

- Fix apiVersion key in Chart.yaml
