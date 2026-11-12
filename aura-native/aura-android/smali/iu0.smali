.class public final Liu0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final f:Lab3;

.field public static final g:Lab3;

.field public static final h:Lab3;

.field public static final i:Lab3;

.field public static final j:Lom0;

.field public static final k:Ljava/util/ArrayDeque;


# instance fields
.field public final a:Lzs;

.field public final b:Landroid/util/DisplayMetrics;

.field public final c:Lqj0;

.field public final d:Ljava/util/ArrayList;

.field public final e:Lll1;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-string v0, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat"

    .line 2
    .line 3
    sget-object v1, Lvi0;->p:Lvi0;

    .line 4
    .line 5
    invoke-static {v1, v0}, Lab3;->a(Ljava/lang/Object;Ljava/lang/String;)Lab3;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Liu0;->f:Lab3;

    .line 10
    .line 11
    new-instance v0, Lab3;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    sget-object v2, Lab3;->e:Ltv1;

    .line 15
    .line 16
    const-string v3, "com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace"

    .line 17
    .line 18
    invoke-direct {v0, v3, v1, v2}, Lab3;-><init>(Ljava/lang/String;Ljava/lang/Object;Lza3;)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Liu0;->g:Lab3;

    .line 22
    .line 23
    sget-object v0, Lgu0;->b:Lgu0;

    .line 24
    .line 25
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 26
    .line 27
    const-string v1, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize"

    .line 28
    .line 29
    invoke-static {v0, v1}, Lab3;->a(Ljava/lang/Object;Ljava/lang/String;)Lab3;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    sput-object v1, Liu0;->h:Lab3;

    .line 34
    .line 35
    const-string v1, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode"

    .line 36
    .line 37
    invoke-static {v0, v1}, Lab3;->a(Ljava/lang/Object;Ljava/lang/String;)Lab3;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, Liu0;->i:Lab3;

    .line 42
    .line 43
    new-instance v0, Ljava/util/HashSet;

    .line 44
    .line 45
    const-string v1, "image/vnd.wap.wbmp"

    .line 46
    .line 47
    const-string v2, "image/x-ico"

    .line 48
    .line 49
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 58
    .line 59
    .line 60
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 61
    .line 62
    .line 63
    new-instance v0, Lom0;

    .line 64
    .line 65
    const/16 v1, 0xa

    .line 66
    .line 67
    invoke-direct {v0, v1}, Lom0;-><init>(I)V

    .line 68
    .line 69
    .line 70
    sput-object v0, Liu0;->j:Lom0;

    .line 71
    .line 72
    sget-object v0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->JPEG:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 73
    .line 74
    sget-object v1, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->PNG_A:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 75
    .line 76
    sget-object v2, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->PNG:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 77
    .line 78
    invoke-static {v0, v1, v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 83
    .line 84
    .line 85
    new-instance v0, Ljava/util/ArrayDeque;

    .line 86
    .line 87
    const/4 v1, 0x0

    .line 88
    invoke-direct {v0, v1}, Ljava/util/ArrayDeque;-><init>(I)V

    .line 89
    .line 90
    .line 91
    sput-object v0, Liu0;->k:Ljava/util/ArrayDeque;

    .line 92
    .line 93
    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;Landroid/util/DisplayMetrics;Lzs;Lqj0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lll1;->a()Lll1;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Liu0;->e:Lll1;

    .line 9
    .line 10
    iput-object p1, p0, Liu0;->d:Ljava/util/ArrayList;

    .line 11
    .line 12
    const-string p1, "Argument must not be null"

    .line 13
    .line 14
    invoke-static {p2, p1}, Lh12;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, Liu0;->b:Landroid/util/DisplayMetrics;

    .line 18
    .line 19
    invoke-static {p3, p1}, Lh12;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iput-object p3, p0, Liu0;->a:Lzs;

    .line 23
    .line 24
    invoke-static {p4, p1}, Lh12;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iput-object p4, p0, Liu0;->c:Lqj0;

    .line 28
    .line 29
    return-void
.end method

.method public static c(Law1;Landroid/graphics/BitmapFactory$Options;Lhu0;Lzs;)Landroid/graphics/Bitmap;
    .locals 9

    .line 1
    const-string v0, "Downsampler"

    .line 2
    .line 3
    iget-boolean v1, p1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    invoke-interface {p2}, Lhu0;->x()V

    .line 8
    .line 9
    .line 10
    invoke-interface {p0}, Law1;->k()V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget v1, p1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 14
    .line 15
    iget v2, p1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 16
    .line 17
    iget-object v3, p1, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    .line 18
    .line 19
    sget-object v4, Lxw4;->b:Ljava/util/concurrent/locks/Lock;

    .line 20
    .line 21
    invoke-interface {v4}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 22
    .line 23
    .line 24
    :try_start_0
    invoke-interface {p0, p1}, Law1;->i(Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 25
    .line 26
    .line 27
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    invoke-interface {v4}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 29
    .line 30
    .line 31
    return-object p0

    .line 32
    :catch_0
    move-exception v4

    .line 33
    :try_start_1
    new-instance v5, Ljava/io/IOException;

    .line 34
    .line 35
    const-string v6, "Exception decoding bitmap, outWidth: "

    .line 36
    .line 37
    const-string v7, ", outHeight: "

    .line 38
    .line 39
    const-string v8, ", outMimeType: "

    .line 40
    .line 41
    invoke-static {v6, v7, v1, v2, v8}, Lb11;->t(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v2, ", inBitmap: "

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    iget-object v2, p1, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;

    .line 54
    .line 55
    invoke-static {v2}, Liu0;->d(Landroid/graphics/Bitmap;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-direct {v5, v1, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    const/4 v1, 0x3

    .line 70
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-eqz v1, :cond_1

    .line 75
    .line 76
    const-string v1, "Failed to decode with inBitmap, trying again without Bitmap re-use"

    .line 77
    .line 78
    invoke-static {v0, v1, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 79
    .line 80
    .line 81
    :cond_1
    iget-object v0, p1, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 82
    .line 83
    if-eqz v0, :cond_2

    .line 84
    .line 85
    :try_start_2
    invoke-interface {p3, v0}, Lzs;->d(Landroid/graphics/Bitmap;)V

    .line 86
    .line 87
    .line 88
    const/4 v0, 0x0

    .line 89
    iput-object v0, p1, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;

    .line 90
    .line 91
    invoke-static {p0, p1, p2, p3}, Liu0;->c(Law1;Landroid/graphics/BitmapFactory$Options;Lhu0;Lzs;)Landroid/graphics/Bitmap;

    .line 92
    .line 93
    .line 94
    move-result-object p0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 95
    sget-object p1, Lxw4;->b:Ljava/util/concurrent/locks/Lock;

    .line 96
    .line 97
    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 98
    .line 99
    .line 100
    return-object p0

    .line 101
    :catch_1
    :try_start_3
    throw v5

    .line 102
    :cond_2
    throw v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 103
    :catchall_0
    move-exception p0

    .line 104
    sget-object p1, Lxw4;->b:Ljava/util/concurrent/locks/Lock;

    .line 105
    .line 106
    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 107
    .line 108
    .line 109
    throw p0
.end method

.method public static d(Landroid/graphics/Bitmap;)Ljava/lang/String;
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v1, " ("

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v1, ")"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    new-instance v1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v2, "["

    .line 31
    .line 32
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v2, "x"

    .line 43
    .line 44
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v2, "] "

    .line 55
    .line 56
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0
.end method

.method public static e(Landroid/graphics/BitmapFactory$Options;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Landroid/graphics/BitmapFactory$Options;->inTempStorage:[B

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iput-boolean v1, p0, Landroid/graphics/BitmapFactory$Options;->inDither:Z

    .line 6
    .line 7
    iput-boolean v1, p0, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    iput v2, p0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 11
    .line 12
    iput-object v0, p0, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 13
    .line 14
    iput-boolean v1, p0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 15
    .line 16
    iput v1, p0, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 17
    .line 18
    iput v1, p0, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 19
    .line 20
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 21
    .line 22
    const/16 v4, 0x1a

    .line 23
    .line 24
    if-lt v3, v4, :cond_0

    .line 25
    .line 26
    invoke-static {p0}, Lgm0;->r(Landroid/graphics/BitmapFactory$Options;)V

    .line 27
    .line 28
    .line 29
    invoke-static {p0}, Lgm0;->A(Landroid/graphics/BitmapFactory$Options;)V

    .line 30
    .line 31
    .line 32
    invoke-static {p0}, Lgm0;->D(Landroid/graphics/BitmapFactory$Options;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    iput v1, p0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 36
    .line 37
    iput v1, p0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 38
    .line 39
    iput-object v0, p0, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    .line 40
    .line 41
    iput-object v0, p0, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;

    .line 42
    .line 43
    iput-boolean v2, p0, Landroid/graphics/BitmapFactory$Options;->inMutable:Z

    .line 44
    .line 45
    return-void
.end method


# virtual methods
.method public final a(Law1;IILdb3;Lhu0;)Lat;
    .locals 14

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    iget-object v2, p0, Liu0;->c:Lqj0;

    .line 4
    .line 5
    const/high16 v3, 0x10000

    .line 6
    .line 7
    const-class v4, [B

    .line 8
    .line 9
    invoke-virtual {v2, v3, v4}, Lqj0;->d(ILjava/lang/Class;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    move-object v12, v2

    .line 14
    check-cast v12, [B

    .line 15
    .line 16
    const-class v2, Liu0;

    .line 17
    .line 18
    monitor-enter v2

    .line 19
    :try_start_0
    sget-object v13, Liu0;->k:Ljava/util/ArrayDeque;

    .line 20
    .line 21
    monitor-enter v13
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    :try_start_1
    invoke-virtual {v13}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Landroid/graphics/BitmapFactory$Options;

    .line 27
    .line 28
    monitor-exit v13
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 29
    if-nez v3, :cond_0

    .line 30
    .line 31
    :try_start_2
    new-instance v3, Landroid/graphics/BitmapFactory$Options;

    .line 32
    .line 33
    invoke-direct {v3}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-static {v3}, Liu0;->e(Landroid/graphics/BitmapFactory$Options;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    goto/16 :goto_3

    .line 42
    .line 43
    :cond_0
    :goto_0
    monitor-exit v2

    .line 44
    iput-object v12, v3, Landroid/graphics/BitmapFactory$Options;->inTempStorage:[B

    .line 45
    .line 46
    sget-object v2, Liu0;->f:Lab3;

    .line 47
    .line 48
    invoke-virtual {v0, v2}, Ldb3;->c(Lab3;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    move-object v5, v2

    .line 53
    check-cast v5, Lvi0;

    .line 54
    .line 55
    sget-object v2, Liu0;->g:Lab3;

    .line 56
    .line 57
    invoke-virtual {v0, v2}, Ldb3;->c(Lab3;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    move-object v6, v2

    .line 62
    check-cast v6, Ltp3;

    .line 63
    .line 64
    sget-object v2, Lgu0;->g:Lab3;

    .line 65
    .line 66
    invoke-virtual {v0, v2}, Ldb3;->c(Lab3;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    move-object v4, v2

    .line 71
    check-cast v4, Lgu0;

    .line 72
    .line 73
    sget-object v2, Liu0;->h:Lab3;

    .line 74
    .line 75
    invoke-virtual {v0, v2}, Ldb3;->c(Lab3;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    check-cast v2, Ljava/lang/Boolean;

    .line 80
    .line 81
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 82
    .line 83
    .line 84
    move-result v10

    .line 85
    sget-object v2, Liu0;->i:Lab3;

    .line 86
    .line 87
    invoke-virtual {v0, v2}, Ldb3;->c(Lab3;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    if-eqz v7, :cond_1

    .line 92
    .line 93
    invoke-virtual {v0, v2}, Ldb3;->c(Lab3;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    check-cast v0, Ljava/lang/Boolean;

    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_1

    .line 104
    .line 105
    const/4 v0, 0x1

    .line 106
    :goto_1
    move-object v1, p0

    .line 107
    move-object v2, p1

    .line 108
    move/from16 v8, p2

    .line 109
    .line 110
    move/from16 v9, p3

    .line 111
    .line 112
    move-object/from16 v11, p5

    .line 113
    .line 114
    move v7, v0

    .line 115
    goto :goto_2

    .line 116
    :cond_1
    const/4 v0, 0x0

    .line 117
    goto :goto_1

    .line 118
    :goto_2
    :try_start_3
    invoke-virtual/range {v1 .. v11}, Liu0;->b(Law1;Landroid/graphics/BitmapFactory$Options;Lgu0;Lvi0;Ltp3;ZIIZLhu0;)Landroid/graphics/Bitmap;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    iget-object v2, p0, Liu0;->a:Lzs;

    .line 123
    .line 124
    invoke-static {v2, v0}, Lat;->c(Lzs;Landroid/graphics/Bitmap;)Lat;

    .line 125
    .line 126
    .line 127
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 128
    invoke-static {v3}, Liu0;->e(Landroid/graphics/BitmapFactory$Options;)V

    .line 129
    .line 130
    .line 131
    monitor-enter v13

    .line 132
    :try_start_4
    invoke-virtual {v13, v3}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    monitor-exit v13
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 136
    iget-object v1, p0, Liu0;->c:Lqj0;

    .line 137
    .line 138
    invoke-virtual {v1, v12}, Lqj0;->h(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    return-object v0

    .line 142
    :catchall_1
    move-exception v0

    .line 143
    :try_start_5
    monitor-exit v13
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 144
    throw v0

    .line 145
    :catchall_2
    move-exception v0

    .line 146
    invoke-static {v3}, Liu0;->e(Landroid/graphics/BitmapFactory$Options;)V

    .line 147
    .line 148
    .line 149
    sget-object v4, Liu0;->k:Ljava/util/ArrayDeque;

    .line 150
    .line 151
    monitor-enter v4

    .line 152
    :try_start_6
    invoke-virtual {v4, v3}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    monitor-exit v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 156
    iget-object v1, p0, Liu0;->c:Lqj0;

    .line 157
    .line 158
    invoke-virtual {v1, v12}, Lqj0;->h(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    throw v0

    .line 162
    :catchall_3
    move-exception v0

    .line 163
    :try_start_7
    monitor-exit v4
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 164
    throw v0

    .line 165
    :catchall_4
    move-exception v0

    .line 166
    :try_start_8
    monitor-exit v13
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 167
    :try_start_9
    throw v0

    .line 168
    :goto_3
    monitor-exit v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 169
    throw v0
.end method

.method public final b(Law1;Landroid/graphics/BitmapFactory$Options;Lgu0;Lvi0;Ltp3;ZIIZLhu0;)Landroid/graphics/Bitmap;
    .locals 41

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v0, p3

    .line 8
    .line 9
    move/from16 v6, p7

    .line 10
    .line 11
    move/from16 v7, p8

    .line 12
    .line 13
    move-object/from16 v8, p10

    .line 14
    .line 15
    sget v9, Lee2;->b:I

    .line 16
    .line 17
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 18
    .line 19
    .line 20
    move-result-wide v9

    .line 21
    const/4 v11, 0x1

    .line 22
    iput-boolean v11, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 23
    .line 24
    iget-object v12, v1, Liu0;->a:Lzs;

    .line 25
    .line 26
    invoke-static {v2, v3, v8, v12}, Liu0;->c(Law1;Landroid/graphics/BitmapFactory$Options;Lhu0;Lzs;)Landroid/graphics/Bitmap;

    .line 27
    .line 28
    .line 29
    const/4 v13, 0x0

    .line 30
    iput-boolean v13, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 31
    .line 32
    iget v14, v3, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 33
    .line 34
    iget v15, v3, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 35
    .line 36
    filled-new-array {v14, v15}, [I

    .line 37
    .line 38
    .line 39
    move-result-object v14

    .line 40
    aget v15, v14, v13

    .line 41
    .line 42
    aget v14, v14, v11

    .line 43
    .line 44
    iget-object v13, v3, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    .line 45
    .line 46
    const/4 v11, -0x1

    .line 47
    if-eq v15, v11, :cond_1

    .line 48
    .line 49
    if-ne v14, v11, :cond_0

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    move/from16 v11, p6

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    :goto_0
    const/4 v11, 0x0

    .line 56
    :goto_1
    invoke-interface {v2}, Law1;->c()I

    .line 57
    .line 58
    .line 59
    move-result v16

    .line 60
    move-wide/from16 v17, v9

    .line 61
    .line 62
    const/16 v9, 0x5a

    .line 63
    .line 64
    packed-switch v16, :pswitch_data_0

    .line 65
    .line 66
    .line 67
    const/4 v10, 0x0

    .line 68
    goto :goto_2

    .line 69
    :pswitch_0
    const/16 v10, 0x10e

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :pswitch_1
    move v10, v9

    .line 73
    goto :goto_2

    .line 74
    :pswitch_2
    const/16 v19, 0xb4

    .line 75
    .line 76
    move/from16 v10, v19

    .line 77
    .line 78
    :goto_2
    packed-switch v16, :pswitch_data_1

    .line 79
    .line 80
    .line 81
    const/16 v20, 0x0

    .line 82
    .line 83
    :goto_3
    move-object/from16 v19, v13

    .line 84
    .line 85
    goto :goto_4

    .line 86
    :pswitch_3
    const/16 v20, 0x1

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :goto_4
    const/high16 v13, -0x80000000

    .line 90
    .line 91
    if-ne v6, v13, :cond_4

    .line 92
    .line 93
    if-eq v10, v9, :cond_3

    .line 94
    .line 95
    const/16 v9, 0x10e

    .line 96
    .line 97
    if-ne v10, v9, :cond_2

    .line 98
    .line 99
    goto :goto_5

    .line 100
    :cond_2
    move/from16 v22, v15

    .line 101
    .line 102
    goto :goto_6

    .line 103
    :cond_3
    const/16 v9, 0x10e

    .line 104
    .line 105
    :goto_5
    move/from16 v22, v14

    .line 106
    .line 107
    goto :goto_6

    .line 108
    :cond_4
    const/16 v9, 0x10e

    .line 109
    .line 110
    move/from16 v22, v6

    .line 111
    .line 112
    :goto_6
    if-ne v7, v13, :cond_7

    .line 113
    .line 114
    const/16 v13, 0x5a

    .line 115
    .line 116
    if-eq v10, v13, :cond_6

    .line 117
    .line 118
    if-ne v10, v9, :cond_5

    .line 119
    .line 120
    goto :goto_7

    .line 121
    :cond_5
    move v9, v14

    .line 122
    goto :goto_8

    .line 123
    :cond_6
    :goto_7
    move v9, v15

    .line 124
    goto :goto_8

    .line 125
    :cond_7
    move v9, v7

    .line 126
    :goto_8
    invoke-interface {v2}, Law1;->l()Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 127
    .line 128
    .line 129
    move-result-object v13

    .line 130
    const/16 v23, 0x0

    .line 131
    .line 132
    const-string v7, ", target density: "

    .line 133
    .line 134
    const/16 v24, 0x0

    .line 135
    .line 136
    const-string v6, ", density: "

    .line 137
    .line 138
    const/high16 v25, 0x3f800000    # 1.0f

    .line 139
    .line 140
    const-string v5, "x"

    .line 141
    .line 142
    const-string v4, "Downsampler"

    .line 143
    .line 144
    move/from16 v26, v11

    .line 145
    .line 146
    const-string v11, "]"

    .line 147
    .line 148
    if-lez v15, :cond_8

    .line 149
    .line 150
    if-gtz v14, :cond_9

    .line 151
    .line 152
    :cond_8
    move-object v0, v7

    .line 153
    move-object v7, v6

    .line 154
    move-object v6, v0

    .line 155
    move-object v0, v11

    .line 156
    move-object/from16 v29, v12

    .line 157
    .line 158
    move/from16 v1, v22

    .line 159
    .line 160
    const/4 v10, 0x3

    .line 161
    goto/16 :goto_16

    .line 162
    .line 163
    :cond_9
    const/16 v1, 0x5a

    .line 164
    .line 165
    if-eq v10, v1, :cond_b

    .line 166
    .line 167
    const/16 v1, 0x10e

    .line 168
    .line 169
    if-ne v10, v1, :cond_a

    .line 170
    .line 171
    goto :goto_a

    .line 172
    :cond_a
    move-object/from16 v21, v6

    .line 173
    .line 174
    move-object/from16 p6, v11

    .line 175
    .line 176
    move v6, v14

    .line 177
    move v11, v15

    .line 178
    :goto_9
    move/from16 v1, v22

    .line 179
    .line 180
    move-object/from16 v22, v7

    .line 181
    .line 182
    goto :goto_b

    .line 183
    :cond_b
    :goto_a
    move-object/from16 v21, v6

    .line 184
    .line 185
    move-object/from16 p6, v11

    .line 186
    .line 187
    move v11, v14

    .line 188
    move v6, v15

    .line 189
    goto :goto_9

    .line 190
    :goto_b
    invoke-virtual {v0, v11, v6, v1, v9}, Lgu0;->b(IIII)F

    .line 191
    .line 192
    .line 193
    move-result v7

    .line 194
    cmpg-float v27, v7, v24

    .line 195
    .line 196
    if-lez v27, :cond_1b

    .line 197
    .line 198
    move/from16 v27, v7

    .line 199
    .line 200
    invoke-virtual {v0, v11, v6, v1, v9}, Lgu0;->a(IIII)I

    .line 201
    .line 202
    .line 203
    move-result v7

    .line 204
    if-eqz v7, :cond_1a

    .line 205
    .line 206
    move/from16 v28, v10

    .line 207
    .line 208
    int-to-float v10, v11

    .line 209
    move/from16 p6, v10

    .line 210
    .line 211
    mul-float v10, v27, p6

    .line 212
    .line 213
    move/from16 v29, v11

    .line 214
    .line 215
    float-to-double v10, v10

    .line 216
    const-wide/high16 v30, 0x3fe0000000000000L    # 0.5

    .line 217
    .line 218
    add-double v10, v10, v30

    .line 219
    .line 220
    double-to-int v10, v10

    .line 221
    int-to-float v11, v6

    .line 222
    move/from16 v32, v6

    .line 223
    .line 224
    mul-float v6, v27, v11

    .line 225
    .line 226
    move/from16 v33, v10

    .line 227
    .line 228
    move/from16 v34, v11

    .line 229
    .line 230
    float-to-double v10, v6

    .line 231
    add-double v10, v10, v30

    .line 232
    .line 233
    double-to-int v6, v10

    .line 234
    div-int v11, v29, v33

    .line 235
    .line 236
    div-int v6, v32, v6

    .line 237
    .line 238
    const/4 v10, 0x1

    .line 239
    if-ne v7, v10, :cond_c

    .line 240
    .line 241
    invoke-static {v11, v6}, Ljava/lang/Math;->max(II)I

    .line 242
    .line 243
    .line 244
    move-result v6

    .line 245
    goto :goto_c

    .line 246
    :cond_c
    invoke-static {v11, v6}, Ljava/lang/Math;->min(II)I

    .line 247
    .line 248
    .line 249
    move-result v6

    .line 250
    :goto_c
    invoke-static {v6}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 251
    .line 252
    .line 253
    move-result v6

    .line 254
    invoke-static {v10, v6}, Ljava/lang/Math;->max(II)I

    .line 255
    .line 256
    .line 257
    move-result v6

    .line 258
    if-ne v7, v10, :cond_d

    .line 259
    .line 260
    int-to-float v7, v6

    .line 261
    div-float v10, v25, v27

    .line 262
    .line 263
    cmpg-float v7, v7, v10

    .line 264
    .line 265
    if-gez v7, :cond_d

    .line 266
    .line 267
    shl-int/lit8 v6, v6, 0x1

    .line 268
    .line 269
    :cond_d
    iput v6, v3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 270
    .line 271
    sget-object v7, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->JPEG:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 272
    .line 273
    if-ne v13, v7, :cond_e

    .line 274
    .line 275
    const/16 v7, 0x8

    .line 276
    .line 277
    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    .line 278
    .line 279
    .line 280
    move-result v7

    .line 281
    int-to-float v7, v7

    .line 282
    div-float v10, p6, v7

    .line 283
    .line 284
    float-to-double v10, v10

    .line 285
    invoke-static {v10, v11}, Ljava/lang/Math;->ceil(D)D

    .line 286
    .line 287
    .line 288
    move-result-wide v10

    .line 289
    double-to-int v10, v10

    .line 290
    div-float v11, v34, v7

    .line 291
    .line 292
    move v7, v10

    .line 293
    float-to-double v10, v11

    .line 294
    invoke-static {v10, v11}, Ljava/lang/Math;->ceil(D)D

    .line 295
    .line 296
    .line 297
    move-result-wide v10

    .line 298
    double-to-int v10, v10

    .line 299
    div-int/lit8 v11, v6, 0x8

    .line 300
    .line 301
    if-lez v11, :cond_14

    .line 302
    .line 303
    div-int/2addr v7, v11

    .line 304
    div-int/2addr v10, v11

    .line 305
    goto :goto_f

    .line 306
    :cond_e
    sget-object v7, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->PNG:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 307
    .line 308
    if-eq v13, v7, :cond_13

    .line 309
    .line 310
    sget-object v7, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->PNG_A:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 311
    .line 312
    if-ne v13, v7, :cond_f

    .line 313
    .line 314
    goto :goto_e

    .line 315
    :cond_f
    invoke-virtual {v13}, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->isWebp()Z

    .line 316
    .line 317
    .line 318
    move-result v7

    .line 319
    if-eqz v7, :cond_10

    .line 320
    .line 321
    int-to-float v7, v6

    .line 322
    div-float v10, p6, v7

    .line 323
    .line 324
    invoke-static {v10}, Ljava/lang/Math;->round(F)I

    .line 325
    .line 326
    .line 327
    move-result v10

    .line 328
    div-float v11, v34, v7

    .line 329
    .line 330
    invoke-static {v11}, Ljava/lang/Math;->round(F)I

    .line 331
    .line 332
    .line 333
    move-result v7

    .line 334
    goto :goto_10

    .line 335
    :cond_10
    rem-int v11, v29, v6

    .line 336
    .line 337
    if-nez v11, :cond_11

    .line 338
    .line 339
    rem-int v7, v32, v6

    .line 340
    .line 341
    if-eqz v7, :cond_12

    .line 342
    .line 343
    :cond_11
    const/4 v10, 0x1

    .line 344
    goto :goto_d

    .line 345
    :cond_12
    div-int v10, v29, v6

    .line 346
    .line 347
    div-int v7, v32, v6

    .line 348
    .line 349
    goto :goto_10

    .line 350
    :goto_d
    iput-boolean v10, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 351
    .line 352
    invoke-static {v2, v3, v8, v12}, Liu0;->c(Law1;Landroid/graphics/BitmapFactory$Options;Lhu0;Lzs;)Landroid/graphics/Bitmap;

    .line 353
    .line 354
    .line 355
    const/4 v7, 0x0

    .line 356
    iput-boolean v7, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 357
    .line 358
    iget v11, v3, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 359
    .line 360
    iget v13, v3, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 361
    .line 362
    filled-new-array {v11, v13}, [I

    .line 363
    .line 364
    .line 365
    move-result-object v11

    .line 366
    aget v13, v11, v7

    .line 367
    .line 368
    aget v7, v11, v10

    .line 369
    .line 370
    move v10, v13

    .line 371
    goto :goto_10

    .line 372
    :cond_13
    :goto_e
    int-to-float v7, v6

    .line 373
    div-float v10, p6, v7

    .line 374
    .line 375
    float-to-double v10, v10

    .line 376
    invoke-static {v10, v11}, Ljava/lang/Math;->floor(D)D

    .line 377
    .line 378
    .line 379
    move-result-wide v10

    .line 380
    double-to-int v10, v10

    .line 381
    div-float v11, v34, v7

    .line 382
    .line 383
    move v7, v10

    .line 384
    float-to-double v10, v11

    .line 385
    invoke-static {v10, v11}, Ljava/lang/Math;->floor(D)D

    .line 386
    .line 387
    .line 388
    move-result-wide v10

    .line 389
    double-to-int v10, v10

    .line 390
    :cond_14
    :goto_f
    move/from16 v40, v10

    .line 391
    .line 392
    move v10, v7

    .line 393
    move/from16 v7, v40

    .line 394
    .line 395
    :goto_10
    invoke-virtual {v0, v10, v7, v1, v9}, Lgu0;->b(IIII)F

    .line 396
    .line 397
    .line 398
    move-result v0

    .line 399
    move-object/from16 v29, v12

    .line 400
    .line 401
    float-to-double v11, v0

    .line 402
    const-wide/high16 v32, 0x3ff0000000000000L    # 1.0

    .line 403
    .line 404
    cmpg-double v0, v11, v32

    .line 405
    .line 406
    if-gtz v0, :cond_15

    .line 407
    .line 408
    move-wide/from16 v34, v11

    .line 409
    .line 410
    goto :goto_11

    .line 411
    :cond_15
    div-double v34, v32, v11

    .line 412
    .line 413
    :goto_11
    const-wide v36, 0x41dfffffffc00000L    # 2.147483647E9

    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    mul-double v34, v34, v36

    .line 419
    .line 420
    move-wide/from16 v38, v11

    .line 421
    .line 422
    invoke-static/range {v34 .. v35}, Ljava/lang/Math;->round(D)J

    .line 423
    .line 424
    .line 425
    move-result-wide v11

    .line 426
    long-to-int v11, v11

    .line 427
    int-to-double v12, v11

    .line 428
    mul-double v12, v12, v38

    .line 429
    .line 430
    add-double v12, v12, v30

    .line 431
    .line 432
    double-to-int v12, v12

    .line 433
    int-to-float v13, v12

    .line 434
    int-to-float v11, v11

    .line 435
    div-float/2addr v13, v11

    .line 436
    move v11, v6

    .line 437
    move/from16 v34, v7

    .line 438
    .line 439
    float-to-double v6, v13

    .line 440
    div-double v6, v38, v6

    .line 441
    .line 442
    int-to-double v12, v12

    .line 443
    mul-double/2addr v6, v12

    .line 444
    add-double v6, v6, v30

    .line 445
    .line 446
    double-to-int v6, v6

    .line 447
    iput v6, v3, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 448
    .line 449
    if-gtz v0, :cond_16

    .line 450
    .line 451
    move-wide/from16 v32, v38

    .line 452
    .line 453
    goto :goto_12

    .line 454
    :cond_16
    div-double v32, v32, v38

    .line 455
    .line 456
    :goto_12
    mul-double v32, v32, v36

    .line 457
    .line 458
    invoke-static/range {v32 .. v33}, Ljava/lang/Math;->round(D)J

    .line 459
    .line 460
    .line 461
    move-result-wide v6

    .line 462
    long-to-int v0, v6

    .line 463
    iput v0, v3, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 464
    .line 465
    iget v6, v3, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 466
    .line 467
    if-lez v6, :cond_17

    .line 468
    .line 469
    if-lez v0, :cond_17

    .line 470
    .line 471
    if-eq v6, v0, :cond_17

    .line 472
    .line 473
    const/4 v6, 0x1

    .line 474
    iput-boolean v6, v3, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 475
    .line 476
    :goto_13
    const/4 v6, 0x2

    .line 477
    goto :goto_14

    .line 478
    :cond_17
    const/4 v7, 0x0

    .line 479
    iput v7, v3, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 480
    .line 481
    iput v7, v3, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 482
    .line 483
    goto :goto_13

    .line 484
    :goto_14
    invoke-static {v4, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 485
    .line 486
    .line 487
    move-result v0

    .line 488
    if-eqz v0, :cond_19

    .line 489
    .line 490
    const-string v0, "Calculate scaling, source: ["

    .line 491
    .line 492
    const-string v6, "], degreesToRotate: "

    .line 493
    .line 494
    invoke-static {v0, v5, v15, v14, v6}, Lb11;->t(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    move/from16 v6, v28

    .line 499
    .line 500
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 501
    .line 502
    .line 503
    const-string v6, ", target: ["

    .line 504
    .line 505
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 506
    .line 507
    .line 508
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 509
    .line 510
    .line 511
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 512
    .line 513
    .line 514
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 515
    .line 516
    .line 517
    const-string v6, "], power of two scaled: ["

    .line 518
    .line 519
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 520
    .line 521
    .line 522
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 523
    .line 524
    .line 525
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 526
    .line 527
    .line 528
    move/from16 v7, v34

    .line 529
    .line 530
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 531
    .line 532
    .line 533
    const-string v6, "], exact scale factor: "

    .line 534
    .line 535
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 536
    .line 537
    .line 538
    move/from16 v6, v27

    .line 539
    .line 540
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 541
    .line 542
    .line 543
    const-string v6, ", power of 2 sample size: "

    .line 544
    .line 545
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 546
    .line 547
    .line 548
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 549
    .line 550
    .line 551
    const-string v6, ", adjusted scale factor: "

    .line 552
    .line 553
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 554
    .line 555
    .line 556
    move-wide/from16 v6, v38

    .line 557
    .line 558
    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 559
    .line 560
    .line 561
    move-object/from16 v6, v22

    .line 562
    .line 563
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 564
    .line 565
    .line 566
    iget v7, v3, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 567
    .line 568
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 569
    .line 570
    .line 571
    move-object/from16 v7, v21

    .line 572
    .line 573
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 574
    .line 575
    .line 576
    iget v10, v3, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 577
    .line 578
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 579
    .line 580
    .line 581
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 582
    .line 583
    .line 584
    move-result-object v0

    .line 585
    invoke-static {v4, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 586
    .line 587
    .line 588
    :cond_18
    :goto_15
    move-object/from16 v10, p0

    .line 589
    .line 590
    goto :goto_17

    .line 591
    :cond_19
    move-object/from16 v7, v21

    .line 592
    .line 593
    move-object/from16 v6, v22

    .line 594
    .line 595
    goto :goto_15

    .line 596
    :cond_1a
    const-string v0, "Cannot round with null rounding"

    .line 597
    .line 598
    invoke-static {v0}, Lkf2;->n(Ljava/lang/String;)V

    .line 599
    .line 600
    .line 601
    return-object v23

    .line 602
    :cond_1b
    move v6, v7

    .line 603
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 604
    .line 605
    new-instance v3, Ljava/lang/StringBuilder;

    .line 606
    .line 607
    const-string v4, "Cannot scale with factor: "

    .line 608
    .line 609
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 610
    .line 611
    .line 612
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 613
    .line 614
    .line 615
    const-string v4, " from: "

    .line 616
    .line 617
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 618
    .line 619
    .line 620
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 621
    .line 622
    .line 623
    const-string v0, ", source: ["

    .line 624
    .line 625
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 626
    .line 627
    .line 628
    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 629
    .line 630
    .line 631
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 632
    .line 633
    .line 634
    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 635
    .line 636
    .line 637
    const-string v0, "], target: ["

    .line 638
    .line 639
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 640
    .line 641
    .line 642
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 643
    .line 644
    .line 645
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 646
    .line 647
    .line 648
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 649
    .line 650
    .line 651
    move-object/from16 v0, p6

    .line 652
    .line 653
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 654
    .line 655
    .line 656
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 657
    .line 658
    .line 659
    move-result-object v0

    .line 660
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 661
    .line 662
    .line 663
    throw v2

    .line 664
    :goto_16
    invoke-static {v4, v10}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 665
    .line 666
    .line 667
    move-result v11

    .line 668
    if-eqz v11, :cond_18

    .line 669
    .line 670
    new-instance v10, Ljava/lang/StringBuilder;

    .line 671
    .line 672
    const-string v11, "Unable to determine dimensions for: "

    .line 673
    .line 674
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 675
    .line 676
    .line 677
    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 678
    .line 679
    .line 680
    const-string v11, " with target ["

    .line 681
    .line 682
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 683
    .line 684
    .line 685
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 686
    .line 687
    .line 688
    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 689
    .line 690
    .line 691
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 692
    .line 693
    .line 694
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 695
    .line 696
    .line 697
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 698
    .line 699
    .line 700
    move-result-object v0

    .line 701
    invoke-static {v4, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 702
    .line 703
    .line 704
    goto :goto_15

    .line 705
    :goto_17
    iget-object v0, v10, Liu0;->e:Lll1;

    .line 706
    .line 707
    move/from16 v12, v20

    .line 708
    .line 709
    move/from16 v11, v26

    .line 710
    .line 711
    invoke-virtual {v0, v1, v9, v11, v12}, Lll1;->c(IIZZ)Z

    .line 712
    .line 713
    .line 714
    move-result v0

    .line 715
    if-eqz v0, :cond_1c

    .line 716
    .line 717
    invoke-static {}, Lj3;->D()Landroid/graphics/Bitmap$Config;

    .line 718
    .line 719
    .line 720
    move-result-object v11

    .line 721
    iput-object v11, v3, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 722
    .line 723
    const/4 v11, 0x0

    .line 724
    iput-boolean v11, v3, Landroid/graphics/BitmapFactory$Options;->inMutable:Z

    .line 725
    .line 726
    goto :goto_18

    .line 727
    :cond_1c
    const/4 v11, 0x0

    .line 728
    :goto_18
    if-eqz v0, :cond_1d

    .line 729
    .line 730
    goto :goto_1b

    .line 731
    :cond_1d
    sget-object v0, Lvi0;->n:Lvi0;

    .line 732
    .line 733
    move-object/from16 v12, p4

    .line 734
    .line 735
    if-eq v12, v0, :cond_20

    .line 736
    .line 737
    :try_start_0
    invoke-interface {v2}, Law1;->l()Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 738
    .line 739
    .line 740
    move-result-object v0

    .line 741
    invoke-virtual {v0}, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->hasAlpha()Z

    .line 742
    .line 743
    .line 744
    move-result v13
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 745
    goto :goto_19

    .line 746
    :catch_0
    move-exception v0

    .line 747
    const/4 v13, 0x3

    .line 748
    invoke-static {v4, v13}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 749
    .line 750
    .line 751
    move-result v13

    .line 752
    if-eqz v13, :cond_1e

    .line 753
    .line 754
    new-instance v13, Ljava/lang/StringBuilder;

    .line 755
    .line 756
    const-string v11, "Cannot determine whether the image has alpha or not from header, format "

    .line 757
    .line 758
    invoke-direct {v13, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 759
    .line 760
    .line 761
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 762
    .line 763
    .line 764
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 765
    .line 766
    .line 767
    move-result-object v11

    .line 768
    invoke-static {v4, v11, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 769
    .line 770
    .line 771
    :cond_1e
    const/4 v13, 0x0

    .line 772
    :goto_19
    if-eqz v13, :cond_1f

    .line 773
    .line 774
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 775
    .line 776
    goto :goto_1a

    .line 777
    :cond_1f
    sget-object v0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 778
    .line 779
    :goto_1a
    iput-object v0, v3, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 780
    .line 781
    sget-object v11, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 782
    .line 783
    if-ne v0, v11, :cond_21

    .line 784
    .line 785
    const/4 v11, 0x1

    .line 786
    iput-boolean v11, v3, Landroid/graphics/BitmapFactory$Options;->inDither:Z

    .line 787
    .line 788
    goto :goto_1b

    .line 789
    :cond_20
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 790
    .line 791
    iput-object v0, v3, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 792
    .line 793
    :cond_21
    :goto_1b
    if-ltz v15, :cond_22

    .line 794
    .line 795
    if-ltz v14, :cond_22

    .line 796
    .line 797
    if-eqz p9, :cond_22

    .line 798
    .line 799
    goto/16 :goto_1d

    .line 800
    .line 801
    :cond_22
    iget v0, v3, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 802
    .line 803
    if-lez v0, :cond_23

    .line 804
    .line 805
    iget v1, v3, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 806
    .line 807
    if-lez v1, :cond_23

    .line 808
    .line 809
    if-eq v0, v1, :cond_23

    .line 810
    .line 811
    int-to-float v0, v0

    .line 812
    int-to-float v1, v1

    .line 813
    div-float/2addr v0, v1

    .line 814
    goto :goto_1c

    .line 815
    :cond_23
    move/from16 v0, v25

    .line 816
    .line 817
    :goto_1c
    iget v1, v3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 818
    .line 819
    int-to-float v9, v15

    .line 820
    int-to-float v11, v1

    .line 821
    div-float/2addr v9, v11

    .line 822
    float-to-double v12, v9

    .line 823
    invoke-static {v12, v13}, Ljava/lang/Math;->ceil(D)D

    .line 824
    .line 825
    .line 826
    move-result-wide v12

    .line 827
    double-to-int v9, v12

    .line 828
    int-to-float v12, v14

    .line 829
    div-float/2addr v12, v11

    .line 830
    float-to-double v11, v12

    .line 831
    invoke-static {v11, v12}, Ljava/lang/Math;->ceil(D)D

    .line 832
    .line 833
    .line 834
    move-result-wide v11

    .line 835
    double-to-int v11, v11

    .line 836
    int-to-float v9, v9

    .line 837
    mul-float/2addr v9, v0

    .line 838
    invoke-static {v9}, Ljava/lang/Math;->round(F)I

    .line 839
    .line 840
    .line 841
    move-result v9

    .line 842
    int-to-float v11, v11

    .line 843
    mul-float/2addr v11, v0

    .line 844
    invoke-static {v11}, Ljava/lang/Math;->round(F)I

    .line 845
    .line 846
    .line 847
    move-result v11

    .line 848
    const/4 v12, 0x2

    .line 849
    invoke-static {v4, v12}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 850
    .line 851
    .line 852
    move-result v13

    .line 853
    if-eqz v13, :cond_24

    .line 854
    .line 855
    const-string v12, "Calculated target ["

    .line 856
    .line 857
    const-string v13, "] for source ["

    .line 858
    .line 859
    invoke-static {v12, v5, v9, v11, v13}, Lb11;->t(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 860
    .line 861
    .line 862
    move-result-object v12

    .line 863
    invoke-virtual {v12, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 864
    .line 865
    .line 866
    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 867
    .line 868
    .line 869
    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 870
    .line 871
    .line 872
    const-string v13, "], sampleSize: "

    .line 873
    .line 874
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 875
    .line 876
    .line 877
    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 878
    .line 879
    .line 880
    const-string v1, ", targetDensity: "

    .line 881
    .line 882
    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 883
    .line 884
    .line 885
    iget v1, v3, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 886
    .line 887
    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 888
    .line 889
    .line 890
    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 891
    .line 892
    .line 893
    iget v1, v3, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 894
    .line 895
    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 896
    .line 897
    .line 898
    const-string v1, ", density multiplier: "

    .line 899
    .line 900
    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 901
    .line 902
    .line 903
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 904
    .line 905
    .line 906
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 907
    .line 908
    .line 909
    move-result-object v0

    .line 910
    invoke-static {v4, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 911
    .line 912
    .line 913
    :cond_24
    move v1, v9

    .line 914
    move v9, v11

    .line 915
    :goto_1d
    const/16 v0, 0x1a

    .line 916
    .line 917
    if-lez v1, :cond_28

    .line 918
    .line 919
    if-lez v9, :cond_28

    .line 920
    .line 921
    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 922
    .line 923
    if-lt v11, v0, :cond_26

    .line 924
    .line 925
    iget-object v11, v3, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 926
    .line 927
    invoke-static {}, Lj3;->D()Landroid/graphics/Bitmap$Config;

    .line 928
    .line 929
    .line 930
    move-result-object v12

    .line 931
    if-ne v11, v12, :cond_25

    .line 932
    .line 933
    goto :goto_1f

    .line 934
    :cond_25
    invoke-static {v3}, Lgm0;->f(Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap$Config;

    .line 935
    .line 936
    .line 937
    move-result-object v11

    .line 938
    goto :goto_1e

    .line 939
    :cond_26
    move-object/from16 v11, v23

    .line 940
    .line 941
    :goto_1e
    if-nez v11, :cond_27

    .line 942
    .line 943
    iget-object v11, v3, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 944
    .line 945
    :cond_27
    move-object/from16 v12, v29

    .line 946
    .line 947
    invoke-interface {v12, v1, v9, v11}, Lzs;->c(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 948
    .line 949
    .line 950
    move-result-object v1

    .line 951
    iput-object v1, v3, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;

    .line 952
    .line 953
    goto :goto_20

    .line 954
    :cond_28
    :goto_1f
    move-object/from16 v12, v29

    .line 955
    .line 956
    :goto_20
    if-eqz p5, :cond_2b

    .line 957
    .line 958
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 959
    .line 960
    const/16 v9, 0x1c

    .line 961
    .line 962
    if-lt v1, v9, :cond_2a

    .line 963
    .line 964
    sget-object v0, Ltp3;->n:Ltp3;

    .line 965
    .line 966
    move-object/from16 v1, p5

    .line 967
    .line 968
    if-ne v1, v0, :cond_29

    .line 969
    .line 970
    invoke-static {v3}, Lgm0;->h(Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/ColorSpace;

    .line 971
    .line 972
    .line 973
    move-result-object v0

    .line 974
    if-eqz v0, :cond_29

    .line 975
    .line 976
    invoke-static {v3}, Lgm0;->h(Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/ColorSpace;

    .line 977
    .line 978
    .line 979
    move-result-object v0

    .line 980
    invoke-static {v0}, Ltn;->y(Landroid/graphics/ColorSpace;)Z

    .line 981
    .line 982
    .line 983
    move-result v0

    .line 984
    if-eqz v0, :cond_29

    .line 985
    .line 986
    invoke-static {}, Ltn;->d()Landroid/graphics/ColorSpace$Named;

    .line 987
    .line 988
    .line 989
    move-result-object v0

    .line 990
    goto :goto_21

    .line 991
    :cond_29
    invoke-static {}, Ltn;->A()Landroid/graphics/ColorSpace$Named;

    .line 992
    .line 993
    .line 994
    move-result-object v0

    .line 995
    :goto_21
    invoke-static {v0}, Ltn;->e(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 996
    .line 997
    .line 998
    move-result-object v0

    .line 999
    invoke-static {v3, v0}, Lgm0;->s(Landroid/graphics/BitmapFactory$Options;Landroid/graphics/ColorSpace;)V

    .line 1000
    .line 1001
    .line 1002
    goto :goto_22

    .line 1003
    :cond_2a
    if-lt v1, v0, :cond_2b

    .line 1004
    .line 1005
    invoke-static {}, Ltn;->A()Landroid/graphics/ColorSpace$Named;

    .line 1006
    .line 1007
    .line 1008
    invoke-static {}, Lgm0;->g()Landroid/graphics/ColorSpace;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v0

    .line 1012
    invoke-static {v3, v0}, Lgm0;->s(Landroid/graphics/BitmapFactory$Options;Landroid/graphics/ColorSpace;)V

    .line 1013
    .line 1014
    .line 1015
    :cond_2b
    :goto_22
    invoke-static {v2, v3, v8, v12}, Liu0;->c(Law1;Landroid/graphics/BitmapFactory$Options;Lhu0;Lzs;)Landroid/graphics/Bitmap;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v0

    .line 1019
    invoke-interface {v8, v12, v0}, Lhu0;->E(Lzs;Landroid/graphics/Bitmap;)V

    .line 1020
    .line 1021
    .line 1022
    const/4 v1, 0x2

    .line 1023
    invoke-static {v4, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 1024
    .line 1025
    .line 1026
    move-result v1

    .line 1027
    if-eqz v1, :cond_2c

    .line 1028
    .line 1029
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1030
    .line 1031
    const-string v2, "Decoded "

    .line 1032
    .line 1033
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1034
    .line 1035
    .line 1036
    invoke-static {v0}, Liu0;->d(Landroid/graphics/Bitmap;)Ljava/lang/String;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v2

    .line 1040
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1041
    .line 1042
    .line 1043
    const-string v2, " from ["

    .line 1044
    .line 1045
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1046
    .line 1047
    .line 1048
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1049
    .line 1050
    .line 1051
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1052
    .line 1053
    .line 1054
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1055
    .line 1056
    .line 1057
    const-string v2, "] "

    .line 1058
    .line 1059
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1060
    .line 1061
    .line 1062
    move-object/from16 v2, v19

    .line 1063
    .line 1064
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1065
    .line 1066
    .line 1067
    const-string v2, " with inBitmap "

    .line 1068
    .line 1069
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1070
    .line 1071
    .line 1072
    iget-object v2, v3, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;

    .line 1073
    .line 1074
    invoke-static {v2}, Liu0;->d(Landroid/graphics/Bitmap;)Ljava/lang/String;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v2

    .line 1078
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1079
    .line 1080
    .line 1081
    const-string v2, " for ["

    .line 1082
    .line 1083
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1084
    .line 1085
    .line 1086
    move/from16 v2, p7

    .line 1087
    .line 1088
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1089
    .line 1090
    .line 1091
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1092
    .line 1093
    .line 1094
    move/from16 v2, p8

    .line 1095
    .line 1096
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1097
    .line 1098
    .line 1099
    const-string v2, "], sample size: "

    .line 1100
    .line 1101
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1102
    .line 1103
    .line 1104
    iget v2, v3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 1105
    .line 1106
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1107
    .line 1108
    .line 1109
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1110
    .line 1111
    .line 1112
    iget v2, v3, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 1113
    .line 1114
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1115
    .line 1116
    .line 1117
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1118
    .line 1119
    .line 1120
    iget v2, v3, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 1121
    .line 1122
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1123
    .line 1124
    .line 1125
    const-string v2, ", thread: "

    .line 1126
    .line 1127
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1128
    .line 1129
    .line 1130
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v2

    .line 1134
    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v2

    .line 1138
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1139
    .line 1140
    .line 1141
    const-string v2, ", duration: "

    .line 1142
    .line 1143
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1144
    .line 1145
    .line 1146
    invoke-static/range {v17 .. v18}, Lee2;->a(J)D

    .line 1147
    .line 1148
    .line 1149
    move-result-wide v2

    .line 1150
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 1151
    .line 1152
    .line 1153
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v1

    .line 1157
    invoke-static {v4, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1158
    .line 1159
    .line 1160
    :cond_2c
    if-eqz v0, :cond_2f

    .line 1161
    .line 1162
    iget-object v1, v10, Liu0;->b:Landroid/util/DisplayMetrics;

    .line 1163
    .line 1164
    iget v1, v1, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 1165
    .line 1166
    invoke-virtual {v0, v1}, Landroid/graphics/Bitmap;->setDensity(I)V

    .line 1167
    .line 1168
    .line 1169
    packed-switch v16, :pswitch_data_2

    .line 1170
    .line 1171
    .line 1172
    move-object v3, v0

    .line 1173
    goto/16 :goto_25

    .line 1174
    .line 1175
    :pswitch_4
    new-instance v1, Landroid/graphics/Matrix;

    .line 1176
    .line 1177
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 1178
    .line 1179
    .line 1180
    const/high16 v2, 0x43340000    # 180.0f

    .line 1181
    .line 1182
    const/high16 v3, 0x42b40000    # 90.0f

    .line 1183
    .line 1184
    const/high16 v4, -0x3d4c0000    # -90.0f

    .line 1185
    .line 1186
    const/high16 v5, -0x40800000    # -1.0f

    .line 1187
    .line 1188
    packed-switch v16, :pswitch_data_3

    .line 1189
    .line 1190
    .line 1191
    goto :goto_23

    .line 1192
    :pswitch_5
    invoke-virtual {v1, v4}, Landroid/graphics/Matrix;->setRotate(F)V

    .line 1193
    .line 1194
    .line 1195
    goto :goto_23

    .line 1196
    :pswitch_6
    invoke-virtual {v1, v4}, Landroid/graphics/Matrix;->setRotate(F)V

    .line 1197
    .line 1198
    .line 1199
    move/from16 v4, v25

    .line 1200
    .line 1201
    invoke-virtual {v1, v5, v4}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 1202
    .line 1203
    .line 1204
    goto :goto_23

    .line 1205
    :pswitch_7
    invoke-virtual {v1, v3}, Landroid/graphics/Matrix;->setRotate(F)V

    .line 1206
    .line 1207
    .line 1208
    goto :goto_23

    .line 1209
    :pswitch_8
    move/from16 v4, v25

    .line 1210
    .line 1211
    invoke-virtual {v1, v3}, Landroid/graphics/Matrix;->setRotate(F)V

    .line 1212
    .line 1213
    .line 1214
    invoke-virtual {v1, v5, v4}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 1215
    .line 1216
    .line 1217
    goto :goto_23

    .line 1218
    :pswitch_9
    move/from16 v4, v25

    .line 1219
    .line 1220
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->setRotate(F)V

    .line 1221
    .line 1222
    .line 1223
    invoke-virtual {v1, v5, v4}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 1224
    .line 1225
    .line 1226
    goto :goto_23

    .line 1227
    :pswitch_a
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->setRotate(F)V

    .line 1228
    .line 1229
    .line 1230
    goto :goto_23

    .line 1231
    :pswitch_b
    move/from16 v4, v25

    .line 1232
    .line 1233
    invoke-virtual {v1, v5, v4}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 1234
    .line 1235
    .line 1236
    :goto_23
    new-instance v2, Landroid/graphics/RectF;

    .line 1237
    .line 1238
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 1239
    .line 1240
    .line 1241
    move-result v3

    .line 1242
    int-to-float v3, v3

    .line 1243
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 1244
    .line 1245
    .line 1246
    move-result v4

    .line 1247
    int-to-float v4, v4

    .line 1248
    move/from16 v5, v24

    .line 1249
    .line 1250
    invoke-direct {v2, v5, v5, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 1251
    .line 1252
    .line 1253
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 1254
    .line 1255
    .line 1256
    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    .line 1257
    .line 1258
    .line 1259
    move-result v3

    .line 1260
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 1261
    .line 1262
    .line 1263
    move-result v3

    .line 1264
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    .line 1265
    .line 1266
    .line 1267
    move-result v4

    .line 1268
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 1269
    .line 1270
    .line 1271
    move-result v4

    .line 1272
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 1273
    .line 1274
    .line 1275
    move-result-object v5

    .line 1276
    if-eqz v5, :cond_2d

    .line 1277
    .line 1278
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 1279
    .line 1280
    .line 1281
    move-result-object v5

    .line 1282
    goto :goto_24

    .line 1283
    :cond_2d
    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 1284
    .line 1285
    :goto_24
    invoke-interface {v12, v3, v4, v5}, Lzs;->h(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 1286
    .line 1287
    .line 1288
    move-result-object v3

    .line 1289
    iget v4, v2, Landroid/graphics/RectF;->left:F

    .line 1290
    .line 1291
    neg-float v4, v4

    .line 1292
    iget v2, v2, Landroid/graphics/RectF;->top:F

    .line 1293
    .line 1294
    neg-float v2, v2

    .line 1295
    invoke-virtual {v1, v4, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 1296
    .line 1297
    .line 1298
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->hasAlpha()Z

    .line 1299
    .line 1300
    .line 1301
    move-result v2

    .line 1302
    invoke-virtual {v3, v2}, Landroid/graphics/Bitmap;->setHasAlpha(Z)V

    .line 1303
    .line 1304
    .line 1305
    invoke-static {v0, v3, v1}, Lxw4;->a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Matrix;)V

    .line 1306
    .line 1307
    .line 1308
    :goto_25
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1309
    .line 1310
    .line 1311
    move-result v1

    .line 1312
    if-nez v1, :cond_2e

    .line 1313
    .line 1314
    invoke-interface {v12, v0}, Lzs;->d(Landroid/graphics/Bitmap;)V

    .line 1315
    .line 1316
    .line 1317
    :cond_2e
    move-object/from16 v23, v3

    .line 1318
    .line 1319
    :cond_2f
    return-object v23

    .line 1320
    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x2
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x2
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x2
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
    .end packed-switch
.end method
