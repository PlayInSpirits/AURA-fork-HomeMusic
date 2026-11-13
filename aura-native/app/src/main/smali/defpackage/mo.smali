.class public final Ldefpackage/mo;
.super Ldefpackage/i90;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final synthetic J:I


# instance fields
.field public A:I

.field public B:I

.field public C:I

.field public D:I

.field public E:I

.field public F:I

.field public G:I

.field public H:C

.field public I:Ldefpackage/lo;

.field public o:I

.field public p:I

.field public q:I

.field public r:Z

.field public final s:Ldefpackage/cx;

.field public t:I

.field public u:Ldefpackage/qs;

.field public v:I

.field public w:I

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Ljava/io/ByteArrayInputStream;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ldefpackage/i90;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ldefpackage/cx;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 v1, -0x1

    .line 10
    iput v1, v0, Ldefpackage/cx;->a:I

    .line 11
    .line 12
    iput-object v0, p0, Ldefpackage/mo;->s:Ldefpackage/cx;

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    iput v0, p0, Ldefpackage/mo;->v:I

    .line 16
    .line 17
    new-instance v0, Ldefpackage/qs;

    .line 18
    .line 19
    sget-object v1, Ljava/lang/System;->in:Ljava/io/InputStream;

    .line 20
    .line 21
    if-ne p1, v1, :cond_0

    .line 22
    .line 23
    new-instance v1, Ldefpackage/f40;

    .line 24
    .line 25
    invoke-direct {v1, p1}, Ldefpackage/f40;-><init>(Ljava/io/ByteArrayInputStream;)V

    .line 26
    .line 27
    .line 28
    move-object p1, v1

    .line 29
    :cond_0
    sget-object v1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 30
    .line 31
    invoke-direct {v0, p1, v1}, Ldefpackage/qs;-><init>(Ljava/io/InputStream;Ljava/nio/ByteOrder;)V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Ldefpackage/mo;->u:Ldefpackage/qs;

    .line 35
    .line 36
    iget-object p1, p0, Ldefpackage/mo;->u:Ldefpackage/qs;

    .line 37
    .line 38
    if-eqz p1, :cond_3

    .line 39
    .line 40
    const/16 v0, 0x8

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Ldefpackage/qs;->b(I)J

    .line 43
    .line 44
    .line 45
    move-result-wide v1

    .line 46
    long-to-int p1, v1

    .line 47
    iget-object v1, p0, Ldefpackage/mo;->u:Ldefpackage/qs;

    .line 48
    .line 49
    invoke-virtual {v1, v0}, Ldefpackage/qs;->b(I)J

    .line 50
    .line 51
    .line 52
    move-result-wide v1

    .line 53
    long-to-int v1, v1

    .line 54
    iget-object v2, p0, Ldefpackage/mo;->u:Ldefpackage/qs;

    .line 55
    .line 56
    invoke-virtual {v2, v0}, Ldefpackage/qs;->b(I)J

    .line 57
    .line 58
    .line 59
    move-result-wide v2

    .line 60
    long-to-int v2, v2

    .line 61
    const/16 v3, 0x42

    .line 62
    .line 63
    if-ne p1, v3, :cond_2

    .line 64
    .line 65
    const/16 p1, 0x5a

    .line 66
    .line 67
    if-ne v1, p1, :cond_2

    .line 68
    .line 69
    const/16 p1, 0x68

    .line 70
    .line 71
    if-ne v2, p1, :cond_2

    .line 72
    .line 73
    iget-object p1, p0, Ldefpackage/mo;->u:Ldefpackage/qs;

    .line 74
    .line 75
    invoke-virtual {p1, v0}, Ldefpackage/qs;->b(I)J

    .line 76
    .line 77
    .line 78
    move-result-wide v0

    .line 79
    long-to-int p1, v0

    .line 80
    const/16 v0, 0x31

    .line 81
    .line 82
    if-lt p1, v0, :cond_1

    .line 83
    .line 84
    const/16 v0, 0x39

    .line 85
    .line 86
    if-gt p1, v0, :cond_1

    .line 87
    .line 88
    add-int/lit8 p1, p1, -0x30

    .line 89
    .line 90
    iput p1, p0, Ldefpackage/mo;->q:I

    .line 91
    .line 92
    const/4 p1, 0x0

    .line 93
    iput p1, p0, Ldefpackage/mo;->y:I

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_1
    const-string p1, "BZip2 block size is invalid"

    .line 97
    .line 98
    invoke-static {p1}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_2
    new-instance p0, Ljava/io/IOException;

    .line 103
    .line 104
    const-string p1, "Stream is not in the BZip2 format"

    .line 105
    .line 106
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    throw p0

    .line 110
    :cond_3
    const-string p1, "No InputStream"

    .line 111
    .line 112
    invoke-static {p1}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    :goto_0
    invoke-virtual {p0}, Ldefpackage/mo;->q()V

    .line 116
    .line 117
    .line 118
    return-void
.end method

.method public static f(Ldefpackage/qs;I)I
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Ldefpackage/qs;->b(I)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    cmp-long v0, p0, v0

    .line 8
    .line 9
    if-ltz v0, :cond_0

    .line 10
    .line 11
    long-to-int p0, p0

    .line 12
    return p0

    .line 13
    :cond_0
    const-string p0, "Unexpected end of stream"

    .line 14
    .line 15
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    return p0
.end method

.method public static j(Ljava/lang/String;II)V
    .locals 1

    .line 1
    const-string v0, "Corrupted input, "

    .line 2
    .line 3
    if-ltz p1, :cond_1

    .line 4
    .line 5
    if-ge p1, p2, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const-string p1, " value too big"

    .line 9
    .line 10
    invoke-static {v0, p0, p1}, Ldefpackage/xa3;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    const-string p1, " value negative"

    .line 19
    .line 20
    invoke-static {v0, p0, p1}, Ldefpackage/xa3;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final F()I
    .locals 2

    .line 1
    iget v0, p0, Ldefpackage/mo;->D:I

    .line 2
    .line 3
    iget-char v1, p0, Ldefpackage/mo;->H:C

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    iget v0, p0, Ldefpackage/mo;->A:I

    .line 8
    .line 9
    iget-object v1, p0, Ldefpackage/mo;->s:Ldefpackage/cx;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Ldefpackage/cx;->j(I)V

    .line 12
    .line 13
    .line 14
    iget v1, p0, Ldefpackage/mo;->D:I

    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    iput v1, p0, Ldefpackage/mo;->D:I

    .line 19
    .line 20
    const/4 v1, 0x7

    .line 21
    iput v1, p0, Ldefpackage/mo;->v:I

    .line 22
    .line 23
    return v0

    .line 24
    :cond_0
    iget v0, p0, Ldefpackage/mo;->C:I

    .line 25
    .line 26
    add-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    iput v0, p0, Ldefpackage/mo;->C:I

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    iput v0, p0, Ldefpackage/mo;->z:I

    .line 32
    .line 33
    invoke-virtual {p0}, Ldefpackage/mo;->v()I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    return p0
.end method

.method public final H()I
    .locals 5

    .line 1
    iget v0, p0, Ldefpackage/mo;->C:I

    .line 2
    .line 3
    iget v1, p0, Ldefpackage/mo;->o:I

    .line 4
    .line 5
    if-gt v0, v1, :cond_3

    .line 6
    .line 7
    iget v0, p0, Ldefpackage/mo;->A:I

    .line 8
    .line 9
    iput v0, p0, Ldefpackage/mo;->B:I

    .line 10
    .line 11
    iget-object v0, p0, Ldefpackage/mo;->I:Ldefpackage/lo;

    .line 12
    .line 13
    iget-object v1, v0, Ldefpackage/lo;->f:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, [B

    .line 16
    .line 17
    iget v2, p0, Ldefpackage/mo;->G:I

    .line 18
    .line 19
    aget-byte v1, v1, v2

    .line 20
    .line 21
    and-int/lit16 v1, v1, 0xff

    .line 22
    .line 23
    iget-object v0, v0, Ldefpackage/lo;->j:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, [I

    .line 26
    .line 27
    array-length v0, v0

    .line 28
    const-string v3, "su_tPos"

    .line 29
    .line 30
    invoke-static {v3, v2, v0}, Ldefpackage/mo;->j(Ljava/lang/String;II)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Ldefpackage/mo;->I:Ldefpackage/lo;

    .line 34
    .line 35
    iget-object v0, v0, Ldefpackage/lo;->j:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, [I

    .line 38
    .line 39
    iget v2, p0, Ldefpackage/mo;->G:I

    .line 40
    .line 41
    aget v0, v0, v2

    .line 42
    .line 43
    iput v0, p0, Ldefpackage/mo;->G:I

    .line 44
    .line 45
    iget v0, p0, Ldefpackage/mo;->E:I

    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    const/4 v3, 0x1

    .line 49
    if-nez v0, :cond_0

    .line 50
    .line 51
    iget v0, p0, Ldefpackage/mo;->F:I

    .line 52
    .line 53
    sget-object v4, Ldefpackage/j51;->g:[I

    .line 54
    .line 55
    aget v4, v4, v0

    .line 56
    .line 57
    sub-int/2addr v4, v3

    .line 58
    iput v4, p0, Ldefpackage/mo;->E:I

    .line 59
    .line 60
    add-int/2addr v0, v3

    .line 61
    iput v0, p0, Ldefpackage/mo;->F:I

    .line 62
    .line 63
    const/16 v4, 0x200

    .line 64
    .line 65
    if-ne v0, v4, :cond_1

    .line 66
    .line 67
    iput v2, p0, Ldefpackage/mo;->F:I

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_0
    sub-int/2addr v0, v3

    .line 71
    iput v0, p0, Ldefpackage/mo;->E:I

    .line 72
    .line 73
    :cond_1
    :goto_0
    iget v0, p0, Ldefpackage/mo;->E:I

    .line 74
    .line 75
    if-ne v0, v3, :cond_2

    .line 76
    .line 77
    move v2, v3

    .line 78
    :cond_2
    xor-int v0, v1, v2

    .line 79
    .line 80
    iput v0, p0, Ldefpackage/mo;->A:I

    .line 81
    .line 82
    iget v1, p0, Ldefpackage/mo;->C:I

    .line 83
    .line 84
    add-int/2addr v1, v3

    .line 85
    iput v1, p0, Ldefpackage/mo;->C:I

    .line 86
    .line 87
    const/4 v1, 0x3

    .line 88
    iput v1, p0, Ldefpackage/mo;->v:I

    .line 89
    .line 90
    iget-object p0, p0, Ldefpackage/mo;->s:Ldefpackage/cx;

    .line 91
    .line 92
    invoke-virtual {p0, v0}, Ldefpackage/cx;->j(I)V

    .line 93
    .line 94
    .line 95
    return v0

    .line 96
    :cond_3
    invoke-virtual {p0}, Ldefpackage/mo;->n()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Ldefpackage/mo;->q()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0}, Ldefpackage/mo;->u()I

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    return p0
.end method

.method public final J()I
    .locals 2

    .line 1
    iget v0, p0, Ldefpackage/mo;->D:I

    .line 2
    .line 3
    iget-char v1, p0, Ldefpackage/mo;->H:C

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Ldefpackage/mo;->s:Ldefpackage/cx;

    .line 8
    .line 9
    iget v1, p0, Ldefpackage/mo;->A:I

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ldefpackage/cx;->j(I)V

    .line 12
    .line 13
    .line 14
    iget v0, p0, Ldefpackage/mo;->D:I

    .line 15
    .line 16
    add-int/lit8 v0, v0, 0x1

    .line 17
    .line 18
    iput v0, p0, Ldefpackage/mo;->D:I

    .line 19
    .line 20
    iget p0, p0, Ldefpackage/mo;->A:I

    .line 21
    .line 22
    return p0

    .line 23
    :cond_0
    const/4 v0, 0x2

    .line 24
    iput v0, p0, Ldefpackage/mo;->v:I

    .line 25
    .line 26
    iget v0, p0, Ldefpackage/mo;->C:I

    .line 27
    .line 28
    add-int/lit8 v0, v0, 0x1

    .line 29
    .line 30
    iput v0, p0, Ldefpackage/mo;->C:I

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    iput v0, p0, Ldefpackage/mo;->z:I

    .line 34
    .line 35
    invoke-virtual {p0}, Ldefpackage/mo;->H()I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    return p0
.end method

.method public final close()V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/mo;->u:Ldefpackage/qs;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    :try_start_0
    invoke-virtual {v0}, Ldefpackage/qs;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    .line 9
    iput-object v1, p0, Ldefpackage/mo;->I:Ldefpackage/lo;

    .line 10
    .line 11
    iput-object v1, p0, Ldefpackage/mo;->u:Ldefpackage/qs;

    .line 12
    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception v0

    .line 15
    iput-object v1, p0, Ldefpackage/mo;->I:Ldefpackage/lo;

    .line 16
    .line 17
    iput-object v1, p0, Ldefpackage/mo;->u:Ldefpackage/qs;

    .line 18
    .line 19
    throw v0

    .line 20
    :cond_0
    return-void
.end method

.method public final n()V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/mo;->s:Ldefpackage/cx;

    .line 2
    .line 3
    iget v0, v0, Ldefpackage/cx;->a:I

    .line 4
    .line 5
    not-int v0, v0

    .line 6
    iget v1, p0, Ldefpackage/mo;->w:I

    .line 7
    .line 8
    if-ne v1, v0, :cond_0

    .line 9
    .line 10
    iget v1, p0, Ldefpackage/mo;->y:I

    .line 11
    .line 12
    shl-int/lit8 v2, v1, 0x1

    .line 13
    .line 14
    ushr-int/lit8 v1, v1, 0x1f

    .line 15
    .line 16
    or-int/2addr v1, v2

    .line 17
    xor-int/2addr v0, v1

    .line 18
    iput v0, p0, Ldefpackage/mo;->y:I

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    iget v0, p0, Ldefpackage/mo;->x:I

    .line 22
    .line 23
    shl-int/lit8 v2, v0, 0x1

    .line 24
    .line 25
    ushr-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    or-int/2addr v0, v2

    .line 28
    xor-int/2addr v0, v1

    .line 29
    iput v0, p0, Ldefpackage/mo;->y:I

    .line 30
    .line 31
    const-string p0, "BZip2 CRC error"

    .line 32
    .line 33
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final q()V
    .locals 39

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ldefpackage/mo;->u:Ldefpackage/qs;

    .line 4
    .line 5
    const/16 v2, 0x8

    .line 6
    .line 7
    invoke-static {v1, v2}, Ldefpackage/mo;->f(Ldefpackage/qs;I)I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    int-to-char v3, v3

    .line 12
    invoke-static {v1, v2}, Ldefpackage/mo;->f(Ldefpackage/qs;I)I

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    int-to-char v4, v4

    .line 17
    invoke-static {v1, v2}, Ldefpackage/mo;->f(Ldefpackage/qs;I)I

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    int-to-char v5, v5

    .line 22
    invoke-static {v1, v2}, Ldefpackage/mo;->f(Ldefpackage/qs;I)I

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    int-to-char v6, v6

    .line 27
    invoke-static {v1, v2}, Ldefpackage/mo;->f(Ldefpackage/qs;I)I

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    int-to-char v7, v7

    .line 32
    invoke-static {v1, v2}, Ldefpackage/mo;->f(Ldefpackage/qs;I)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    int-to-char v2, v2

    .line 37
    const/16 v8, 0x17

    .line 38
    .line 39
    const/16 v9, 0x20

    .line 40
    .line 41
    const/4 v10, 0x0

    .line 42
    if-ne v3, v8, :cond_2

    .line 43
    .line 44
    const/16 v11, 0x72

    .line 45
    .line 46
    if-ne v4, v11, :cond_2

    .line 47
    .line 48
    const/16 v11, 0x45

    .line 49
    .line 50
    if-ne v5, v11, :cond_2

    .line 51
    .line 52
    const/16 v11, 0x38

    .line 53
    .line 54
    if-ne v6, v11, :cond_2

    .line 55
    .line 56
    const/16 v11, 0x50

    .line 57
    .line 58
    if-ne v7, v11, :cond_2

    .line 59
    .line 60
    const/16 v11, 0x90

    .line 61
    .line 62
    if-eq v2, v11, :cond_0

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    iget-object v1, v0, Ldefpackage/mo;->u:Ldefpackage/qs;

    .line 66
    .line 67
    invoke-static {v1, v9}, Ldefpackage/mo;->f(Ldefpackage/qs;I)I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    iput v1, v0, Ldefpackage/mo;->x:I

    .line 72
    .line 73
    iput v10, v0, Ldefpackage/mo;->v:I

    .line 74
    .line 75
    const/4 v2, 0x0

    .line 76
    iput-object v2, v0, Ldefpackage/mo;->I:Ldefpackage/lo;

    .line 77
    .line 78
    iget v0, v0, Ldefpackage/mo;->y:I

    .line 79
    .line 80
    if-ne v1, v0, :cond_1

    .line 81
    .line 82
    return-void

    .line 83
    :cond_1
    const-string v0, "BZip2 CRC error"

    .line 84
    .line 85
    invoke-static {v0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_2
    :goto_0
    const/16 v11, 0x31

    .line 90
    .line 91
    if-ne v3, v11, :cond_33

    .line 92
    .line 93
    const/16 v3, 0x41

    .line 94
    .line 95
    if-ne v4, v3, :cond_33

    .line 96
    .line 97
    const/16 v3, 0x59

    .line 98
    .line 99
    if-ne v5, v3, :cond_33

    .line 100
    .line 101
    const/16 v4, 0x26

    .line 102
    .line 103
    if-ne v6, v4, :cond_33

    .line 104
    .line 105
    const/16 v4, 0x53

    .line 106
    .line 107
    if-ne v7, v4, :cond_33

    .line 108
    .line 109
    if-ne v2, v3, :cond_33

    .line 110
    .line 111
    invoke-static {v1, v9}, Ldefpackage/mo;->f(Ldefpackage/qs;I)I

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    iput v2, v0, Ldefpackage/mo;->w:I

    .line 116
    .line 117
    const/4 v2, 0x1

    .line 118
    invoke-static {v1, v2}, Ldefpackage/mo;->f(Ldefpackage/qs;I)I

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-ne v1, v2, :cond_3

    .line 123
    .line 124
    move v1, v2

    .line 125
    goto :goto_1

    .line 126
    :cond_3
    move v1, v10

    .line 127
    :goto_1
    iput-boolean v1, v0, Ldefpackage/mo;->r:Z

    .line 128
    .line 129
    iget-object v1, v0, Ldefpackage/mo;->I:Ldefpackage/lo;

    .line 130
    .line 131
    if-nez v1, :cond_4

    .line 132
    .line 133
    new-instance v1, Ldefpackage/lo;

    .line 134
    .line 135
    iget v3, v0, Ldefpackage/mo;->q:I

    .line 136
    .line 137
    invoke-direct {v1, v3}, Ldefpackage/lo;-><init>(I)V

    .line 138
    .line 139
    .line 140
    iput-object v1, v0, Ldefpackage/mo;->I:Ldefpackage/lo;

    .line 141
    .line 142
    :cond_4
    iget-object v1, v0, Ldefpackage/mo;->u:Ldefpackage/qs;

    .line 143
    .line 144
    const/16 v3, 0x18

    .line 145
    .line 146
    invoke-static {v1, v3}, Ldefpackage/mo;->f(Ldefpackage/qs;I)I

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    iput v3, v0, Ldefpackage/mo;->p:I

    .line 151
    .line 152
    iget-object v3, v0, Ldefpackage/mo;->u:Ldefpackage/qs;

    .line 153
    .line 154
    iget-object v4, v0, Ldefpackage/mo;->I:Ldefpackage/lo;

    .line 155
    .line 156
    iget-object v5, v4, Ldefpackage/lo;->a:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v5, [Z

    .line 159
    .line 160
    iget-object v6, v4, Ldefpackage/lo;->e:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v6, [B

    .line 163
    .line 164
    iget-object v7, v4, Ldefpackage/lo;->c:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v7, [B

    .line 167
    .line 168
    iget-object v12, v4, Ldefpackage/lo;->d:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v12, [B

    .line 171
    .line 172
    move v13, v10

    .line 173
    move v14, v13

    .line 174
    :goto_2
    const/16 v15, 0x10

    .line 175
    .line 176
    if-ge v13, v15, :cond_6

    .line 177
    .line 178
    invoke-static {v3, v2}, Ldefpackage/mo;->f(Ldefpackage/qs;I)I

    .line 179
    .line 180
    .line 181
    move-result v15

    .line 182
    if-eqz v15, :cond_5

    .line 183
    .line 184
    shl-int v15, v2, v13

    .line 185
    .line 186
    or-int/2addr v14, v15

    .line 187
    :cond_5
    add-int/lit8 v13, v13, 0x1

    .line 188
    .line 189
    goto :goto_2

    .line 190
    :cond_6
    invoke-static {v5, v10}, Ljava/util/Arrays;->fill([ZZ)V

    .line 191
    .line 192
    .line 193
    move v13, v10

    .line 194
    :goto_3
    if-ge v13, v15, :cond_9

    .line 195
    .line 196
    shl-int v16, v2, v13

    .line 197
    .line 198
    and-int v16, v14, v16

    .line 199
    .line 200
    if-eqz v16, :cond_8

    .line 201
    .line 202
    shl-int/lit8 v16, v13, 0x4

    .line 203
    .line 204
    move v9, v10

    .line 205
    :goto_4
    if-ge v9, v15, :cond_8

    .line 206
    .line 207
    invoke-static {v3, v2}, Ldefpackage/mo;->f(Ldefpackage/qs;I)I

    .line 208
    .line 209
    .line 210
    move-result v18

    .line 211
    if-eqz v18, :cond_7

    .line 212
    .line 213
    add-int v18, v16, v9

    .line 214
    .line 215
    aput-boolean v2, v5, v18

    .line 216
    .line 217
    :cond_7
    add-int/lit8 v9, v9, 0x1

    .line 218
    .line 219
    goto :goto_4

    .line 220
    :cond_8
    add-int/lit8 v13, v13, 0x1

    .line 221
    .line 222
    const/16 v9, 0x20

    .line 223
    .line 224
    goto :goto_3

    .line 225
    :cond_9
    iget-object v5, v0, Ldefpackage/mo;->I:Ldefpackage/lo;

    .line 226
    .line 227
    iget-object v9, v5, Ldefpackage/lo;->a:Ljava/lang/Object;

    .line 228
    .line 229
    check-cast v9, [Z

    .line 230
    .line 231
    iget-object v5, v5, Ldefpackage/lo;->b:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v5, [B

    .line 234
    .line 235
    move v13, v10

    .line 236
    move v14, v13

    .line 237
    :goto_5
    const/16 v11, 0x100

    .line 238
    .line 239
    if-ge v13, v11, :cond_b

    .line 240
    .line 241
    aget-boolean v11, v9, v13

    .line 242
    .line 243
    if-eqz v11, :cond_a

    .line 244
    .line 245
    add-int/lit8 v11, v14, 0x1

    .line 246
    .line 247
    move/from16 v18, v10

    .line 248
    .line 249
    int-to-byte v10, v13

    .line 250
    aput-byte v10, v5, v14

    .line 251
    .line 252
    move v14, v11

    .line 253
    goto :goto_6

    .line 254
    :cond_a
    move/from16 v18, v10

    .line 255
    .line 256
    :goto_6
    add-int/lit8 v13, v13, 0x1

    .line 257
    .line 258
    move/from16 v10, v18

    .line 259
    .line 260
    goto :goto_5

    .line 261
    :cond_b
    move/from16 v18, v10

    .line 262
    .line 263
    iput v14, v0, Ldefpackage/mo;->t:I

    .line 264
    .line 265
    add-int/lit8 v14, v14, 0x2

    .line 266
    .line 267
    const/4 v5, 0x3

    .line 268
    invoke-static {v3, v5}, Ldefpackage/mo;->f(Ldefpackage/qs;I)I

    .line 269
    .line 270
    .line 271
    move-result v5

    .line 272
    const/16 v9, 0xf

    .line 273
    .line 274
    invoke-static {v3, v9}, Ldefpackage/mo;->f(Ldefpackage/qs;I)I

    .line 275
    .line 276
    .line 277
    move-result v9

    .line 278
    if-ltz v9, :cond_32

    .line 279
    .line 280
    const/16 v10, 0x103

    .line 281
    .line 282
    const-string v13, "alphaSize"

    .line 283
    .line 284
    invoke-static {v13, v14, v10}, Ldefpackage/mo;->j(Ljava/lang/String;II)V

    .line 285
    .line 286
    .line 287
    const/4 v10, 0x7

    .line 288
    const-string v13, "nGroups"

    .line 289
    .line 290
    invoke-static {v13, v5, v10}, Ldefpackage/mo;->j(Ljava/lang/String;II)V

    .line 291
    .line 292
    .line 293
    move/from16 v10, v18

    .line 294
    .line 295
    :goto_7
    const/16 v13, 0x4652

    .line 296
    .line 297
    if-ge v10, v9, :cond_e

    .line 298
    .line 299
    move/from16 v15, v18

    .line 300
    .line 301
    :goto_8
    invoke-static {v3, v2}, Ldefpackage/mo;->f(Ldefpackage/qs;I)I

    .line 302
    .line 303
    .line 304
    move-result v20

    .line 305
    if-eqz v20, :cond_c

    .line 306
    .line 307
    add-int/lit8 v15, v15, 0x1

    .line 308
    .line 309
    goto :goto_8

    .line 310
    :cond_c
    if-ge v10, v13, :cond_d

    .line 311
    .line 312
    int-to-byte v13, v15

    .line 313
    aput-byte v13, v12, v10

    .line 314
    .line 315
    :cond_d
    add-int/lit8 v10, v10, 0x1

    .line 316
    .line 317
    const/16 v15, 0x10

    .line 318
    .line 319
    goto :goto_7

    .line 320
    :cond_e
    if-le v9, v13, :cond_f

    .line 321
    .line 322
    move v9, v13

    .line 323
    :cond_f
    move v10, v5

    .line 324
    :goto_9
    const/4 v15, -0x1

    .line 325
    add-int/2addr v10, v15

    .line 326
    if-ltz v10, :cond_10

    .line 327
    .line 328
    int-to-byte v15, v10

    .line 329
    aput-byte v15, v6, v10

    .line 330
    .line 331
    goto :goto_9

    .line 332
    :cond_10
    move/from16 v20, v15

    .line 333
    .line 334
    move/from16 v10, v18

    .line 335
    .line 336
    :goto_a
    const/4 v15, 0x6

    .line 337
    if-ge v10, v9, :cond_12

    .line 338
    .line 339
    aget-byte v13, v12, v10

    .line 340
    .line 341
    and-int/lit16 v13, v13, 0xff

    .line 342
    .line 343
    const-string v11, "selectorMtf"

    .line 344
    .line 345
    invoke-static {v11, v13, v15}, Ldefpackage/mo;->j(Ljava/lang/String;II)V

    .line 346
    .line 347
    .line 348
    aget-byte v11, v6, v13

    .line 349
    .line 350
    :goto_b
    if-lez v13, :cond_11

    .line 351
    .line 352
    add-int/lit8 v15, v13, -0x1

    .line 353
    .line 354
    aget-byte v15, v6, v15

    .line 355
    .line 356
    aput-byte v15, v6, v13

    .line 357
    .line 358
    add-int/lit8 v13, v13, -0x1

    .line 359
    .line 360
    goto :goto_b

    .line 361
    :cond_11
    aput-byte v11, v6, v18

    .line 362
    .line 363
    aput-byte v11, v7, v10

    .line 364
    .line 365
    add-int/lit8 v10, v10, 0x1

    .line 366
    .line 367
    const/16 v11, 0x100

    .line 368
    .line 369
    const/16 v13, 0x4652

    .line 370
    .line 371
    goto :goto_a

    .line 372
    :cond_12
    iget-object v4, v4, Ldefpackage/lo;->o:Ljava/lang/Object;

    .line 373
    .line 374
    check-cast v4, [[C

    .line 375
    .line 376
    move/from16 v6, v18

    .line 377
    .line 378
    :goto_c
    if-ge v6, v5, :cond_16

    .line 379
    .line 380
    const/4 v7, 0x5

    .line 381
    invoke-static {v3, v7}, Ldefpackage/mo;->f(Ldefpackage/qs;I)I

    .line 382
    .line 383
    .line 384
    move-result v7

    .line 385
    aget-object v9, v4, v6

    .line 386
    .line 387
    move/from16 v10, v18

    .line 388
    .line 389
    :goto_d
    if-ge v10, v14, :cond_15

    .line 390
    .line 391
    :goto_e
    invoke-static {v3, v2}, Ldefpackage/mo;->f(Ldefpackage/qs;I)I

    .line 392
    .line 393
    .line 394
    move-result v11

    .line 395
    if-eqz v11, :cond_14

    .line 396
    .line 397
    invoke-static {v3, v2}, Ldefpackage/mo;->f(Ldefpackage/qs;I)I

    .line 398
    .line 399
    .line 400
    move-result v11

    .line 401
    if-eqz v11, :cond_13

    .line 402
    .line 403
    move/from16 v11, v20

    .line 404
    .line 405
    goto :goto_f

    .line 406
    :cond_13
    move v11, v2

    .line 407
    :goto_f
    add-int/2addr v7, v11

    .line 408
    goto :goto_e

    .line 409
    :cond_14
    int-to-char v11, v7

    .line 410
    aput-char v11, v9, v10

    .line 411
    .line 412
    add-int/lit8 v10, v10, 0x1

    .line 413
    .line 414
    goto :goto_d

    .line 415
    :cond_15
    add-int/lit8 v6, v6, 0x1

    .line 416
    .line 417
    goto :goto_c

    .line 418
    :cond_16
    iget-object v3, v0, Ldefpackage/mo;->I:Ldefpackage/lo;

    .line 419
    .line 420
    iget-object v4, v3, Ldefpackage/lo;->o:Ljava/lang/Object;

    .line 421
    .line 422
    check-cast v4, [[C

    .line 423
    .line 424
    iget-object v6, v3, Ldefpackage/lo;->h:Ljava/lang/Object;

    .line 425
    .line 426
    check-cast v6, [I

    .line 427
    .line 428
    iget-object v7, v3, Ldefpackage/lo;->k:Ljava/lang/Object;

    .line 429
    .line 430
    check-cast v7, [[I

    .line 431
    .line 432
    iget-object v9, v3, Ldefpackage/lo;->l:Ljava/lang/Object;

    .line 433
    .line 434
    check-cast v9, [[I

    .line 435
    .line 436
    iget-object v3, v3, Ldefpackage/lo;->m:Ljava/lang/Object;

    .line 437
    .line 438
    check-cast v3, [[I

    .line 439
    .line 440
    move/from16 v10, v18

    .line 441
    .line 442
    :goto_10
    if-ge v10, v5, :cond_22

    .line 443
    .line 444
    aget-object v12, v4, v10

    .line 445
    .line 446
    move/from16 v23, v2

    .line 447
    .line 448
    move/from16 v22, v14

    .line 449
    .line 450
    move/from16 v13, v18

    .line 451
    .line 452
    const/16 v2, 0x20

    .line 453
    .line 454
    :goto_11
    add-int/lit8 v22, v22, -0x1

    .line 455
    .line 456
    if-ltz v22, :cond_19

    .line 457
    .line 458
    aget-char v15, v12, v22

    .line 459
    .line 460
    if-le v15, v13, :cond_17

    .line 461
    .line 462
    move v13, v15

    .line 463
    :cond_17
    if-ge v15, v2, :cond_18

    .line 464
    .line 465
    move v2, v15

    .line 466
    :cond_18
    const/4 v15, 0x6

    .line 467
    goto :goto_11

    .line 468
    :cond_19
    aget-object v12, v7, v10

    .line 469
    .line 470
    aget-object v15, v9, v10

    .line 471
    .line 472
    aget-object v22, v3, v10

    .line 473
    .line 474
    aget-object v25, v4, v10

    .line 475
    .line 476
    move v8, v2

    .line 477
    move/from16 v26, v18

    .line 478
    .line 479
    :goto_12
    if-gt v8, v13, :cond_1c

    .line 480
    .line 481
    move/from16 v11, v18

    .line 482
    .line 483
    :goto_13
    if-ge v11, v14, :cond_1b

    .line 484
    .line 485
    move/from16 v29, v2

    .line 486
    .line 487
    aget-char v2, v25, v11

    .line 488
    .line 489
    if-ne v2, v8, :cond_1a

    .line 490
    .line 491
    add-int/lit8 v2, v26, 0x1

    .line 492
    .line 493
    aput v11, v22, v26

    .line 494
    .line 495
    move/from16 v26, v2

    .line 496
    .line 497
    :cond_1a
    add-int/lit8 v11, v11, 0x1

    .line 498
    .line 499
    move/from16 v2, v29

    .line 500
    .line 501
    goto :goto_13

    .line 502
    :cond_1b
    move/from16 v29, v2

    .line 503
    .line 504
    add-int/lit8 v8, v8, 0x1

    .line 505
    .line 506
    goto :goto_12

    .line 507
    :cond_1c
    move/from16 v29, v2

    .line 508
    .line 509
    const/16 v2, 0x17

    .line 510
    .line 511
    :goto_14
    add-int/lit8 v2, v2, -0x1

    .line 512
    .line 513
    if-lez v2, :cond_1d

    .line 514
    .line 515
    aput v18, v15, v2

    .line 516
    .line 517
    aput v18, v12, v2

    .line 518
    .line 519
    goto :goto_14

    .line 520
    :cond_1d
    move/from16 v2, v18

    .line 521
    .line 522
    :goto_15
    if-ge v2, v14, :cond_1e

    .line 523
    .line 524
    aget-char v8, v25, v2

    .line 525
    .line 526
    const-string v11, "length"

    .line 527
    .line 528
    move/from16 v22, v2

    .line 529
    .line 530
    const/16 v2, 0x102

    .line 531
    .line 532
    invoke-static {v11, v8, v2}, Ldefpackage/mo;->j(Ljava/lang/String;II)V

    .line 533
    .line 534
    .line 535
    add-int/lit8 v8, v8, 0x1

    .line 536
    .line 537
    aget v2, v15, v8

    .line 538
    .line 539
    add-int/lit8 v2, v2, 0x1

    .line 540
    .line 541
    aput v2, v15, v8

    .line 542
    .line 543
    add-int/lit8 v2, v22, 0x1

    .line 544
    .line 545
    goto :goto_15

    .line 546
    :cond_1e
    aget v2, v15, v18

    .line 547
    .line 548
    move/from16 v8, v23

    .line 549
    .line 550
    const/16 v11, 0x17

    .line 551
    .line 552
    :goto_16
    if-ge v8, v11, :cond_1f

    .line 553
    .line 554
    aget v22, v15, v8

    .line 555
    .line 556
    add-int v2, v2, v22

    .line 557
    .line 558
    aput v2, v15, v8

    .line 559
    .line 560
    add-int/lit8 v8, v8, 0x1

    .line 561
    .line 562
    goto :goto_16

    .line 563
    :cond_1f
    aget v2, v15, v29

    .line 564
    .line 565
    move/from16 v8, v18

    .line 566
    .line 567
    move/from16 v11, v29

    .line 568
    .line 569
    :goto_17
    if-gt v11, v13, :cond_20

    .line 570
    .line 571
    add-int/lit8 v22, v11, 0x1

    .line 572
    .line 573
    aget v25, v15, v22

    .line 574
    .line 575
    sub-int v2, v25, v2

    .line 576
    .line 577
    add-int/2addr v2, v8

    .line 578
    add-int/lit8 v8, v2, -0x1

    .line 579
    .line 580
    aput v8, v12, v11

    .line 581
    .line 582
    shl-int/lit8 v8, v2, 0x1

    .line 583
    .line 584
    move/from16 v11, v22

    .line 585
    .line 586
    move/from16 v2, v25

    .line 587
    .line 588
    goto :goto_17

    .line 589
    :cond_20
    add-int/lit8 v2, v29, 0x1

    .line 590
    .line 591
    :goto_18
    if-gt v2, v13, :cond_21

    .line 592
    .line 593
    add-int/lit8 v8, v2, -0x1

    .line 594
    .line 595
    aget v8, v12, v8

    .line 596
    .line 597
    add-int/lit8 v8, v8, 0x1

    .line 598
    .line 599
    shl-int/lit8 v8, v8, 0x1

    .line 600
    .line 601
    aget v11, v15, v2

    .line 602
    .line 603
    sub-int/2addr v8, v11

    .line 604
    aput v8, v15, v2

    .line 605
    .line 606
    add-int/lit8 v2, v2, 0x1

    .line 607
    .line 608
    goto :goto_18

    .line 609
    :cond_21
    aput v29, v6, v10

    .line 610
    .line 611
    add-int/lit8 v10, v10, 0x1

    .line 612
    .line 613
    move/from16 v2, v23

    .line 614
    .line 615
    const/16 v8, 0x17

    .line 616
    .line 617
    const/4 v15, 0x6

    .line 618
    goto/16 :goto_10

    .line 619
    .line 620
    :cond_22
    move/from16 v23, v2

    .line 621
    .line 622
    iget-object v2, v0, Ldefpackage/mo;->I:Ldefpackage/lo;

    .line 623
    .line 624
    iget-object v3, v2, Ldefpackage/lo;->f:Ljava/lang/Object;

    .line 625
    .line 626
    check-cast v3, [B

    .line 627
    .line 628
    iget-object v4, v2, Ldefpackage/lo;->g:Ljava/lang/Object;

    .line 629
    .line 630
    check-cast v4, [I

    .line 631
    .line 632
    iget-object v5, v2, Ldefpackage/lo;->c:Ljava/lang/Object;

    .line 633
    .line 634
    check-cast v5, [B

    .line 635
    .line 636
    iget-object v6, v2, Ldefpackage/lo;->b:Ljava/lang/Object;

    .line 637
    .line 638
    check-cast v6, [B

    .line 639
    .line 640
    iget-object v7, v2, Ldefpackage/lo;->n:Ljava/lang/Object;

    .line 641
    .line 642
    check-cast v7, [C

    .line 643
    .line 644
    iget-object v8, v2, Ldefpackage/lo;->h:Ljava/lang/Object;

    .line 645
    .line 646
    check-cast v8, [I

    .line 647
    .line 648
    iget-object v9, v2, Ldefpackage/lo;->k:Ljava/lang/Object;

    .line 649
    .line 650
    check-cast v9, [[I

    .line 651
    .line 652
    iget-object v10, v2, Ldefpackage/lo;->l:Ljava/lang/Object;

    .line 653
    .line 654
    check-cast v10, [[I

    .line 655
    .line 656
    iget-object v2, v2, Ldefpackage/lo;->m:Ljava/lang/Object;

    .line 657
    .line 658
    check-cast v2, [[I

    .line 659
    .line 660
    iget v11, v0, Ldefpackage/mo;->q:I

    .line 661
    .line 662
    const v12, 0x186a0

    .line 663
    .line 664
    .line 665
    mul-int/2addr v11, v12

    .line 666
    const/16 v12, 0x100

    .line 667
    .line 668
    :goto_19
    add-int/lit8 v12, v12, -0x1

    .line 669
    .line 670
    if-ltz v12, :cond_23

    .line 671
    .line 672
    int-to-char v13, v12

    .line 673
    aput-char v13, v7, v12

    .line 674
    .line 675
    aput v18, v4, v12

    .line 676
    .line 677
    goto :goto_19

    .line 678
    :cond_23
    iget v12, v0, Ldefpackage/mo;->t:I

    .line 679
    .line 680
    add-int/lit8 v12, v12, 0x1

    .line 681
    .line 682
    iget-object v13, v0, Ldefpackage/mo;->I:Ldefpackage/lo;

    .line 683
    .line 684
    iget-object v14, v13, Ldefpackage/lo;->c:Ljava/lang/Object;

    .line 685
    .line 686
    check-cast v14, [B

    .line 687
    .line 688
    aget-byte v14, v14, v18

    .line 689
    .line 690
    and-int/lit16 v14, v14, 0xff

    .line 691
    .line 692
    const-string v15, "zt"

    .line 693
    .line 694
    move-object/from16 v17, v2

    .line 695
    .line 696
    const/4 v2, 0x6

    .line 697
    invoke-static {v15, v14, v2}, Ldefpackage/mo;->j(Ljava/lang/String;II)V

    .line 698
    .line 699
    .line 700
    iget-object v2, v13, Ldefpackage/lo;->k:Ljava/lang/Object;

    .line 701
    .line 702
    check-cast v2, [[I

    .line 703
    .line 704
    aget-object v2, v2, v14

    .line 705
    .line 706
    move-object/from16 v22, v2

    .line 707
    .line 708
    iget-object v2, v13, Ldefpackage/lo;->h:Ljava/lang/Object;

    .line 709
    .line 710
    check-cast v2, [I

    .line 711
    .line 712
    aget v2, v2, v14

    .line 713
    .line 714
    move-object/from16 v25, v4

    .line 715
    .line 716
    const-string v4, "zn"

    .line 717
    .line 718
    move-object/from16 v26, v5

    .line 719
    .line 720
    const/16 v5, 0x102

    .line 721
    .line 722
    invoke-static {v4, v2, v5}, Ldefpackage/mo;->j(Ljava/lang/String;II)V

    .line 723
    .line 724
    .line 725
    iget-object v5, v0, Ldefpackage/mo;->u:Ldefpackage/qs;

    .line 726
    .line 727
    invoke-static {v5, v2}, Ldefpackage/mo;->f(Ldefpackage/qs;I)I

    .line 728
    .line 729
    .line 730
    move-result v5

    .line 731
    move/from16 v27, v2

    .line 732
    .line 733
    :goto_1a
    aget v2, v22, v27

    .line 734
    .line 735
    if-le v5, v2, :cond_24

    .line 736
    .line 737
    add-int/lit8 v2, v27, 0x1

    .line 738
    .line 739
    move/from16 v29, v5

    .line 740
    .line 741
    const/16 v5, 0x102

    .line 742
    .line 743
    invoke-static {v4, v2, v5}, Ldefpackage/mo;->j(Ljava/lang/String;II)V

    .line 744
    .line 745
    .line 746
    shl-int/lit8 v5, v29, 0x1

    .line 747
    .line 748
    move/from16 v27, v2

    .line 749
    .line 750
    iget-object v2, v0, Ldefpackage/mo;->u:Ldefpackage/qs;

    .line 751
    .line 752
    move/from16 v29, v5

    .line 753
    .line 754
    move/from16 v5, v23

    .line 755
    .line 756
    invoke-static {v2, v5}, Ldefpackage/mo;->f(Ldefpackage/qs;I)I

    .line 757
    .line 758
    .line 759
    move-result v2

    .line 760
    or-int v5, v29, v2

    .line 761
    .line 762
    const/16 v23, 0x1

    .line 763
    .line 764
    goto :goto_1a

    .line 765
    :cond_24
    move/from16 v29, v5

    .line 766
    .line 767
    iget-object v2, v13, Ldefpackage/lo;->l:Ljava/lang/Object;

    .line 768
    .line 769
    check-cast v2, [[I

    .line 770
    .line 771
    aget-object v2, v2, v14

    .line 772
    .line 773
    aget v2, v2, v27

    .line 774
    .line 775
    sub-int v5, v29, v2

    .line 776
    .line 777
    const-string v2, "zvec"

    .line 778
    .line 779
    move-object/from16 v22, v6

    .line 780
    .line 781
    const/16 v6, 0x102

    .line 782
    .line 783
    invoke-static {v2, v5, v6}, Ldefpackage/mo;->j(Ljava/lang/String;II)V

    .line 784
    .line 785
    .line 786
    iget-object v6, v13, Ldefpackage/lo;->m:Ljava/lang/Object;

    .line 787
    .line 788
    check-cast v6, [[I

    .line 789
    .line 790
    aget-object v6, v6, v14

    .line 791
    .line 792
    aget v5, v6, v5

    .line 793
    .line 794
    aget-byte v6, v26, v18

    .line 795
    .line 796
    and-int/lit16 v6, v6, 0xff

    .line 797
    .line 798
    const/4 v13, 0x6

    .line 799
    invoke-static {v15, v6, v13}, Ldefpackage/mo;->j(Ljava/lang/String;II)V

    .line 800
    .line 801
    .line 802
    aget-object v13, v10, v6

    .line 803
    .line 804
    aget-object v14, v9, v6

    .line 805
    .line 806
    aget-object v27, v17, v6

    .line 807
    .line 808
    aget v6, v8, v6

    .line 809
    .line 810
    move/from16 v30, v6

    .line 811
    .line 812
    move/from16 v6, v20

    .line 813
    .line 814
    move-object/from16 v29, v27

    .line 815
    .line 816
    const/16 v31, 0x31

    .line 817
    .line 818
    move/from16 v27, v18

    .line 819
    .line 820
    :goto_1b
    if-eq v5, v12, :cond_31

    .line 821
    .line 822
    move-object/from16 v32, v8

    .line 823
    .line 824
    const-string v8, "groupNo"

    .line 825
    .line 826
    move-object/from16 v33, v9

    .line 827
    .line 828
    const-string v9, "yy"

    .line 829
    .line 830
    move-object/from16 v34, v10

    .line 831
    .line 832
    const-string v10, " exceeds "

    .line 833
    .line 834
    move/from16 v35, v12

    .line 835
    .line 836
    if-eqz v5, :cond_25

    .line 837
    .line 838
    const/4 v12, 0x1

    .line 839
    if-ne v5, v12, :cond_26

    .line 840
    .line 841
    :cond_25
    move-object/from16 v36, v13

    .line 842
    .line 843
    const/16 v13, 0x10

    .line 844
    .line 845
    goto/16 :goto_22

    .line 846
    .line 847
    :cond_26
    add-int/lit8 v6, v6, 0x1

    .line 848
    .line 849
    if-ge v6, v11, :cond_2b

    .line 850
    .line 851
    const/16 v10, 0x101

    .line 852
    .line 853
    const-string v12, "nextSym"

    .line 854
    .line 855
    invoke-static {v12, v5, v10}, Ldefpackage/mo;->j(Ljava/lang/String;II)V

    .line 856
    .line 857
    .line 858
    add-int/lit8 v10, v5, -0x1

    .line 859
    .line 860
    aget-char v12, v7, v10

    .line 861
    .line 862
    move-object/from16 v36, v13

    .line 863
    .line 864
    const/16 v13, 0x100

    .line 865
    .line 866
    invoke-static {v9, v12, v13}, Ldefpackage/mo;->j(Ljava/lang/String;II)V

    .line 867
    .line 868
    .line 869
    aget-byte v9, v22, v12

    .line 870
    .line 871
    and-int/lit16 v13, v9, 0xff

    .line 872
    .line 873
    aget v37, v25, v13

    .line 874
    .line 875
    const/16 v23, 0x1

    .line 876
    .line 877
    add-int/lit8 v37, v37, 0x1

    .line 878
    .line 879
    aput v37, v25, v13

    .line 880
    .line 881
    aput-byte v9, v3, v6

    .line 882
    .line 883
    const/16 v13, 0x10

    .line 884
    .line 885
    if-gt v5, v13, :cond_28

    .line 886
    .line 887
    :goto_1c
    if-lez v10, :cond_27

    .line 888
    .line 889
    add-int/lit8 v5, v10, -0x1

    .line 890
    .line 891
    aget-char v9, v7, v5

    .line 892
    .line 893
    aput-char v9, v7, v10

    .line 894
    .line 895
    move v10, v5

    .line 896
    goto :goto_1c

    .line 897
    :cond_27
    move/from16 v5, v18

    .line 898
    .line 899
    goto :goto_1d

    .line 900
    :cond_28
    move/from16 v5, v18

    .line 901
    .line 902
    const/4 v9, 0x1

    .line 903
    invoke-static {v7, v5, v7, v9, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 904
    .line 905
    .line 906
    :goto_1d
    aput-char v12, v7, v5

    .line 907
    .line 908
    if-nez v31, :cond_29

    .line 909
    .line 910
    add-int/lit8 v5, v27, 0x1

    .line 911
    .line 912
    const/16 v9, 0x4652

    .line 913
    .line 914
    invoke-static {v8, v5, v9}, Ldefpackage/mo;->j(Ljava/lang/String;II)V

    .line 915
    .line 916
    .line 917
    aget-byte v8, v26, v5

    .line 918
    .line 919
    and-int/lit16 v8, v8, 0xff

    .line 920
    .line 921
    const/4 v9, 0x6

    .line 922
    invoke-static {v15, v8, v9}, Ldefpackage/mo;->j(Ljava/lang/String;II)V

    .line 923
    .line 924
    .line 925
    aget-object v9, v34, v8

    .line 926
    .line 927
    aget-object v10, v33, v8

    .line 928
    .line 929
    aget-object v12, v17, v8

    .line 930
    .line 931
    aget v8, v32, v8

    .line 932
    .line 933
    move/from16 v27, v5

    .line 934
    .line 935
    move-object/from16 v36, v9

    .line 936
    .line 937
    move-object v14, v10

    .line 938
    move-object/from16 v29, v12

    .line 939
    .line 940
    const/16 v31, 0x31

    .line 941
    .line 942
    :goto_1e
    const/16 v5, 0x102

    .line 943
    .line 944
    goto :goto_1f

    .line 945
    :cond_29
    add-int/lit8 v31, v31, -0x1

    .line 946
    .line 947
    move/from16 v8, v30

    .line 948
    .line 949
    goto :goto_1e

    .line 950
    :goto_1f
    invoke-static {v4, v8, v5}, Ldefpackage/mo;->j(Ljava/lang/String;II)V

    .line 951
    .line 952
    .line 953
    invoke-static {v1, v8}, Ldefpackage/mo;->f(Ldefpackage/qs;I)I

    .line 954
    .line 955
    .line 956
    move-result v9

    .line 957
    move v10, v8

    .line 958
    :goto_20
    aget v12, v14, v10

    .line 959
    .line 960
    if-le v9, v12, :cond_2a

    .line 961
    .line 962
    add-int/lit8 v10, v10, 0x1

    .line 963
    .line 964
    invoke-static {v4, v10, v5}, Ldefpackage/mo;->j(Ljava/lang/String;II)V

    .line 965
    .line 966
    .line 967
    shl-int/lit8 v9, v9, 0x1

    .line 968
    .line 969
    const/4 v12, 0x1

    .line 970
    invoke-static {v1, v12}, Ldefpackage/mo;->f(Ldefpackage/qs;I)I

    .line 971
    .line 972
    .line 973
    move-result v19

    .line 974
    or-int v9, v9, v19

    .line 975
    .line 976
    goto :goto_20

    .line 977
    :cond_2a
    aget v10, v36, v10

    .line 978
    .line 979
    sub-int/2addr v9, v10

    .line 980
    invoke-static {v2, v9, v5}, Ldefpackage/mo;->j(Ljava/lang/String;II)V

    .line 981
    .line 982
    .line 983
    aget v5, v29, v9

    .line 984
    .line 985
    move/from16 v30, v8

    .line 986
    .line 987
    move-object/from16 v8, v32

    .line 988
    .line 989
    move-object/from16 v9, v33

    .line 990
    .line 991
    move-object/from16 v10, v34

    .line 992
    .line 993
    move/from16 v12, v35

    .line 994
    .line 995
    move-object/from16 v13, v36

    .line 996
    .line 997
    :goto_21
    const/16 v18, 0x0

    .line 998
    .line 999
    goto/16 :goto_1b

    .line 1000
    .line 1001
    :cond_2b
    const-string v0, "Block overrun in MTF, "

    .line 1002
    .line 1003
    invoke-static {v6, v11, v0, v10}, Ldefpackage/xa3;->e(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v0

    .line 1007
    invoke-static {v0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 1008
    .line 1009
    .line 1010
    return-void

    .line 1011
    :goto_22
    move/from16 v19, v20

    .line 1012
    .line 1013
    const/4 v12, 0x1

    .line 1014
    :goto_23
    if-nez v5, :cond_2c

    .line 1015
    .line 1016
    add-int v19, v19, v12

    .line 1017
    .line 1018
    goto :goto_24

    .line 1019
    :cond_2c
    const/4 v13, 0x1

    .line 1020
    if-ne v5, v13, :cond_2f

    .line 1021
    .line 1022
    shl-int/lit8 v5, v12, 0x1

    .line 1023
    .line 1024
    add-int v19, v19, v5

    .line 1025
    .line 1026
    :goto_24
    if-nez v31, :cond_2d

    .line 1027
    .line 1028
    add-int/lit8 v5, v27, 0x1

    .line 1029
    .line 1030
    const/16 v13, 0x4652

    .line 1031
    .line 1032
    invoke-static {v8, v5, v13}, Ldefpackage/mo;->j(Ljava/lang/String;II)V

    .line 1033
    .line 1034
    .line 1035
    aget-byte v14, v26, v5

    .line 1036
    .line 1037
    and-int/lit16 v14, v14, 0xff

    .line 1038
    .line 1039
    const/4 v13, 0x6

    .line 1040
    invoke-static {v15, v14, v13}, Ldefpackage/mo;->j(Ljava/lang/String;II)V

    .line 1041
    .line 1042
    .line 1043
    aget-object v36, v34, v14

    .line 1044
    .line 1045
    aget-object v24, v33, v14

    .line 1046
    .line 1047
    aget-object v29, v17, v14

    .line 1048
    .line 1049
    aget v30, v32, v14

    .line 1050
    .line 1051
    move/from16 v27, v5

    .line 1052
    .line 1053
    move-object/from16 v14, v24

    .line 1054
    .line 1055
    const/16 v31, 0x31

    .line 1056
    .line 1057
    :goto_25
    move/from16 v5, v30

    .line 1058
    .line 1059
    const/16 v13, 0x102

    .line 1060
    .line 1061
    goto :goto_26

    .line 1062
    :cond_2d
    const/4 v13, 0x6

    .line 1063
    add-int/lit8 v31, v31, -0x1

    .line 1064
    .line 1065
    goto :goto_25

    .line 1066
    :goto_26
    invoke-static {v4, v5, v13}, Ldefpackage/mo;->j(Ljava/lang/String;II)V

    .line 1067
    .line 1068
    .line 1069
    invoke-static {v1, v5}, Ldefpackage/mo;->f(Ldefpackage/qs;I)I

    .line 1070
    .line 1071
    .line 1072
    move-result v28

    .line 1073
    move/from16 v30, v5

    .line 1074
    .line 1075
    move/from16 v13, v28

    .line 1076
    .line 1077
    move/from16 v28, v30

    .line 1078
    .line 1079
    :goto_27
    aget v5, v14, v28

    .line 1080
    .line 1081
    if-le v13, v5, :cond_2e

    .line 1082
    .line 1083
    add-int/lit8 v5, v28, 0x1

    .line 1084
    .line 1085
    move-object/from16 v38, v7

    .line 1086
    .line 1087
    const/16 v7, 0x102

    .line 1088
    .line 1089
    invoke-static {v4, v5, v7}, Ldefpackage/mo;->j(Ljava/lang/String;II)V

    .line 1090
    .line 1091
    .line 1092
    shl-int/lit8 v13, v13, 0x1

    .line 1093
    .line 1094
    const/4 v7, 0x1

    .line 1095
    invoke-static {v1, v7}, Ldefpackage/mo;->f(Ldefpackage/qs;I)I

    .line 1096
    .line 1097
    .line 1098
    move-result v28

    .line 1099
    or-int v13, v13, v28

    .line 1100
    .line 1101
    move/from16 v28, v5

    .line 1102
    .line 1103
    move-object/from16 v7, v38

    .line 1104
    .line 1105
    goto :goto_27

    .line 1106
    :cond_2e
    move-object/from16 v38, v7

    .line 1107
    .line 1108
    aget v5, v36, v28

    .line 1109
    .line 1110
    sub-int/2addr v13, v5

    .line 1111
    const/16 v7, 0x102

    .line 1112
    .line 1113
    invoke-static {v2, v13, v7}, Ldefpackage/mo;->j(Ljava/lang/String;II)V

    .line 1114
    .line 1115
    .line 1116
    aget v5, v29, v13

    .line 1117
    .line 1118
    shl-int/lit8 v12, v12, 0x1

    .line 1119
    .line 1120
    move-object/from16 v7, v38

    .line 1121
    .line 1122
    const/16 v13, 0x10

    .line 1123
    .line 1124
    goto :goto_23

    .line 1125
    :cond_2f
    move-object/from16 v38, v7

    .line 1126
    .line 1127
    const/16 v7, 0x102

    .line 1128
    .line 1129
    const/16 v18, 0x0

    .line 1130
    .line 1131
    aget-char v8, v38, v18

    .line 1132
    .line 1133
    const/16 v13, 0x100

    .line 1134
    .line 1135
    invoke-static {v9, v8, v13}, Ldefpackage/mo;->j(Ljava/lang/String;II)V

    .line 1136
    .line 1137
    .line 1138
    aget-byte v8, v22, v8

    .line 1139
    .line 1140
    and-int/lit16 v9, v8, 0xff

    .line 1141
    .line 1142
    aget v12, v25, v9

    .line 1143
    .line 1144
    add-int/lit8 v21, v19, 0x1

    .line 1145
    .line 1146
    add-int v21, v21, v12

    .line 1147
    .line 1148
    aput v21, v25, v9

    .line 1149
    .line 1150
    add-int/lit8 v6, v6, 0x1

    .line 1151
    .line 1152
    add-int v9, v6, v19

    .line 1153
    .line 1154
    add-int/lit8 v12, v9, 0x1

    .line 1155
    .line 1156
    invoke-static {v3, v6, v12, v8}, Ljava/util/Arrays;->fill([BIIB)V

    .line 1157
    .line 1158
    .line 1159
    if-ge v9, v11, :cond_30

    .line 1160
    .line 1161
    move v6, v9

    .line 1162
    move-object/from16 v8, v32

    .line 1163
    .line 1164
    move-object/from16 v9, v33

    .line 1165
    .line 1166
    move-object/from16 v10, v34

    .line 1167
    .line 1168
    move/from16 v12, v35

    .line 1169
    .line 1170
    move-object/from16 v13, v36

    .line 1171
    .line 1172
    move-object/from16 v7, v38

    .line 1173
    .line 1174
    goto/16 :goto_21

    .line 1175
    .line 1176
    :cond_30
    const-string v0, "Block overrun while expanding RLE in MTF, "

    .line 1177
    .line 1178
    invoke-static {v9, v11, v0, v10}, Ldefpackage/xa3;->e(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1179
    .line 1180
    .line 1181
    move-result-object v0

    .line 1182
    invoke-static {v0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 1183
    .line 1184
    .line 1185
    return-void

    .line 1186
    :cond_31
    iput v6, v0, Ldefpackage/mo;->o:I

    .line 1187
    .line 1188
    iget-object v1, v0, Ldefpackage/mo;->s:Ldefpackage/cx;

    .line 1189
    .line 1190
    move/from16 v2, v20

    .line 1191
    .line 1192
    iput v2, v1, Ldefpackage/cx;->a:I

    .line 1193
    .line 1194
    const/4 v12, 0x1

    .line 1195
    iput v12, v0, Ldefpackage/mo;->v:I

    .line 1196
    .line 1197
    return-void

    .line 1198
    :cond_32
    const-string v0, "Corrupted input, nSelectors value negative"

    .line 1199
    .line 1200
    invoke-static {v0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 1201
    .line 1202
    .line 1203
    return-void

    .line 1204
    :cond_33
    move v5, v10

    .line 1205
    iput v5, v0, Ldefpackage/mo;->v:I

    .line 1206
    .line 1207
    const-string v0, "Bad block header"

    .line 1208
    .line 1209
    invoke-static {v0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 1210
    .line 1211
    .line 1212
    return-void
.end method

.method public final read()I
    .locals 3

    .line 92
    iget-object v0, p0, Ldefpackage/mo;->u:Ldefpackage/qs;

    if-eqz v0, :cond_1

    .line 93
    invoke-virtual {p0}, Ldefpackage/mo;->s()I

    move-result v0

    if-gez v0, :cond_0

    const/4 v1, -0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    :goto_0
    int-to-long v1, v1

    .line 94
    invoke-virtual {p0, v1, v2}, Ldefpackage/i90;->b(J)V

    return v0

    .line 95
    :cond_1
    const-string p0, "Stream closed"

    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0
.end method

.method public final read([BII)I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, ") < 0."

    .line 3
    .line 4
    const-string v2, "offs("

    .line 5
    .line 6
    if-ltz p2, :cond_6

    .line 7
    .line 8
    if-ltz p3, :cond_5

    .line 9
    .line 10
    add-int v1, p2, p3

    .line 11
    .line 12
    array-length v3, p1

    .line 13
    if-gt v1, v3, :cond_4

    .line 14
    .line 15
    iget-object v2, p0, Ldefpackage/mo;->u:Ldefpackage/qs;

    .line 16
    .line 17
    if-eqz v2, :cond_3

    .line 18
    .line 19
    if-nez p3, :cond_0

    .line 20
    .line 21
    return v0

    .line 22
    :cond_0
    move p3, p2

    .line 23
    :goto_0
    if-ge p3, v1, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0}, Ldefpackage/mo;->s()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-ltz v0, :cond_1

    .line 30
    .line 31
    add-int/lit8 v2, p3, 0x1

    .line 32
    .line 33
    int-to-byte v0, v0

    .line 34
    aput-byte v0, p1, p3

    .line 35
    .line 36
    const-wide/16 v3, 0x1

    .line 37
    .line 38
    invoke-virtual {p0, v3, v4}, Ldefpackage/i90;->b(J)V

    .line 39
    .line 40
    .line 41
    move p3, v2

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    if-ne p3, p2, :cond_2

    .line 44
    .line 45
    const/4 p0, -0x1

    .line 46
    return p0

    .line 47
    :cond_2
    sub-int/2addr p3, p2

    .line 48
    return p3

    .line 49
    :cond_3
    const-string p0, "Stream closed"

    .line 50
    .line 51
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return v0

    .line 55
    :cond_4
    const-string p0, ") + len("

    .line 56
    .line 57
    const-string v1, ") > dest.length("

    .line 58
    .line 59
    invoke-static {v2, p0, p2, p3, v1}, Ldefpackage/b11;->t(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    array-length p1, p1

    .line 64
    const-string p2, ")."

    .line 65
    .line 66
    invoke-static {p0, p1, p2}, Ldefpackage/f34;->i(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-static {p0}, Ldefpackage/kf2;->h(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return v0

    .line 74
    :cond_5
    const-string p0, "len("

    .line 75
    .line 76
    invoke-static {p3, p0, v1}, Ldefpackage/b11;->j(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-static {p0}, Ldefpackage/kf2;->h(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    return v0

    .line 84
    :cond_6
    invoke-static {p2, v2, v1}, Ldefpackage/b11;->j(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-static {p0}, Ldefpackage/kf2;->h(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    return v0
.end method

.method public final s()I
    .locals 7

    .line 1
    iget v0, p0, Ldefpackage/mo;->v:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "su_tPos"

    .line 5
    .line 6
    const/4 v3, 0x4

    .line 7
    const/4 v4, 0x1

    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-static {}, Ldefpackage/tb4;->a()V

    .line 12
    .line 13
    .line 14
    return v1

    .line 15
    :pswitch_0
    invoke-virtual {p0}, Ldefpackage/mo;->F()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :pswitch_1
    iget v0, p0, Ldefpackage/mo;->A:I

    .line 21
    .line 22
    iget v5, p0, Ldefpackage/mo;->B:I

    .line 23
    .line 24
    if-eq v0, v5, :cond_0

    .line 25
    .line 26
    iput v4, p0, Ldefpackage/mo;->z:I

    .line 27
    .line 28
    invoke-virtual {p0}, Ldefpackage/mo;->v()I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    return p0

    .line 33
    :cond_0
    iget v0, p0, Ldefpackage/mo;->z:I

    .line 34
    .line 35
    add-int/2addr v0, v4

    .line 36
    iput v0, p0, Ldefpackage/mo;->z:I

    .line 37
    .line 38
    if-lt v0, v3, :cond_1

    .line 39
    .line 40
    iget v0, p0, Ldefpackage/mo;->G:I

    .line 41
    .line 42
    iget-object v3, p0, Ldefpackage/mo;->I:Ldefpackage/lo;

    .line 43
    .line 44
    iget-object v3, v3, Ldefpackage/lo;->f:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v3, [B

    .line 47
    .line 48
    array-length v3, v3

    .line 49
    invoke-static {v2, v0, v3}, Ldefpackage/mo;->j(Ljava/lang/String;II)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Ldefpackage/mo;->I:Ldefpackage/lo;

    .line 53
    .line 54
    iget-object v2, v0, Ldefpackage/lo;->f:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v2, [B

    .line 57
    .line 58
    iget v3, p0, Ldefpackage/mo;->G:I

    .line 59
    .line 60
    aget-byte v2, v2, v3

    .line 61
    .line 62
    and-int/lit16 v2, v2, 0xff

    .line 63
    .line 64
    int-to-char v2, v2

    .line 65
    iput-char v2, p0, Ldefpackage/mo;->H:C

    .line 66
    .line 67
    iget-object v0, v0, Ldefpackage/lo;->j:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, [I

    .line 70
    .line 71
    aget v0, v0, v3

    .line 72
    .line 73
    iput v0, p0, Ldefpackage/mo;->G:I

    .line 74
    .line 75
    iput v1, p0, Ldefpackage/mo;->D:I

    .line 76
    .line 77
    invoke-virtual {p0}, Ldefpackage/mo;->F()I

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    return p0

    .line 82
    :cond_1
    invoke-virtual {p0}, Ldefpackage/mo;->v()I

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    return p0

    .line 87
    :pswitch_2
    invoke-static {}, Ldefpackage/tb4;->a()V

    .line 88
    .line 89
    .line 90
    return v1

    .line 91
    :pswitch_3
    invoke-virtual {p0}, Ldefpackage/mo;->J()I

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    return p0

    .line 96
    :pswitch_4
    iget v0, p0, Ldefpackage/mo;->A:I

    .line 97
    .line 98
    iget v5, p0, Ldefpackage/mo;->B:I

    .line 99
    .line 100
    const/4 v6, 0x2

    .line 101
    if-eq v0, v5, :cond_2

    .line 102
    .line 103
    iput v6, p0, Ldefpackage/mo;->v:I

    .line 104
    .line 105
    iput v4, p0, Ldefpackage/mo;->z:I

    .line 106
    .line 107
    invoke-virtual {p0}, Ldefpackage/mo;->H()I

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    return p0

    .line 112
    :cond_2
    iget v0, p0, Ldefpackage/mo;->z:I

    .line 113
    .line 114
    add-int/2addr v0, v4

    .line 115
    iput v0, p0, Ldefpackage/mo;->z:I

    .line 116
    .line 117
    if-lt v0, v3, :cond_6

    .line 118
    .line 119
    iget-object v0, p0, Ldefpackage/mo;->I:Ldefpackage/lo;

    .line 120
    .line 121
    iget-object v5, v0, Ldefpackage/lo;->f:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v5, [B

    .line 124
    .line 125
    iget v6, p0, Ldefpackage/mo;->G:I

    .line 126
    .line 127
    aget-byte v5, v5, v6

    .line 128
    .line 129
    and-int/lit16 v5, v5, 0xff

    .line 130
    .line 131
    int-to-char v5, v5

    .line 132
    iput-char v5, p0, Ldefpackage/mo;->H:C

    .line 133
    .line 134
    iget-object v0, v0, Ldefpackage/lo;->j:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v0, [I

    .line 137
    .line 138
    array-length v0, v0

    .line 139
    invoke-static {v2, v6, v0}, Ldefpackage/mo;->j(Ljava/lang/String;II)V

    .line 140
    .line 141
    .line 142
    iget-object v0, p0, Ldefpackage/mo;->I:Ldefpackage/lo;

    .line 143
    .line 144
    iget-object v0, v0, Ldefpackage/lo;->j:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v0, [I

    .line 147
    .line 148
    iget v2, p0, Ldefpackage/mo;->G:I

    .line 149
    .line 150
    aget v0, v0, v2

    .line 151
    .line 152
    iput v0, p0, Ldefpackage/mo;->G:I

    .line 153
    .line 154
    iget v0, p0, Ldefpackage/mo;->E:I

    .line 155
    .line 156
    if-nez v0, :cond_3

    .line 157
    .line 158
    iget v0, p0, Ldefpackage/mo;->F:I

    .line 159
    .line 160
    sget-object v2, Ldefpackage/j51;->g:[I

    .line 161
    .line 162
    aget v2, v2, v0

    .line 163
    .line 164
    sub-int/2addr v2, v4

    .line 165
    iput v2, p0, Ldefpackage/mo;->E:I

    .line 166
    .line 167
    add-int/2addr v0, v4

    .line 168
    iput v0, p0, Ldefpackage/mo;->F:I

    .line 169
    .line 170
    const/16 v2, 0x200

    .line 171
    .line 172
    if-ne v0, v2, :cond_4

    .line 173
    .line 174
    iput v1, p0, Ldefpackage/mo;->F:I

    .line 175
    .line 176
    goto :goto_0

    .line 177
    :cond_3
    sub-int/2addr v0, v4

    .line 178
    iput v0, p0, Ldefpackage/mo;->E:I

    .line 179
    .line 180
    :cond_4
    :goto_0
    iput v1, p0, Ldefpackage/mo;->D:I

    .line 181
    .line 182
    iput v3, p0, Ldefpackage/mo;->v:I

    .line 183
    .line 184
    iget v0, p0, Ldefpackage/mo;->E:I

    .line 185
    .line 186
    if-ne v0, v4, :cond_5

    .line 187
    .line 188
    iget-char v0, p0, Ldefpackage/mo;->H:C

    .line 189
    .line 190
    xor-int/2addr v0, v4

    .line 191
    int-to-char v0, v0

    .line 192
    iput-char v0, p0, Ldefpackage/mo;->H:C

    .line 193
    .line 194
    :cond_5
    invoke-virtual {p0}, Ldefpackage/mo;->J()I

    .line 195
    .line 196
    .line 197
    move-result p0

    .line 198
    return p0

    .line 199
    :cond_6
    iput v6, p0, Ldefpackage/mo;->v:I

    .line 200
    .line 201
    invoke-virtual {p0}, Ldefpackage/mo;->H()I

    .line 202
    .line 203
    .line 204
    move-result p0

    .line 205
    return p0

    .line 206
    :pswitch_5
    invoke-static {}, Ldefpackage/tb4;->a()V

    .line 207
    .line 208
    .line 209
    return v1

    .line 210
    :pswitch_6
    invoke-virtual {p0}, Ldefpackage/mo;->u()I

    .line 211
    .line 212
    .line 213
    move-result p0

    .line 214
    return p0

    .line 215
    :pswitch_7
    const/4 p0, -0x1

    .line 216
    return p0

    .line 217
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final u()I
    .locals 11

    .line 1
    iget v0, p0, Ldefpackage/mo;->v:I

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    iget-object v0, p0, Ldefpackage/mo;->I:Ldefpackage/lo;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_2

    .line 10
    .line 11
    :cond_0
    iget-object v1, v0, Ldefpackage/lo;->i:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, [I

    .line 14
    .line 15
    iget v2, p0, Ldefpackage/mo;->o:I

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    add-int/2addr v2, v3

    .line 19
    iget-object v4, v0, Ldefpackage/lo;->j:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v4, [I

    .line 22
    .line 23
    if-eqz v4, :cond_1

    .line 24
    .line 25
    array-length v5, v4

    .line 26
    if-ge v5, v2, :cond_2

    .line 27
    .line 28
    :cond_1
    new-array v4, v2, [I

    .line 29
    .line 30
    iput-object v4, v0, Ldefpackage/lo;->j:Ljava/lang/Object;

    .line 31
    .line 32
    :cond_2
    iget-object v5, v0, Ldefpackage/lo;->f:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v5, [B

    .line 35
    .line 36
    const/4 v6, 0x0

    .line 37
    aput v6, v1, v6

    .line 38
    .line 39
    iget-object v0, v0, Ldefpackage/lo;->g:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, [I

    .line 42
    .line 43
    const/16 v7, 0x100

    .line 44
    .line 45
    invoke-static {v0, v6, v1, v3, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 46
    .line 47
    .line 48
    aget v0, v1, v6

    .line 49
    .line 50
    :goto_0
    if-gt v3, v7, :cond_3

    .line 51
    .line 52
    aget v8, v1, v3

    .line 53
    .line 54
    add-int/2addr v0, v8

    .line 55
    aput v0, v1, v3

    .line 56
    .line 57
    add-int/lit8 v3, v3, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    iget v0, p0, Ldefpackage/mo;->o:I

    .line 61
    .line 62
    move v3, v6

    .line 63
    :goto_1
    if-gt v3, v0, :cond_4

    .line 64
    .line 65
    aget-byte v8, v5, v3

    .line 66
    .line 67
    and-int/lit16 v8, v8, 0xff

    .line 68
    .line 69
    aget v9, v1, v8

    .line 70
    .line 71
    add-int/lit8 v10, v9, 0x1

    .line 72
    .line 73
    aput v10, v1, v8

    .line 74
    .line 75
    const-string v8, "tt index"

    .line 76
    .line 77
    invoke-static {v8, v9, v2}, Ldefpackage/mo;->j(Ljava/lang/String;II)V

    .line 78
    .line 79
    .line 80
    aput v3, v4, v9

    .line 81
    .line 82
    add-int/lit8 v3, v3, 0x1

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_4
    iget v0, p0, Ldefpackage/mo;->p:I

    .line 86
    .line 87
    if-ltz v0, :cond_6

    .line 88
    .line 89
    array-length v1, v4

    .line 90
    if-ge v0, v1, :cond_6

    .line 91
    .line 92
    aget v0, v4, v0

    .line 93
    .line 94
    iput v0, p0, Ldefpackage/mo;->G:I

    .line 95
    .line 96
    iput v6, p0, Ldefpackage/mo;->z:I

    .line 97
    .line 98
    iput v6, p0, Ldefpackage/mo;->C:I

    .line 99
    .line 100
    iput v7, p0, Ldefpackage/mo;->A:I

    .line 101
    .line 102
    iget-boolean v0, p0, Ldefpackage/mo;->r:Z

    .line 103
    .line 104
    if-eqz v0, :cond_5

    .line 105
    .line 106
    iput v6, p0, Ldefpackage/mo;->E:I

    .line 107
    .line 108
    iput v6, p0, Ldefpackage/mo;->F:I

    .line 109
    .line 110
    invoke-virtual {p0}, Ldefpackage/mo;->H()I

    .line 111
    .line 112
    .line 113
    move-result p0

    .line 114
    return p0

    .line 115
    :cond_5
    invoke-virtual {p0}, Ldefpackage/mo;->v()I

    .line 116
    .line 117
    .line 118
    move-result p0

    .line 119
    return p0

    .line 120
    :cond_6
    const-string p0, "Stream corrupted"

    .line 121
    .line 122
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    return v6

    .line 126
    :cond_7
    :goto_2
    const/4 p0, -0x1

    .line 127
    return p0
.end method

.method public final v()I
    .locals 4

    .line 1
    iget v0, p0, Ldefpackage/mo;->C:I

    .line 2
    .line 3
    iget v1, p0, Ldefpackage/mo;->o:I

    .line 4
    .line 5
    if-gt v0, v1, :cond_0

    .line 6
    .line 7
    iget v0, p0, Ldefpackage/mo;->A:I

    .line 8
    .line 9
    iput v0, p0, Ldefpackage/mo;->B:I

    .line 10
    .line 11
    iget-object v0, p0, Ldefpackage/mo;->I:Ldefpackage/lo;

    .line 12
    .line 13
    iget-object v1, v0, Ldefpackage/lo;->f:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, [B

    .line 16
    .line 17
    iget v2, p0, Ldefpackage/mo;->G:I

    .line 18
    .line 19
    aget-byte v1, v1, v2

    .line 20
    .line 21
    and-int/lit16 v1, v1, 0xff

    .line 22
    .line 23
    iput v1, p0, Ldefpackage/mo;->A:I

    .line 24
    .line 25
    iget-object v0, v0, Ldefpackage/lo;->j:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, [I

    .line 28
    .line 29
    array-length v0, v0

    .line 30
    const-string v3, "su_tPos"

    .line 31
    .line 32
    invoke-static {v3, v2, v0}, Ldefpackage/mo;->j(Ljava/lang/String;II)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Ldefpackage/mo;->I:Ldefpackage/lo;

    .line 36
    .line 37
    iget-object v0, v0, Ldefpackage/lo;->j:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, [I

    .line 40
    .line 41
    iget v2, p0, Ldefpackage/mo;->G:I

    .line 42
    .line 43
    aget v0, v0, v2

    .line 44
    .line 45
    iput v0, p0, Ldefpackage/mo;->G:I

    .line 46
    .line 47
    iget v0, p0, Ldefpackage/mo;->C:I

    .line 48
    .line 49
    add-int/lit8 v0, v0, 0x1

    .line 50
    .line 51
    iput v0, p0, Ldefpackage/mo;->C:I

    .line 52
    .line 53
    const/4 v0, 0x6

    .line 54
    iput v0, p0, Ldefpackage/mo;->v:I

    .line 55
    .line 56
    iget-object p0, p0, Ldefpackage/mo;->s:Ldefpackage/cx;

    .line 57
    .line 58
    invoke-virtual {p0, v1}, Ldefpackage/cx;->j(I)V

    .line 59
    .line 60
    .line 61
    return v1

    .line 62
    :cond_0
    const/4 v0, 0x5

    .line 63
    iput v0, p0, Ldefpackage/mo;->v:I

    .line 64
    .line 65
    invoke-virtual {p0}, Ldefpackage/mo;->n()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Ldefpackage/mo;->q()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Ldefpackage/mo;->u()I

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    return p0
.end method
