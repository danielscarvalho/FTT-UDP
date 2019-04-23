#Python UDP Server

import socket

UDP_IP = "127.0.0.1"
UDP_PORT = 5005
 
sock = socket.socket(socket.AF_INET, # Internet
                     socket.SOCK_DGRAM) # UDP

sock.bind((UDP_IP, UDP_PORT))

print("Python UDP Server")
 
while True:
    data, addr = sock.recvfrom(1024) # buffer size is 1024 bytes
    print("received message: ",  socket.gethostbyname(socket.gethostname()), data)

