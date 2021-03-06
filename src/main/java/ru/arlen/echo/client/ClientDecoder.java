// package nett.client;

// import java.nio.charset.Charset;
// import java.util.List;

// import io.netty.buffer.ByteBuf;
// import io.netty.channel.ChannelHandlerContext;
// import io.netty.handler.codec.ByteToMessageDecoder;

// /**
//  * ClientHandler
//  */
// public class ClientDecoder extends ByteToMessageDecoder { // (1)
//     @Override
//     protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) { // (2)
//         if (in.readableBytes() < 26) {
//             return; // (3)
//         }
//         System.out.println(in.readBytes(26).toString(Charset.forName("UTF-8")));
//         // out.add(in.readBytes(4)); // (4)
//     }
// }