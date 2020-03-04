package com.springboot.backend.apirest.auth;

public class JwtConfig {

	public static final String LLAVE_SECRETA = "alguna.clave.secreta.12345678";
	
	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\r\n" + 
			"MIIEpAIBAAKCAQEArsFhNwMS8jvIvXYgtkBSlBv4UymTl+XW9OIzfsvO/tXk0VgD\r\n" + 
			"n5B8akcw+wvIxDisaWsAOz43JnSMlEpMgUUq8zctKi4Rvu40R6k8uyI87f+FVI7X\r\n" + 
			"0O/WAoaWoDSkj4te7ekc0f3GwoyZ3wa8pjoipEAnT3Gb1ymGCo6ByFDZNNV9n96x\r\n" + 
			"+ADGLqikCl7jlXFbM1a/GedJ7oz/atQUayN78fmR/2rd3Cb9kVXJPSJll16TIZM/\r\n" + 
			"aKglma8yNo1oNph1zT96Oxf0rXYFjcliYKPVWrLnuFtfjSE8ZQpf00fNysScnb9J\r\n" + 
			"zUCGsaSPk46AHRr1WI0OFLV2CEwpI16CEXU2VQIDAQABAoIBABgqp+36n9kdyWHh\r\n" + 
			"/x4VARZ4U7v0aPO9lh9hVKu5NZPqMm181WtwiLQNykk9VPNFvxoI8QxAS1InFfW/\r\n" + 
			"3JqX3RurSrSlkFCuEk7CqaJbVr+28VJDOrcrI5ZP1G6tOQCcznDqJtEnXiAzX2gH\r\n" + 
			"P3lhWr8KHCWRWXLEzEOTd4EjJRZ4IPpY4WrHO4OHs900WF4YIndkKoEuBR7CxwK1\r\n" + 
			"aTot3tMxBYkblt2F6ZzDeNs+DJCco2yJcmsOz7IUSZW9D0JvrHLD1ZWD3bD7Y5lW\r\n" + 
			"Z7DGV6yXgdSxwMB5des7jutVXE/3iUO1+586+2m6tUyrlaw4G5L+u+8Qy4YVuR4w\r\n" + 
			"EKR+0uECgYEA4cUI4f1iAfwxxYq2mdGKuQpD59Nvils0WRiQo5e7TwYpCvk21WM9\r\n" + 
			"c3qaV84seYYfPnOotKYXs3o0J6CDxdK8PaD8Eg4nEKGcdkmDfRh4C+bhFaNClzV6\r\n" + 
			"+wfpfWBfrA3rdMB7eyv1i+95g5Ldk6ymxvAuBCT8fRBgpzJ2Sx7rEvkCgYEAxier\r\n" + 
			"lxmIMGOF1Cm5llRlnWZvk+zh8pEsl113KYrsUEGMNNKXzR9u1POlu2tuteZVurrU\r\n" + 
			"HYtALPMpeWzroumqtMj31ky0sPPIB78laT7ZQ/0QttGSFvJSjJfstWX9d9MN8Tpq\r\n" + 
			"Yfy14AuT9FI+Hoa37DkFYr/vz55e8jlpR1fKeT0CgYAWvkyYx3e6D3fMGJ8we6Vn\r\n" + 
			"4prYnbocy/dICmt3r29VFJ/J1TUq5eZo3a7yrXhZfaNkHS6flCPLFsJuQ4NCyGni\r\n" + 
			"I3eBMh/JUx555An07iQZvtZp4ZpxtReAdlmVIcJBiN1xU3qc+96ujB9Hm+HqYHgk\r\n" + 
			"jkl0bW1qA95YuYKlKqYvsQKBgQCW0XDXg5ZVhhpBHjTkB36D64h3JW/f6MDwwDHH\r\n" + 
			"S7aLayhkt/jUJd18damp2Z4dEqAjjLmPdwI0dCsYAV/j0keca+2+jQlmOVYBF2pJ\r\n" + 
			"DY3eIooLK70ue+d6nNOMSYE/J0NQXG7F/8sKKKXG6qXfJBhu0gOYYpALDPYlFK9d\r\n" + 
			"nqM73QKBgQCCPF3YDnF1SMmoJn1deVQU+oUvCdyVBSXf6PPetsrB0k8IECxDr59k\r\n" + 
			"zTxIAePm7dfYXwyommJXHiWfssO8usDybd9NWDOGne7XOabubmYj79C3sQaLCmCx\r\n" + 
			"VkD9wtQbYb+LJnO/8Ir2tFkk5Xl6HGNdBLmO0rWQSdW6snmxTj3Xpg==\r\n" + 
			"-----END RSA PRIVATE KEY-----";
	
	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n" + 
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEArsFhNwMS8jvIvXYgtkBS\r\n" + 
			"lBv4UymTl+XW9OIzfsvO/tXk0VgDn5B8akcw+wvIxDisaWsAOz43JnSMlEpMgUUq\r\n" + 
			"8zctKi4Rvu40R6k8uyI87f+FVI7X0O/WAoaWoDSkj4te7ekc0f3GwoyZ3wa8pjoi\r\n" + 
			"pEAnT3Gb1ymGCo6ByFDZNNV9n96x+ADGLqikCl7jlXFbM1a/GedJ7oz/atQUayN7\r\n" + 
			"8fmR/2rd3Cb9kVXJPSJll16TIZM/aKglma8yNo1oNph1zT96Oxf0rXYFjcliYKPV\r\n" + 
			"WrLnuFtfjSE8ZQpf00fNysScnb9JzUCGsaSPk46AHRr1WI0OFLV2CEwpI16CEXU2\r\n" + 
			"VQIDAQAB\r\n" + 
			"-----END PUBLIC KEY-----";
}
