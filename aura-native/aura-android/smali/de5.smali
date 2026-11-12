.class public final Lde5;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/util/zip/Checksum;


# instance fields
.field public final a:[B

.field public final b:[I

.field public final c:[B

.field public d:I

.field public e:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    new-array v0, v0, [B

    .line 6
    .line 7
    iput-object v0, p0, Lde5;->a:[B

    .line 8
    .line 9
    const/4 v0, 0x4

    .line 10
    new-array v0, v0, [I

    .line 11
    .line 12
    iput-object v0, p0, Lde5;->b:[I

    .line 13
    .line 14
    const/16 v0, 0x10

    .line 15
    .line 16
    new-array v0, v0, [B

    .line 17
    .line 18
    iput-object v0, p0, Lde5;->c:[B

    .line 19
    .line 20
    invoke-virtual {p0}, Lde5;->a()V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    const v0, 0x24234428

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lde5;->b:[I

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    aput v0, p0, v1

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const v2, -0x7a143589

    .line 11
    .line 12
    .line 13
    aput v2, p0, v0

    .line 14
    .line 15
    const/4 v0, 0x2

    .line 16
    aput v1, p0, v0

    .line 17
    .line 18
    const/4 v0, 0x3

    .line 19
    const v1, 0x61c8864f

    .line 20
    .line 21
    .line 22
    aput v1, p0, v0

    .line 23
    .line 24
    return-void
.end method

.method public final b(I[B)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v0, Lde5;->b:[I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    aget v5, v3, v4

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    aget v7, v3, v6

    .line 14
    .line 15
    const/4 v8, 0x2

    .line 16
    aget v9, v3, v8

    .line 17
    .line 18
    const/4 v10, 0x3

    .line 19
    aget v11, v3, v10

    .line 20
    .line 21
    const/4 v12, 0x4

    .line 22
    invoke-static {v2, v1, v12}, Lgh0;->m([BII)J

    .line 23
    .line 24
    .line 25
    move-result-wide v13

    .line 26
    const-wide v15, 0xffffffffL

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    and-long/2addr v13, v15

    .line 32
    long-to-int v13, v13

    .line 33
    const v14, -0x7a143589

    .line 34
    .line 35
    .line 36
    mul-int/2addr v13, v14

    .line 37
    add-int/2addr v13, v5

    .line 38
    const/16 v5, 0xd

    .line 39
    .line 40
    invoke-static {v13, v5}, Ljava/lang/Integer;->rotateLeft(II)I

    .line 41
    .line 42
    .line 43
    move-result v13

    .line 44
    const v17, -0x61c8864f

    .line 45
    .line 46
    .line 47
    mul-int v13, v13, v17

    .line 48
    .line 49
    move/from16 v18, v6

    .line 50
    .line 51
    add-int/lit8 v6, v1, 0x4

    .line 52
    .line 53
    invoke-static {v2, v6, v12}, Lgh0;->m([BII)J

    .line 54
    .line 55
    .line 56
    move-result-wide v19

    .line 57
    move v6, v8

    .line 58
    move/from16 v21, v9

    .line 59
    .line 60
    and-long v8, v19, v15

    .line 61
    .line 62
    long-to-int v8, v8

    .line 63
    mul-int/2addr v8, v14

    .line 64
    add-int/2addr v8, v7

    .line 65
    invoke-static {v8, v5}, Ljava/lang/Integer;->rotateLeft(II)I

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    mul-int v7, v7, v17

    .line 70
    .line 71
    add-int/lit8 v8, v1, 0x8

    .line 72
    .line 73
    invoke-static {v2, v8, v12}, Lgh0;->m([BII)J

    .line 74
    .line 75
    .line 76
    move-result-wide v8

    .line 77
    and-long/2addr v8, v15

    .line 78
    long-to-int v8, v8

    .line 79
    mul-int/2addr v8, v14

    .line 80
    add-int v8, v8, v21

    .line 81
    .line 82
    invoke-static {v8, v5}, Ljava/lang/Integer;->rotateLeft(II)I

    .line 83
    .line 84
    .line 85
    move-result v8

    .line 86
    mul-int v8, v8, v17

    .line 87
    .line 88
    add-int/lit8 v1, v1, 0xc

    .line 89
    .line 90
    invoke-static {v2, v1, v12}, Lgh0;->m([BII)J

    .line 91
    .line 92
    .line 93
    move-result-wide v1

    .line 94
    and-long/2addr v1, v15

    .line 95
    long-to-int v1, v1

    .line 96
    mul-int/2addr v1, v14

    .line 97
    add-int/2addr v1, v11

    .line 98
    invoke-static {v1, v5}, Ljava/lang/Integer;->rotateLeft(II)I

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    mul-int v1, v1, v17

    .line 103
    .line 104
    aput v13, v3, v4

    .line 105
    .line 106
    aput v7, v3, v18

    .line 107
    .line 108
    aput v8, v3, v6

    .line 109
    .line 110
    aput v1, v3, v10

    .line 111
    .line 112
    iput v4, v0, Lde5;->e:I

    .line 113
    .line 114
    return-void
.end method

.method public final getValue()J
    .locals 10

    .line 1
    iget v0, p0, Lde5;->d:I

    .line 2
    .line 3
    const v1, 0x165667b1

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x2

    .line 7
    const/4 v3, 0x0

    .line 8
    const/16 v4, 0x10

    .line 9
    .line 10
    iget-object v5, p0, Lde5;->b:[I

    .line 11
    .line 12
    if-le v0, v4, :cond_0

    .line 13
    .line 14
    aget v0, v5, v3

    .line 15
    .line 16
    const/4 v4, 0x1

    .line 17
    invoke-static {v0, v4}, Ljava/lang/Integer;->rotateLeft(II)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    aget v4, v5, v4

    .line 22
    .line 23
    const/4 v6, 0x7

    .line 24
    invoke-static {v4, v6}, Ljava/lang/Integer;->rotateLeft(II)I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    add-int/2addr v4, v0

    .line 29
    aget v0, v5, v2

    .line 30
    .line 31
    const/16 v2, 0xc

    .line 32
    .line 33
    invoke-static {v0, v2}, Ljava/lang/Integer;->rotateLeft(II)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    add-int/2addr v0, v4

    .line 38
    const/4 v2, 0x3

    .line 39
    aget v2, v5, v2

    .line 40
    .line 41
    const/16 v4, 0x12

    .line 42
    .line 43
    invoke-static {v2, v4}, Ljava/lang/Integer;->rotateLeft(II)I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    add-int/2addr v2, v0

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    aget v0, v5, v2

    .line 50
    .line 51
    add-int v2, v0, v1

    .line 52
    .line 53
    :goto_0
    iget v0, p0, Lde5;->d:I

    .line 54
    .line 55
    add-int/2addr v2, v0

    .line 56
    iget v0, p0, Lde5;->e:I

    .line 57
    .line 58
    const/4 v4, 0x4

    .line 59
    sub-int/2addr v0, v4

    .line 60
    :goto_1
    const-wide v5, 0xffffffffL

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    const v7, -0x3d4d51c3

    .line 66
    .line 67
    .line 68
    iget-object v8, p0, Lde5;->c:[B

    .line 69
    .line 70
    if-gt v3, v0, :cond_1

    .line 71
    .line 72
    invoke-static {v8, v3, v4}, Lgh0;->m([BII)J

    .line 73
    .line 74
    .line 75
    move-result-wide v8

    .line 76
    and-long/2addr v5, v8

    .line 77
    long-to-int v5, v5

    .line 78
    mul-int/2addr v5, v7

    .line 79
    add-int/2addr v5, v2

    .line 80
    const/16 v2, 0x11

    .line 81
    .line 82
    invoke-static {v5, v2}, Ljava/lang/Integer;->rotateLeft(II)I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    const v5, 0x27d4eb2f

    .line 87
    .line 88
    .line 89
    mul-int/2addr v2, v5

    .line 90
    add-int/lit8 v3, v3, 0x4

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_1
    :goto_2
    iget v0, p0, Lde5;->e:I

    .line 94
    .line 95
    if-ge v3, v0, :cond_2

    .line 96
    .line 97
    add-int/lit8 v0, v3, 0x1

    .line 98
    .line 99
    aget-byte v3, v8, v3

    .line 100
    .line 101
    and-int/lit16 v3, v3, 0xff

    .line 102
    .line 103
    mul-int/2addr v3, v1

    .line 104
    add-int/2addr v3, v2

    .line 105
    const/16 v2, 0xb

    .line 106
    .line 107
    invoke-static {v3, v2}, Ljava/lang/Integer;->rotateLeft(II)I

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    const v3, -0x61c8864f

    .line 112
    .line 113
    .line 114
    mul-int/2addr v2, v3

    .line 115
    move v3, v0

    .line 116
    goto :goto_2

    .line 117
    :cond_2
    ushr-int/lit8 p0, v2, 0xf

    .line 118
    .line 119
    xor-int/2addr p0, v2

    .line 120
    const v0, -0x7a143589

    .line 121
    .line 122
    .line 123
    mul-int/2addr p0, v0

    .line 124
    ushr-int/lit8 v0, p0, 0xd

    .line 125
    .line 126
    xor-int/2addr p0, v0

    .line 127
    mul-int/2addr p0, v7

    .line 128
    ushr-int/lit8 v0, p0, 0x10

    .line 129
    .line 130
    xor-int/2addr p0, v0

    .line 131
    int-to-long v0, p0

    .line 132
    and-long/2addr v0, v5

    .line 133
    return-wide v0
.end method

.method public final reset()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lde5;->a()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lde5;->d:I

    .line 6
    .line 7
    iput v0, p0, Lde5;->e:I

    .line 8
    .line 9
    return-void
.end method

.method public final update(I)V
    .locals 2

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    .line 61
    iget-object v0, p0, Lde5;->a:[B

    const/4 v1, 0x0

    aput-byte p1, v0, v1

    const/4 p1, 0x1

    .line 62
    invoke-virtual {p0, v0, v1, p1}, Lde5;->update([BII)V

    return-void
.end method

.method public final update([BII)V
    .locals 5

    .line 1
    if-gtz p3, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    iget v0, p0, Lde5;->d:I

    .line 5
    .line 6
    add-int/2addr v0, p3

    .line 7
    iput v0, p0, Lde5;->d:I

    .line 8
    .line 9
    add-int v0, p2, p3

    .line 10
    .line 11
    iget v1, p0, Lde5;->e:I

    .line 12
    .line 13
    add-int v2, v1, p3

    .line 14
    .line 15
    iget-object v3, p0, Lde5;->c:[B

    .line 16
    .line 17
    const/16 v4, 0x10

    .line 18
    .line 19
    if-ge v2, v4, :cond_1

    .line 20
    .line 21
    invoke-static {p1, p2, v3, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 22
    .line 23
    .line 24
    iget p1, p0, Lde5;->e:I

    .line 25
    .line 26
    add-int/2addr p1, p3

    .line 27
    iput p1, p0, Lde5;->e:I

    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    const/4 p3, 0x0

    .line 31
    if-lez v1, :cond_2

    .line 32
    .line 33
    rsub-int/lit8 v2, v1, 0x10

    .line 34
    .line 35
    invoke-static {p1, p2, v3, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, p3, v3}, Lde5;->b(I[B)V

    .line 39
    .line 40
    .line 41
    add-int/2addr p2, v2

    .line 42
    :cond_2
    add-int/lit8 v1, v0, -0x10

    .line 43
    .line 44
    :goto_0
    if-gt p2, v1, :cond_3

    .line 45
    .line 46
    invoke-virtual {p0, p2, p1}, Lde5;->b(I[B)V

    .line 47
    .line 48
    .line 49
    add-int/lit8 p2, p2, 0x10

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    if-ge p2, v0, :cond_4

    .line 53
    .line 54
    sub-int/2addr v0, p2

    .line 55
    iput v0, p0, Lde5;->e:I

    .line 56
    .line 57
    invoke-static {p1, p2, v3, p3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 58
    .line 59
    .line 60
    :cond_4
    :goto_1
    return-void
.end method
