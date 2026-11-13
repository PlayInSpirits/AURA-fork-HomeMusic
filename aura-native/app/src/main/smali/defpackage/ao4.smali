.class public final Ldefpackage/ao4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/wv4;


# instance fields
.field public final a:Ldefpackage/wv4;

.field public final b:Ldefpackage/xn4;

.field public final c:Ldefpackage/be3;

.field public d:I

.field public e:I

.field public f:[B

.field public g:Ldefpackage/zn4;

.field public h:Ldefpackage/tb1;

.field public i:Z


# direct methods
.method public constructor <init>(Ldefpackage/wv4;Ldefpackage/xn4;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/ao4;->a:Ldefpackage/wv4;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/ao4;->b:Ldefpackage/xn4;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput p1, p0, Ldefpackage/ao4;->d:I

    .line 10
    .line 11
    iput p1, p0, Ldefpackage/ao4;->e:I

    .line 12
    .line 13
    sget-object p1, Ldefpackage/f35;->b:[B

    .line 14
    .line 15
    iput-object p1, p0, Ldefpackage/ao4;->f:[B

    .line 16
    .line 17
    new-instance p1, Ldefpackage/be3;

    .line 18
    .line 19
    invoke-direct {p1}, Ldefpackage/be3;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Ldefpackage/ao4;->c:Ldefpackage/be3;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final a(JIIILdefpackage/vv4;)V
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/ao4;->g:Ldefpackage/zn4;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/ao4;->a:Ldefpackage/wv4;

    .line 6
    .line 7
    invoke-interface/range {p0 .. p6}, Ldefpackage/wv4;->a(JIIILdefpackage/vv4;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    if-nez p6, :cond_1

    .line 13
    .line 14
    const/4 p6, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    move p6, v1

    .line 17
    :goto_0
    const-string v0, "DRM on subtitles is not supported"

    .line 18
    .line 19
    invoke-static {v0, p6}, Ldefpackage/rr2;->k(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    iget p6, p0, Ldefpackage/ao4;->e:I

    .line 23
    .line 24
    sub-int/2addr p6, p5

    .line 25
    sub-int/2addr p6, p4

    .line 26
    move-wide v2, p1

    .line 27
    :try_start_0
    iget-object p1, p0, Ldefpackage/ao4;->g:Ldefpackage/zn4;

    .line 28
    .line 29
    iget-object p2, p0, Ldefpackage/ao4;->f:[B

    .line 30
    .line 31
    sget-object p5, Ldefpackage/yn4;->c:Ldefpackage/yn4;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 32
    .line 33
    move v0, p3

    .line 34
    move p3, p6

    .line 35
    :try_start_1
    new-instance p6, Ldefpackage/lj0;

    .line 36
    .line 37
    invoke-direct {p6, p0, v2, v3, v0}, Ldefpackage/lj0;-><init>(Ldefpackage/ao4;JI)V

    .line 38
    .line 39
    .line 40
    invoke-interface/range {p1 .. p6}, Ldefpackage/zn4;->c([BIILdefpackage/yn4;Ldefpackage/wc0;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    .line 41
    .line 42
    .line 43
    goto :goto_3

    .line 44
    :catch_0
    move-exception v0

    .line 45
    :goto_1
    move-object p1, v0

    .line 46
    goto :goto_2

    .line 47
    :catch_1
    move-exception v0

    .line 48
    move p3, p6

    .line 49
    goto :goto_1

    .line 50
    :goto_2
    iget-boolean p2, p0, Ldefpackage/ao4;->i:Z

    .line 51
    .line 52
    if-eqz p2, :cond_3

    .line 53
    .line 54
    const-string p2, "SubtitleTranscodingTO"

    .line 55
    .line 56
    const-string p5, "Parsing subtitles failed, ignoring sample."

    .line 57
    .line 58
    invoke-static {p2, p5, p1}, Ldefpackage/l93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    :goto_3
    add-int p6, p3, p4

    .line 62
    .line 63
    iput p6, p0, Ldefpackage/ao4;->d:I

    .line 64
    .line 65
    iget p1, p0, Ldefpackage/ao4;->e:I

    .line 66
    .line 67
    if-ne p6, p1, :cond_2

    .line 68
    .line 69
    iput v1, p0, Ldefpackage/ao4;->d:I

    .line 70
    .line 71
    iput v1, p0, Ldefpackage/ao4;->e:I

    .line 72
    .line 73
    :cond_2
    return-void

    .line 74
    :cond_3
    throw p1
.end method

.method public final b(Ldefpackage/be3;II)V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/ao4;->g:Ldefpackage/zn4;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/ao4;->a:Ldefpackage/wv4;

    .line 6
    .line 7
    invoke-interface {p0, p1, p2, p3}, Ldefpackage/wv4;->b(Ldefpackage/be3;II)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p0, p2}, Ldefpackage/ao4;->h(I)V

    .line 12
    .line 13
    .line 14
    iget-object p3, p0, Ldefpackage/ao4;->f:[B

    .line 15
    .line 16
    iget v0, p0, Ldefpackage/ao4;->e:I

    .line 17
    .line 18
    invoke-virtual {p1, p3, v0, p2}, Ldefpackage/be3;->k([BII)V

    .line 19
    .line 20
    .line 21
    iget p1, p0, Ldefpackage/ao4;->e:I

    .line 22
    .line 23
    add-int/2addr p1, p2

    .line 24
    iput p1, p0, Ldefpackage/ao4;->e:I

    .line 25
    .line 26
    return-void
.end method

.method public final c(Ldefpackage/wh0;IZ)I
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/ao4;->g:Ldefpackage/zn4;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/ao4;->a:Ldefpackage/wv4;

    .line 6
    .line 7
    invoke-interface {p0, p1, p2, p3}, Ldefpackage/wv4;->c(Ldefpackage/wh0;IZ)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    invoke-virtual {p0, p2}, Ldefpackage/ao4;->h(I)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Ldefpackage/ao4;->f:[B

    .line 16
    .line 17
    iget v1, p0, Ldefpackage/ao4;->e:I

    .line 18
    .line 19
    invoke-interface {p1, v0, v1, p2}, Ldefpackage/wh0;->read([BII)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    const/4 p2, -0x1

    .line 24
    if-ne p1, p2, :cond_2

    .line 25
    .line 26
    if-eqz p3, :cond_1

    .line 27
    .line 28
    return p2

    .line 29
    :cond_1
    new-instance p0, Ljava/io/EOFException;

    .line 30
    .line 31
    invoke-direct {p0}, Ljava/io/EOFException;-><init>()V

    .line 32
    .line 33
    .line 34
    throw p0

    .line 35
    :cond_2
    iget p2, p0, Ldefpackage/ao4;->e:I

    .line 36
    .line 37
    add-int/2addr p2, p1

    .line 38
    iput p2, p0, Ldefpackage/ao4;->e:I

    .line 39
    .line 40
    return p1
.end method

.method public final g(Ldefpackage/tb1;)V
    .locals 5

    .line 1
    iget-object v0, p1, Ldefpackage/tb1;->n:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Ldefpackage/tb1;->n:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {v0}, Ldefpackage/lw2;->h(Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x3

    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v1, 0x0

    .line 18
    :goto_0
    invoke-static {v1}, Ldefpackage/rr2;->l(Z)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Ldefpackage/ao4;->h:Ldefpackage/tb1;

    .line 22
    .line 23
    invoke-virtual {p1, v1}, Ldefpackage/tb1;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    iget-object v2, p0, Ldefpackage/ao4;->b:Ldefpackage/xn4;

    .line 28
    .line 29
    if-nez v1, :cond_2

    .line 30
    .line 31
    iput-object p1, p0, Ldefpackage/ao4;->h:Ldefpackage/tb1;

    .line 32
    .line 33
    invoke-interface {v2, p1}, Ldefpackage/xn4;->n(Ldefpackage/tb1;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    invoke-interface {v2, p1}, Ldefpackage/xn4;->C(Ldefpackage/tb1;)Ldefpackage/zn4;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const/4 v1, 0x0

    .line 45
    :goto_1
    iput-object v1, p0, Ldefpackage/ao4;->g:Ldefpackage/zn4;

    .line 46
    .line 47
    :cond_2
    iget-object v1, p0, Ldefpackage/ao4;->g:Ldefpackage/zn4;

    .line 48
    .line 49
    iget-object p0, p0, Ldefpackage/ao4;->a:Ldefpackage/wv4;

    .line 50
    .line 51
    if-nez v1, :cond_3

    .line 52
    .line 53
    invoke-interface {p0, p1}, Ldefpackage/wv4;->g(Ldefpackage/tb1;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_3
    invoke-virtual {p1}, Ldefpackage/tb1;->a()Ldefpackage/sb1;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    const-string v3, "application/x-media3-cues"

    .line 62
    .line 63
    invoke-static {v3}, Ldefpackage/lw2;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    iput-object v3, v1, Ldefpackage/sb1;->m:Ljava/lang/String;

    .line 68
    .line 69
    iput-object v0, v1, Ldefpackage/sb1;->j:Ljava/lang/String;

    .line 70
    .line 71
    const-wide v3, 0x7fffffffffffffffL

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    iput-wide v3, v1, Ldefpackage/sb1;->r:J

    .line 77
    .line 78
    invoke-interface {v2, p1}, Ldefpackage/xn4;->R(Ldefpackage/tb1;)I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    iput p1, v1, Ldefpackage/sb1;->K:I

    .line 83
    .line 84
    invoke-static {v1, p0}, Ldefpackage/f34;->l(Ldefpackage/sb1;Ldefpackage/wv4;)V

    .line 85
    .line 86
    .line 87
    return-void
.end method

.method public final h(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/ao4;->f:[B

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    iget v1, p0, Ldefpackage/ao4;->e:I

    .line 5
    .line 6
    sub-int/2addr v0, v1

    .line 7
    if-lt v0, p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget v0, p0, Ldefpackage/ao4;->d:I

    .line 11
    .line 12
    sub-int/2addr v1, v0

    .line 13
    mul-int/lit8 v0, v1, 0x2

    .line 14
    .line 15
    add-int/2addr p1, v1

    .line 16
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    iget-object v0, p0, Ldefpackage/ao4;->f:[B

    .line 21
    .line 22
    array-length v2, v0

    .line 23
    if-gt p1, v2, :cond_1

    .line 24
    .line 25
    move-object p1, v0

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    new-array p1, p1, [B

    .line 28
    .line 29
    :goto_0
    iget v2, p0, Ldefpackage/ao4;->d:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    invoke-static {v0, v2, p1, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 33
    .line 34
    .line 35
    iput v3, p0, Ldefpackage/ao4;->d:I

    .line 36
    .line 37
    iput v1, p0, Ldefpackage/ao4;->e:I

    .line 38
    .line 39
    iput-object p1, p0, Ldefpackage/ao4;->f:[B

    .line 40
    .line 41
    return-void
.end method
