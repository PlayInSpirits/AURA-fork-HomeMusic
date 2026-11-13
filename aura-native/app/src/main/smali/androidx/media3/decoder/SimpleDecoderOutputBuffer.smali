.class public final Landroidx/media3/decoder/SimpleDecoderOutputBuffer;
.super Ldefpackage/dj0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final s:Landroidx/media3/decoder/ffmpeg/a;

.field public t:Ljava/nio/ByteBuffer;


# direct methods
.method public constructor <init>(Landroidx/media3/decoder/ffmpeg/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ldefpackage/uv;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;->s:Landroidx/media3/decoder/ffmpeg/a;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final r()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ldefpackage/uv;->o:I

    .line 3
    .line 4
    const-wide/16 v1, 0x0

    .line 5
    .line 6
    iput-wide v1, p0, Ldefpackage/dj0;->p:J

    .line 7
    .line 8
    iput v0, p0, Ldefpackage/dj0;->q:I

    .line 9
    .line 10
    iput-boolean v0, p0, Ldefpackage/dj0;->r:Z

    .line 11
    .line 12
    iget-object p0, p0, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;->t:Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final s()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;->s:Landroidx/media3/decoder/ffmpeg/a;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/media3/decoder/ffmpeg/a;->a:Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Ldefpackage/ve4;->n(Ldefpackage/dj0;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
