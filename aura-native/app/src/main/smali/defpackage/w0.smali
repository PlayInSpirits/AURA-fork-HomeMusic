.class public abstract Ldefpackage/w0;
.super Ldefpackage/i90;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final o:I

.field public final p:[B

.field public q:I

.field public r:I

.field public final s:Ldefpackage/df0;

.field public t:J

.field public u:I

.field public final v:[B

.field public final w:Ldefpackage/hg3;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ldefpackage/i90;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    new-array v0, v0, [B

    .line 6
    .line 7
    iput-object v0, p0, Ldefpackage/w0;->v:[B

    .line 8
    .line 9
    new-instance v0, Ldefpackage/hg3;

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    invoke-direct {v0, v1, p0}, Ldefpackage/hg3;-><init>(ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Ldefpackage/w0;->w:Ldefpackage/hg3;

    .line 16
    .line 17
    new-instance v0, Ldefpackage/df0;

    .line 18
    .line 19
    invoke-direct {v0, p1}, Ldefpackage/df0;-><init>(Ljava/io/InputStream;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Ldefpackage/w0;->s:Ldefpackage/df0;

    .line 23
    .line 24
    if-lez p2, :cond_0

    .line 25
    .line 26
    iput p2, p0, Ldefpackage/w0;->o:I

    .line 27
    .line 28
    mul-int/lit8 p2, p2, 0x3

    .line 29
    .line 30
    new-array p1, p2, [B

    .line 31
    .line 32
    iput-object p1, p0, Ldefpackage/w0;->p:[B

    .line 33
    .line 34
    const/4 p1, 0x0

    .line 35
    iput p1, p0, Ldefpackage/w0;->r:I

    .line 36
    .line 37
    iput p1, p0, Ldefpackage/w0;->q:I

    .line 38
    .line 39
    const-wide/16 p1, 0x0

    .line 40
    .line 41
    iput-wide p1, p0, Ldefpackage/w0;->t:J

    .line 42
    .line 43
    return-void

    .line 44
    :cond_0
    const-string p0, "windowSize must be bigger than 0"

    .line 45
    .line 46
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    throw p0
.end method


# virtual methods
.method public final available()I
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/w0;->q:I

    .line 2
    .line 3
    iget p0, p0, Ldefpackage/w0;->r:I

    .line 4
    .line 5
    sub-int/2addr v0, p0

    .line 6
    return v0
.end method

.method public final close()V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/w0;->s:Ldefpackage/df0;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final f([BII)I
    .locals 7

    .line 1
    invoke-virtual {p0}, Ldefpackage/w0;->available()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-le p3, v0, :cond_5

    .line 6
    .line 7
    sub-int v0, p3, v0

    .line 8
    .line 9
    int-to-long v0, v0

    .line 10
    iget-wide v2, p0, Ldefpackage/w0;->t:J

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    long-to-int v0, v0

    .line 17
    iget-object v1, p0, Ldefpackage/w0;->p:[B

    .line 18
    .line 19
    array-length v2, v1

    .line 20
    iget v3, p0, Ldefpackage/w0;->q:I

    .line 21
    .line 22
    sub-int/2addr v2, v3

    .line 23
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    iget v2, p0, Ldefpackage/w0;->u:I

    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    if-ne v2, v3, :cond_1

    .line 34
    .line 35
    iget v2, p0, Ldefpackage/w0;->q:I

    .line 36
    .line 37
    add-int/lit8 v3, v2, -0x1

    .line 38
    .line 39
    aget-byte v3, v1, v3

    .line 40
    .line 41
    add-int v4, v2, v0

    .line 42
    .line 43
    invoke-static {v1, v2, v4, v3}, Ljava/util/Arrays;->fill([BIIB)V

    .line 44
    .line 45
    .line 46
    iget v1, p0, Ldefpackage/w0;->q:I

    .line 47
    .line 48
    add-int/2addr v1, v0

    .line 49
    iput v1, p0, Ldefpackage/w0;->q:I

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    if-ge v0, v2, :cond_2

    .line 53
    .line 54
    iget v3, p0, Ldefpackage/w0;->q:I

    .line 55
    .line 56
    sub-int v2, v3, v2

    .line 57
    .line 58
    invoke-static {v1, v2, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 59
    .line 60
    .line 61
    iget v1, p0, Ldefpackage/w0;->q:I

    .line 62
    .line 63
    add-int/2addr v1, v0

    .line 64
    iput v1, p0, Ldefpackage/w0;->q:I

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    div-int v2, v0, v2

    .line 68
    .line 69
    const/4 v3, 0x0

    .line 70
    :goto_0
    if-ge v3, v2, :cond_3

    .line 71
    .line 72
    iget v4, p0, Ldefpackage/w0;->q:I

    .line 73
    .line 74
    iget v5, p0, Ldefpackage/w0;->u:I

    .line 75
    .line 76
    sub-int v6, v4, v5

    .line 77
    .line 78
    invoke-static {v1, v6, v1, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 79
    .line 80
    .line 81
    iget v4, p0, Ldefpackage/w0;->q:I

    .line 82
    .line 83
    iget v5, p0, Ldefpackage/w0;->u:I

    .line 84
    .line 85
    add-int/2addr v4, v5

    .line 86
    iput v4, p0, Ldefpackage/w0;->q:I

    .line 87
    .line 88
    add-int/lit8 v3, v3, 0x1

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_3
    iget v3, p0, Ldefpackage/w0;->u:I

    .line 92
    .line 93
    mul-int/2addr v2, v3

    .line 94
    sub-int v2, v0, v2

    .line 95
    .line 96
    if-lez v2, :cond_4

    .line 97
    .line 98
    iget v4, p0, Ldefpackage/w0;->q:I

    .line 99
    .line 100
    sub-int v3, v4, v3

    .line 101
    .line 102
    invoke-static {v1, v3, v1, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 103
    .line 104
    .line 105
    iget v1, p0, Ldefpackage/w0;->q:I

    .line 106
    .line 107
    add-int/2addr v1, v2

    .line 108
    iput v1, p0, Ldefpackage/w0;->q:I

    .line 109
    .line 110
    :cond_4
    :goto_1
    iget-wide v1, p0, Ldefpackage/w0;->t:J

    .line 111
    .line 112
    int-to-long v3, v0

    .line 113
    sub-long/2addr v1, v3

    .line 114
    iput-wide v1, p0, Ldefpackage/w0;->t:J

    .line 115
    .line 116
    :cond_5
    invoke-virtual {p0, p1, p2, p3}, Ldefpackage/w0;->j([BII)I

    .line 117
    .line 118
    .line 119
    move-result p0

    .line 120
    return p0
.end method

.method public final j([BII)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldefpackage/w0;->available()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    .line 6
    .line 7
    .line 8
    move-result p3

    .line 9
    if-lez p3, :cond_0

    .line 10
    .line 11
    iget v0, p0, Ldefpackage/w0;->r:I

    .line 12
    .line 13
    iget-object v1, p0, Ldefpackage/w0;->p:[B

    .line 14
    .line 15
    invoke-static {v1, v0, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 16
    .line 17
    .line 18
    iget p1, p0, Ldefpackage/w0;->r:I

    .line 19
    .line 20
    add-int/2addr p1, p3

    .line 21
    iput p1, p0, Ldefpackage/w0;->r:I

    .line 22
    .line 23
    iget p2, p0, Ldefpackage/w0;->o:I

    .line 24
    .line 25
    mul-int/lit8 v0, p2, 0x2

    .line 26
    .line 27
    if-le p1, v0, :cond_0

    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    invoke-static {v1, p2, v1, p1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 31
    .line 32
    .line 33
    iget p1, p0, Ldefpackage/w0;->q:I

    .line 34
    .line 35
    sub-int/2addr p1, p2

    .line 36
    iput p1, p0, Ldefpackage/w0;->q:I

    .line 37
    .line 38
    iget p1, p0, Ldefpackage/w0;->r:I

    .line 39
    .line 40
    sub-int/2addr p1, p2

    .line 41
    iput p1, p0, Ldefpackage/w0;->r:I

    .line 42
    .line 43
    :cond_0
    return p3
.end method

.method public final n([BII)I
    .locals 5

    .line 1
    invoke-virtual {p0}, Ldefpackage/w0;->available()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-le p3, v0, :cond_2

    .line 6
    .line 7
    sub-int v0, p3, v0

    .line 8
    .line 9
    int-to-long v0, v0

    .line 10
    iget-wide v2, p0, Ldefpackage/w0;->t:J

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    long-to-int v0, v0

    .line 17
    iget-object v1, p0, Ldefpackage/w0;->p:[B

    .line 18
    .line 19
    array-length v2, v1

    .line 20
    iget v3, p0, Ldefpackage/w0;->q:I

    .line 21
    .line 22
    sub-int/2addr v2, v3

    .line 23
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v2, 0x0

    .line 28
    if-lez v0, :cond_0

    .line 29
    .line 30
    iget-object v3, p0, Ldefpackage/w0;->s:Ldefpackage/df0;

    .line 31
    .line 32
    iget v4, p0, Ldefpackage/w0;->q:I

    .line 33
    .line 34
    invoke-static {v3, v1, v4, v0}, Ldefpackage/vr1;->D(Ljava/io/InputStream;[BII)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move v1, v2

    .line 40
    :goto_0
    int-to-long v3, v1

    .line 41
    invoke-virtual {p0, v3, v4}, Ldefpackage/i90;->b(J)V

    .line 42
    .line 43
    .line 44
    if-ne v0, v1, :cond_1

    .line 45
    .line 46
    iget v1, p0, Ldefpackage/w0;->q:I

    .line 47
    .line 48
    add-int/2addr v1, v0

    .line 49
    iput v1, p0, Ldefpackage/w0;->q:I

    .line 50
    .line 51
    iget-wide v1, p0, Ldefpackage/w0;->t:J

    .line 52
    .line 53
    int-to-long v3, v0

    .line 54
    sub-long/2addr v1, v3

    .line 55
    iput-wide v1, p0, Ldefpackage/w0;->t:J

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    const-string p0, "Premature end of stream reading literal"

    .line 59
    .line 60
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return v2

    .line 64
    :cond_2
    :goto_1
    invoke-virtual {p0, p1, p2, p3}, Ldefpackage/w0;->j([BII)I

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    return p0
.end method

.method public final q()I
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/w0;->s:Ldefpackage/df0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldefpackage/df0;->read()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, -0x1

    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    const-wide/16 v1, 0x1

    .line 11
    .line 12
    invoke-virtual {p0, v1, v2}, Ldefpackage/i90;->b(J)V

    .line 13
    .line 14
    .line 15
    and-int/lit16 p0, v0, 0xff

    .line 16
    .line 17
    return p0

    .line 18
    :cond_0
    return v1
.end method

.method public final read()I
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, Ldefpackage/w0;->v:[B

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-virtual {p0, v1, v2, v0}, Ljava/io/InputStream;->read([BII)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    const/4 v0, -0x1

    .line 10
    if-ne p0, v0, :cond_0

    .line 11
    .line 12
    return v0

    .line 13
    :cond_0
    aget-byte p0, v1, v2

    .line 14
    .line 15
    and-int/lit16 p0, p0, 0xff

    .line 16
    .line 17
    return p0
.end method

.method public final s(IJ)V
    .locals 2

    .line 1
    if-lez p1, :cond_1

    .line 2
    .line 3
    iget v0, p0, Ldefpackage/w0;->q:I

    .line 4
    .line 5
    if-gt p1, v0, :cond_1

    .line 6
    .line 7
    const-wide/16 v0, 0x0

    .line 8
    .line 9
    cmp-long v0, p2, v0

    .line 10
    .line 11
    if-ltz v0, :cond_0

    .line 12
    .line 13
    iput p1, p0, Ldefpackage/w0;->u:I

    .line 14
    .line 15
    iput-wide p2, p0, Ldefpackage/w0;->t:J

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const-string p0, "length must not be negative"

    .line 19
    .line 20
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    const-string p0, "offset must be bigger than 0 but not bigger than the number of bytes available for back-references"

    .line 25
    .line 26
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method
