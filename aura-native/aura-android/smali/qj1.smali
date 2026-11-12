.class public final Lqj1;
.super Lbt;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final f:[B


# instance fields
.field public final b:F

.field public final c:F

.field public final d:F

.field public final e:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners"

    .line 2
    .line 3
    sget-object v1, Lf42;->a:Ljava/nio/charset/Charset;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lqj1;->f:[B

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(FFFF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lqj1;->b:F

    .line 5
    .line 6
    iput p2, p0, Lqj1;->c:F

    .line 7
    .line 8
    iput p3, p0, Lqj1;->d:F

    .line 9
    .line 10
    iput p4, p0, Lqj1;->e:F

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final b(Ljava/security/MessageDigest;)V
    .locals 2

    .line 1
    sget-object v0, Lqj1;->f:[B

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/security/MessageDigest;->update([B)V

    .line 4
    .line 5
    .line 6
    const/16 v0, 0x10

    .line 7
    .line 8
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget v1, p0, Lqj1;->b:F

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget v1, p0, Lqj1;->c:F

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget v1, p0, Lqj1;->d:F

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget p0, p0, Lqj1;->e:F

    .line 31
    .line 32
    invoke-virtual {v0, p0}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p1, p0}, Ljava/security/MessageDigest;->update([B)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final c(Lzs;Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
    .locals 2

    .line 1
    new-instance p3, Lv03;

    .line 2
    .line 3
    iget p4, p0, Lqj1;->b:F

    .line 4
    .line 5
    iget v0, p0, Lqj1;->c:F

    .line 6
    .line 7
    iget v1, p0, Lqj1;->d:F

    .line 8
    .line 9
    iget p0, p0, Lqj1;->e:F

    .line 10
    .line 11
    invoke-direct {p3, p4, v0, v1, p0}, Lv03;-><init>(FFFF)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1, p2, p3}, Lxw4;->c(Lzs;Landroid/graphics/Bitmap;Lvw4;)Landroid/graphics/Bitmap;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Lqj1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Lqj1;

    .line 7
    .line 8
    iget v0, p0, Lqj1;->b:F

    .line 9
    .line 10
    iget v2, p1, Lqj1;->b:F

    .line 11
    .line 12
    cmpl-float v0, v0, v2

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    iget v0, p0, Lqj1;->c:F

    .line 17
    .line 18
    iget v2, p1, Lqj1;->c:F

    .line 19
    .line 20
    cmpl-float v0, v0, v2

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    iget v0, p0, Lqj1;->d:F

    .line 25
    .line 26
    iget v2, p1, Lqj1;->d:F

    .line 27
    .line 28
    cmpl-float v0, v0, v2

    .line 29
    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    iget p0, p0, Lqj1;->e:F

    .line 33
    .line 34
    iget p1, p1, Lqj1;->e:F

    .line 35
    .line 36
    cmpl-float p0, p0, p1

    .line 37
    .line 38
    if-nez p0, :cond_0

    .line 39
    .line 40
    const/4 p0, 0x1

    .line 41
    return p0

    .line 42
    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Lqj1;->b:F

    .line 2
    .line 3
    const/16 v1, 0x11

    .line 4
    .line 5
    invoke-static {v1, v0}, Le35;->D(IF)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const v1, -0x78051026

    .line 10
    .line 11
    .line 12
    invoke-static {v1, v0}, Le35;->E(II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v1, p0, Lqj1;->c:F

    .line 17
    .line 18
    invoke-static {v0, v1}, Le35;->D(IF)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v1, p0, Lqj1;->d:F

    .line 23
    .line 24
    invoke-static {v0, v1}, Le35;->D(IF)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget p0, p0, Lqj1;->e:F

    .line 29
    .line 30
    invoke-static {v0, p0}, Le35;->D(IF)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    return p0
.end method
