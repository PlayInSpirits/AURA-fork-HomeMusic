.class public Ldefpackage/l32;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public A:[Ljava/lang/String;

.field public B:[I

.field public final n:Ljava/io/Reader;

.field public o:Z

.field public final p:[C

.field public q:I

.field public r:I

.field public s:I

.field public t:I

.field public u:I

.field public v:J

.field public w:I

.field public x:Ljava/lang/String;

.field public y:[I

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldefpackage/fz0;

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ldefpackage/fz0;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Ldefpackage/fz0;->i0:Ldefpackage/fz0;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Ljava/io/Reader;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Ldefpackage/l32;->o:Z

    .line 6
    .line 7
    const/16 v1, 0x400

    .line 8
    .line 9
    new-array v1, v1, [C

    .line 10
    .line 11
    iput-object v1, p0, Ldefpackage/l32;->p:[C

    .line 12
    .line 13
    iput v0, p0, Ldefpackage/l32;->q:I

    .line 14
    .line 15
    iput v0, p0, Ldefpackage/l32;->r:I

    .line 16
    .line 17
    iput v0, p0, Ldefpackage/l32;->s:I

    .line 18
    .line 19
    iput v0, p0, Ldefpackage/l32;->t:I

    .line 20
    .line 21
    iput v0, p0, Ldefpackage/l32;->u:I

    .line 22
    .line 23
    const/16 v1, 0x20

    .line 24
    .line 25
    new-array v2, v1, [I

    .line 26
    .line 27
    iput-object v2, p0, Ldefpackage/l32;->y:[I

    .line 28
    .line 29
    const/4 v3, 0x1

    .line 30
    iput v3, p0, Ldefpackage/l32;->z:I

    .line 31
    .line 32
    const/4 v3, 0x6

    .line 33
    aput v3, v2, v0

    .line 34
    .line 35
    new-array v0, v1, [Ljava/lang/String;

    .line 36
    .line 37
    iput-object v0, p0, Ldefpackage/l32;->A:[Ljava/lang/String;

    .line 38
    .line 39
    new-array v0, v1, [I

    .line 40
    .line 41
    iput-object v0, p0, Ldefpackage/l32;->B:[I

    .line 42
    .line 43
    const-string v0, "in == null"

    .line 44
    .line 45
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, Ldefpackage/l32;->n:Ljava/io/Reader;

    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public final F(Z)Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "$"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    iget v2, p0, Ldefpackage/l32;->z:I

    .line 10
    .line 11
    if-ge v1, v2, :cond_4

    .line 12
    .line 13
    iget-object v3, p0, Ldefpackage/l32;->y:[I

    .line 14
    .line 15
    aget v3, v3, v1

    .line 16
    .line 17
    const/4 v4, 0x1

    .line 18
    if-eq v3, v4, :cond_1

    .line 19
    .line 20
    const/4 v4, 0x2

    .line 21
    if-eq v3, v4, :cond_1

    .line 22
    .line 23
    const/4 v2, 0x3

    .line 24
    if-eq v3, v2, :cond_0

    .line 25
    .line 26
    const/4 v2, 0x4

    .line 27
    if-eq v3, v2, :cond_0

    .line 28
    .line 29
    const/4 v2, 0x5

    .line 30
    if-eq v3, v2, :cond_0

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    const/16 v2, 0x2e

    .line 34
    .line 35
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v2, p0, Ldefpackage/l32;->A:[Ljava/lang/String;

    .line 39
    .line 40
    aget-object v2, v2, v1

    .line 41
    .line 42
    if-eqz v2, :cond_3

    .line 43
    .line 44
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    iget-object v3, p0, Ldefpackage/l32;->B:[I

    .line 49
    .line 50
    aget v3, v3, v1

    .line 51
    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    if-lez v3, :cond_2

    .line 55
    .line 56
    add-int/lit8 v2, v2, -0x1

    .line 57
    .line 58
    if-ne v1, v2, :cond_2

    .line 59
    .line 60
    add-int/lit8 v3, v3, -0x1

    .line 61
    .line 62
    :cond_2
    const/16 v2, 0x5b

    .line 63
    .line 64
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const/16 v2, 0x5d

    .line 71
    .line 72
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    :cond_3
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0
.end method

.method public H()Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Ldefpackage/l32;->F(Z)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method public J()Z
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/l32;->u:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/l32;->n()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    :cond_0
    const/4 p0, 0x2

    .line 10
    if-eq v0, p0, :cond_1

    .line 11
    .line 12
    const/4 p0, 0x4

    .line 13
    if-eq v0, p0, :cond_1

    .line 14
    .line 15
    const/16 p0, 0x11

    .line 16
    .line 17
    if-eq v0, p0, :cond_1

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_1
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public final K(C)Z
    .locals 1

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    if-eq p1, v0, :cond_1

    .line 4
    .line 5
    const/16 v0, 0xa

    .line 6
    .line 7
    if-eq p1, v0, :cond_1

    .line 8
    .line 9
    const/16 v0, 0xc

    .line 10
    .line 11
    if-eq p1, v0, :cond_1

    .line 12
    .line 13
    const/16 v0, 0xd

    .line 14
    .line 15
    if-eq p1, v0, :cond_1

    .line 16
    .line 17
    const/16 v0, 0x20

    .line 18
    .line 19
    if-eq p1, v0, :cond_1

    .line 20
    .line 21
    const/16 v0, 0x23

    .line 22
    .line 23
    if-eq p1, v0, :cond_0

    .line 24
    .line 25
    const/16 v0, 0x2c

    .line 26
    .line 27
    if-eq p1, v0, :cond_1

    .line 28
    .line 29
    const/16 v0, 0x2f

    .line 30
    .line 31
    if-eq p1, v0, :cond_0

    .line 32
    .line 33
    const/16 v0, 0x3d

    .line 34
    .line 35
    if-eq p1, v0, :cond_0

    .line 36
    .line 37
    const/16 v0, 0x7b

    .line 38
    .line 39
    if-eq p1, v0, :cond_1

    .line 40
    .line 41
    const/16 v0, 0x7d

    .line 42
    .line 43
    if-eq p1, v0, :cond_1

    .line 44
    .line 45
    const/16 v0, 0x3a

    .line 46
    .line 47
    if-eq p1, v0, :cond_1

    .line 48
    .line 49
    const/16 v0, 0x3b

    .line 50
    .line 51
    if-eq p1, v0, :cond_0

    .line 52
    .line 53
    packed-switch p1, :pswitch_data_0

    .line 54
    .line 55
    .line 56
    const/4 p0, 0x1

    .line 57
    return p0

    .line 58
    :cond_0
    :pswitch_0
    invoke-virtual {p0}, Ldefpackage/l32;->j()V

    .line 59
    .line 60
    .line 61
    :cond_1
    :pswitch_1
    const/4 p0, 0x0

    .line 62
    return p0

    .line 63
    :pswitch_data_0
    .packed-switch 0x5b
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method final M()Ljava/lang/String;
    .locals 5

    .line 1
    iget v0, p0, Ldefpackage/l32;->s:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iget v1, p0, Ldefpackage/l32;->q:I

    .line 6
    .line 7
    iget v2, p0, Ldefpackage/l32;->t:I

    .line 8
    .line 9
    sub-int/2addr v1, v2

    .line 10
    add-int/lit8 v1, v1, 0x1

    .line 11
    .line 12
    const-string v2, " column "

    .line 13
    .line 14
    const-string v3, " path "

    .line 15
    .line 16
    const-string v4, " at line "

    .line 17
    .line 18
    invoke-static {v4, v2, v0, v1, v3}, Ldefpackage/b11;->t(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p0}, Ldefpackage/l32;->v()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method

.method public R()Z
    .locals 4

    .line 1
    iget v0, p0, Ldefpackage/l32;->u:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/l32;->n()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    :cond_0
    const/4 v1, 0x5

    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x1

    .line 12
    if-ne v0, v1, :cond_1

    .line 13
    .line 14
    iput v2, p0, Ldefpackage/l32;->u:I

    .line 15
    .line 16
    iget-object v0, p0, Ldefpackage/l32;->B:[I

    .line 17
    .line 18
    iget p0, p0, Ldefpackage/l32;->z:I

    .line 19
    .line 20
    sub-int/2addr p0, v3

    .line 21
    aget v1, v0, p0

    .line 22
    .line 23
    add-int/2addr v1, v3

    .line 24
    aput v1, v0, p0

    .line 25
    .line 26
    return v3

    .line 27
    :cond_1
    const/4 v1, 0x6

    .line 28
    if-ne v0, v1, :cond_2

    .line 29
    .line 30
    iput v2, p0, Ldefpackage/l32;->u:I

    .line 31
    .line 32
    iget-object v0, p0, Ldefpackage/l32;->B:[I

    .line 33
    .line 34
    iget p0, p0, Ldefpackage/l32;->z:I

    .line 35
    .line 36
    sub-int/2addr p0, v3

    .line 37
    aget v1, v0, p0

    .line 38
    .line 39
    add-int/2addr v1, v3

    .line 40
    aput v1, v0, p0

    .line 41
    .line 42
    return v2

    .line 43
    :cond_2
    invoke-virtual {p0}, Ldefpackage/l32;->e0()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    invoke-static {v0}, Ldefpackage/b11;->x(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {p0}, Ldefpackage/l32;->M()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    const-string v1, "Expected a boolean but was "

    .line 56
    .line 57
    invoke-static {v0, p0, v1}, Ldefpackage/er1;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return v2
.end method

.method public T()D
    .locals 6

    .line 1
    iget v0, p0, Ldefpackage/l32;->u:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/l32;->n()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    :cond_0
    const/16 v1, 0xf

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-ne v0, v1, :cond_1

    .line 13
    .line 14
    iput v2, p0, Ldefpackage/l32;->u:I

    .line 15
    .line 16
    iget-object v0, p0, Ldefpackage/l32;->B:[I

    .line 17
    .line 18
    iget v1, p0, Ldefpackage/l32;->z:I

    .line 19
    .line 20
    add-int/lit8 v1, v1, -0x1

    .line 21
    .line 22
    aget v2, v0, v1

    .line 23
    .line 24
    add-int/lit8 v2, v2, 0x1

    .line 25
    .line 26
    aput v2, v0, v1

    .line 27
    .line 28
    iget-wide v0, p0, Ldefpackage/l32;->v:J

    .line 29
    .line 30
    long-to-double v0, v0

    .line 31
    return-wide v0

    .line 32
    :cond_1
    const/16 v1, 0x10

    .line 33
    .line 34
    const/16 v3, 0xb

    .line 35
    .line 36
    if-ne v0, v1, :cond_2

    .line 37
    .line 38
    new-instance v0, Ljava/lang/String;

    .line 39
    .line 40
    iget v1, p0, Ldefpackage/l32;->q:I

    .line 41
    .line 42
    iget v4, p0, Ldefpackage/l32;->w:I

    .line 43
    .line 44
    iget-object v5, p0, Ldefpackage/l32;->p:[C

    .line 45
    .line 46
    invoke-direct {v0, v5, v1, v4}, Ljava/lang/String;-><init>([CII)V

    .line 47
    .line 48
    .line 49
    iput-object v0, p0, Ldefpackage/l32;->x:Ljava/lang/String;

    .line 50
    .line 51
    iget v0, p0, Ldefpackage/l32;->q:I

    .line 52
    .line 53
    iget v1, p0, Ldefpackage/l32;->w:I

    .line 54
    .line 55
    add-int/2addr v0, v1

    .line 56
    iput v0, p0, Ldefpackage/l32;->q:I

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_2
    const/16 v1, 0x8

    .line 60
    .line 61
    if-eq v0, v1, :cond_6

    .line 62
    .line 63
    const/16 v4, 0x9

    .line 64
    .line 65
    if-ne v0, v4, :cond_3

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    const/16 v1, 0xa

    .line 69
    .line 70
    if-ne v0, v1, :cond_4

    .line 71
    .line 72
    invoke-virtual {p0}, Ldefpackage/l32;->d0()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    iput-object v0, p0, Ldefpackage/l32;->x:Ljava/lang/String;

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_4
    if-ne v0, v3, :cond_5

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_5
    invoke-virtual {p0}, Ldefpackage/l32;->e0()I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    invoke-static {v0}, Ldefpackage/b11;->x(I)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {p0}, Ldefpackage/l32;->M()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    const-string v1, "Expected a double but was "

    .line 95
    .line 96
    invoke-static {v0, p0, v1}, Ldefpackage/er1;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    const-wide/16 v0, 0x0

    .line 100
    .line 101
    return-wide v0

    .line 102
    :cond_6
    :goto_0
    if-ne v0, v1, :cond_7

    .line 103
    .line 104
    const/16 v0, 0x27

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_7
    const/16 v0, 0x22

    .line 108
    .line 109
    :goto_1
    invoke-virtual {p0, v0}, Ldefpackage/l32;->b0(C)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    iput-object v0, p0, Ldefpackage/l32;->x:Ljava/lang/String;

    .line 114
    .line 115
    :goto_2
    iput v3, p0, Ldefpackage/l32;->u:I

    .line 116
    .line 117
    iget-object v0, p0, Ldefpackage/l32;->x:Ljava/lang/String;

    .line 118
    .line 119
    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 120
    .line 121
    .line 122
    move-result-wide v0

    .line 123
    iget-boolean v3, p0, Ldefpackage/l32;->o:Z

    .line 124
    .line 125
    if-nez v3, :cond_9

    .line 126
    .line 127
    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    if-nez v3, :cond_8

    .line 132
    .line 133
    invoke-static {v0, v1}, Ljava/lang/Double;->isInfinite(D)Z

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    if-nez v3, :cond_8

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_8
    new-instance v2, Lcom/google/gson/stream/MalformedJsonException;

    .line 141
    .line 142
    invoke-virtual {p0}, Ldefpackage/l32;->M()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    new-instance v3, Ljava/lang/StringBuilder;

    .line 147
    .line 148
    const-string v4, "JSON forbids NaN and infinities: "

    .line 149
    .line 150
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    invoke-direct {v2, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    throw v2

    .line 167
    :cond_9
    :goto_3
    const/4 v3, 0x0

    .line 168
    iput-object v3, p0, Ldefpackage/l32;->x:Ljava/lang/String;

    .line 169
    .line 170
    iput v2, p0, Ldefpackage/l32;->u:I

    .line 171
    .line 172
    iget-object v2, p0, Ldefpackage/l32;->B:[I

    .line 173
    .line 174
    iget p0, p0, Ldefpackage/l32;->z:I

    .line 175
    .line 176
    add-int/lit8 p0, p0, -0x1

    .line 177
    .line 178
    aget v3, v2, p0

    .line 179
    .line 180
    add-int/lit8 v3, v3, 0x1

    .line 181
    .line 182
    aput v3, v2, p0

    .line 183
    .line 184
    return-wide v0
.end method

.method public W()I
    .locals 7

    .line 1
    iget v0, p0, Ldefpackage/l32;->u:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/l32;->n()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    :cond_0
    const/16 v1, 0xf

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const-string v3, "Expected an int but was "

    .line 13
    .line 14
    if-ne v0, v1, :cond_2

    .line 15
    .line 16
    iget-wide v0, p0, Ldefpackage/l32;->v:J

    .line 17
    .line 18
    long-to-int v4, v0

    .line 19
    int-to-long v5, v4

    .line 20
    cmp-long v0, v0, v5

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    iput v2, p0, Ldefpackage/l32;->u:I

    .line 25
    .line 26
    iget-object v0, p0, Ldefpackage/l32;->B:[I

    .line 27
    .line 28
    iget p0, p0, Ldefpackage/l32;->z:I

    .line 29
    .line 30
    add-int/lit8 p0, p0, -0x1

    .line 31
    .line 32
    aget v1, v0, p0

    .line 33
    .line 34
    add-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    aput v1, v0, p0

    .line 37
    .line 38
    return v4

    .line 39
    :cond_1
    new-instance v0, Ljava/lang/NumberFormatException;

    .line 40
    .line 41
    iget-wide v1, p0, Ldefpackage/l32;->v:J

    .line 42
    .line 43
    invoke-virtual {p0}, Ldefpackage/l32;->M()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    new-instance v4, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v4, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-direct {v0, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw v0

    .line 66
    :cond_2
    const/16 v1, 0x10

    .line 67
    .line 68
    if-ne v0, v1, :cond_3

    .line 69
    .line 70
    new-instance v0, Ljava/lang/String;

    .line 71
    .line 72
    iget v1, p0, Ldefpackage/l32;->q:I

    .line 73
    .line 74
    iget v4, p0, Ldefpackage/l32;->w:I

    .line 75
    .line 76
    iget-object v5, p0, Ldefpackage/l32;->p:[C

    .line 77
    .line 78
    invoke-direct {v0, v5, v1, v4}, Ljava/lang/String;-><init>([CII)V

    .line 79
    .line 80
    .line 81
    iput-object v0, p0, Ldefpackage/l32;->x:Ljava/lang/String;

    .line 82
    .line 83
    iget v0, p0, Ldefpackage/l32;->q:I

    .line 84
    .line 85
    iget v1, p0, Ldefpackage/l32;->w:I

    .line 86
    .line 87
    add-int/2addr v0, v1

    .line 88
    iput v0, p0, Ldefpackage/l32;->q:I

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_3
    const/16 v1, 0xa

    .line 92
    .line 93
    const/16 v4, 0x8

    .line 94
    .line 95
    if-eq v0, v4, :cond_5

    .line 96
    .line 97
    const/16 v5, 0x9

    .line 98
    .line 99
    if-eq v0, v5, :cond_5

    .line 100
    .line 101
    if-ne v0, v1, :cond_4

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_4
    invoke-virtual {p0}, Ldefpackage/l32;->e0()I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    invoke-static {v0}, Ldefpackage/b11;->x(I)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {p0}, Ldefpackage/l32;->M()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    invoke-static {v0, p0, v3}, Ldefpackage/er1;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    return v2

    .line 120
    :cond_5
    :goto_0
    if-ne v0, v1, :cond_6

    .line 121
    .line 122
    invoke-virtual {p0}, Ldefpackage/l32;->d0()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    iput-object v0, p0, Ldefpackage/l32;->x:Ljava/lang/String;

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_6
    if-ne v0, v4, :cond_7

    .line 130
    .line 131
    const/16 v0, 0x27

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_7
    const/16 v0, 0x22

    .line 135
    .line 136
    :goto_1
    invoke-virtual {p0, v0}, Ldefpackage/l32;->b0(C)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    iput-object v0, p0, Ldefpackage/l32;->x:Ljava/lang/String;

    .line 141
    .line 142
    :goto_2
    :try_start_0
    iget-object v0, p0, Ldefpackage/l32;->x:Ljava/lang/String;

    .line 143
    .line 144
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    iput v2, p0, Ldefpackage/l32;->u:I

    .line 149
    .line 150
    iget-object v1, p0, Ldefpackage/l32;->B:[I

    .line 151
    .line 152
    iget v4, p0, Ldefpackage/l32;->z:I

    .line 153
    .line 154
    add-int/lit8 v4, v4, -0x1

    .line 155
    .line 156
    aget v5, v1, v4

    .line 157
    .line 158
    add-int/lit8 v5, v5, 0x1

    .line 159
    .line 160
    aput v5, v1, v4
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 161
    .line 162
    return v0

    .line 163
    :catch_0
    :goto_3
    const/16 v0, 0xb

    .line 164
    .line 165
    iput v0, p0, Ldefpackage/l32;->u:I

    .line 166
    .line 167
    iget-object v0, p0, Ldefpackage/l32;->x:Ljava/lang/String;

    .line 168
    .line 169
    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 170
    .line 171
    .line 172
    move-result-wide v0

    .line 173
    double-to-int v4, v0

    .line 174
    int-to-double v5, v4

    .line 175
    cmpl-double v0, v5, v0

    .line 176
    .line 177
    if-nez v0, :cond_8

    .line 178
    .line 179
    const/4 v0, 0x0

    .line 180
    iput-object v0, p0, Ldefpackage/l32;->x:Ljava/lang/String;

    .line 181
    .line 182
    iput v2, p0, Ldefpackage/l32;->u:I

    .line 183
    .line 184
    iget-object v0, p0, Ldefpackage/l32;->B:[I

    .line 185
    .line 186
    iget p0, p0, Ldefpackage/l32;->z:I

    .line 187
    .line 188
    add-int/lit8 p0, p0, -0x1

    .line 189
    .line 190
    aget v1, v0, p0

    .line 191
    .line 192
    add-int/lit8 v1, v1, 0x1

    .line 193
    .line 194
    aput v1, v0, p0

    .line 195
    .line 196
    return v4

    .line 197
    :cond_8
    new-instance v0, Ljava/lang/NumberFormatException;

    .line 198
    .line 199
    iget-object v1, p0, Ldefpackage/l32;->x:Ljava/lang/String;

    .line 200
    .line 201
    invoke-virtual {p0}, Ldefpackage/l32;->M()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    new-instance v2, Ljava/lang/StringBuilder;

    .line 206
    .line 207
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    invoke-direct {v0, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    throw v0
.end method

.method public X()J
    .locals 8

    .line 1
    iget v0, p0, Ldefpackage/l32;->u:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/l32;->n()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    :cond_0
    const/16 v1, 0xf

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-ne v0, v1, :cond_1

    .line 13
    .line 14
    iput v2, p0, Ldefpackage/l32;->u:I

    .line 15
    .line 16
    iget-object v0, p0, Ldefpackage/l32;->B:[I

    .line 17
    .line 18
    iget v1, p0, Ldefpackage/l32;->z:I

    .line 19
    .line 20
    add-int/lit8 v1, v1, -0x1

    .line 21
    .line 22
    aget v2, v0, v1

    .line 23
    .line 24
    add-int/lit8 v2, v2, 0x1

    .line 25
    .line 26
    aput v2, v0, v1

    .line 27
    .line 28
    iget-wide v0, p0, Ldefpackage/l32;->v:J

    .line 29
    .line 30
    return-wide v0

    .line 31
    :cond_1
    const/16 v1, 0x10

    .line 32
    .line 33
    const-string v3, "Expected a long but was "

    .line 34
    .line 35
    if-ne v0, v1, :cond_2

    .line 36
    .line 37
    new-instance v0, Ljava/lang/String;

    .line 38
    .line 39
    iget v1, p0, Ldefpackage/l32;->q:I

    .line 40
    .line 41
    iget v4, p0, Ldefpackage/l32;->w:I

    .line 42
    .line 43
    iget-object v5, p0, Ldefpackage/l32;->p:[C

    .line 44
    .line 45
    invoke-direct {v0, v5, v1, v4}, Ljava/lang/String;-><init>([CII)V

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, Ldefpackage/l32;->x:Ljava/lang/String;

    .line 49
    .line 50
    iget v0, p0, Ldefpackage/l32;->q:I

    .line 51
    .line 52
    iget v1, p0, Ldefpackage/l32;->w:I

    .line 53
    .line 54
    add-int/2addr v0, v1

    .line 55
    iput v0, p0, Ldefpackage/l32;->q:I

    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_2
    const/16 v1, 0xa

    .line 59
    .line 60
    const/16 v4, 0x8

    .line 61
    .line 62
    if-eq v0, v4, :cond_4

    .line 63
    .line 64
    const/16 v5, 0x9

    .line 65
    .line 66
    if-eq v0, v5, :cond_4

    .line 67
    .line 68
    if-ne v0, v1, :cond_3

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_3
    invoke-virtual {p0}, Ldefpackage/l32;->e0()I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    invoke-static {v0}, Ldefpackage/b11;->x(I)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {p0}, Ldefpackage/l32;->M()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-static {v0, p0, v3}, Ldefpackage/er1;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    const-wide/16 v0, 0x0

    .line 87
    .line 88
    return-wide v0

    .line 89
    :cond_4
    :goto_0
    if-ne v0, v1, :cond_5

    .line 90
    .line 91
    invoke-virtual {p0}, Ldefpackage/l32;->d0()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    iput-object v0, p0, Ldefpackage/l32;->x:Ljava/lang/String;

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_5
    if-ne v0, v4, :cond_6

    .line 99
    .line 100
    const/16 v0, 0x27

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_6
    const/16 v0, 0x22

    .line 104
    .line 105
    :goto_1
    invoke-virtual {p0, v0}, Ldefpackage/l32;->b0(C)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    iput-object v0, p0, Ldefpackage/l32;->x:Ljava/lang/String;

    .line 110
    .line 111
    :goto_2
    :try_start_0
    iget-object v0, p0, Ldefpackage/l32;->x:Ljava/lang/String;

    .line 112
    .line 113
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 114
    .line 115
    .line 116
    move-result-wide v0

    .line 117
    iput v2, p0, Ldefpackage/l32;->u:I

    .line 118
    .line 119
    iget-object v4, p0, Ldefpackage/l32;->B:[I

    .line 120
    .line 121
    iget v5, p0, Ldefpackage/l32;->z:I

    .line 122
    .line 123
    add-int/lit8 v5, v5, -0x1

    .line 124
    .line 125
    aget v6, v4, v5

    .line 126
    .line 127
    add-int/lit8 v6, v6, 0x1

    .line 128
    .line 129
    aput v6, v4, v5
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 130
    .line 131
    return-wide v0

    .line 132
    :catch_0
    :goto_3
    const/16 v0, 0xb

    .line 133
    .line 134
    iput v0, p0, Ldefpackage/l32;->u:I

    .line 135
    .line 136
    iget-object v0, p0, Ldefpackage/l32;->x:Ljava/lang/String;

    .line 137
    .line 138
    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 139
    .line 140
    .line 141
    move-result-wide v0

    .line 142
    double-to-long v4, v0

    .line 143
    long-to-double v6, v4

    .line 144
    cmpl-double v0, v6, v0

    .line 145
    .line 146
    if-nez v0, :cond_7

    .line 147
    .line 148
    const/4 v0, 0x0

    .line 149
    iput-object v0, p0, Ldefpackage/l32;->x:Ljava/lang/String;

    .line 150
    .line 151
    iput v2, p0, Ldefpackage/l32;->u:I

    .line 152
    .line 153
    iget-object v0, p0, Ldefpackage/l32;->B:[I

    .line 154
    .line 155
    iget p0, p0, Ldefpackage/l32;->z:I

    .line 156
    .line 157
    add-int/lit8 p0, p0, -0x1

    .line 158
    .line 159
    aget v1, v0, p0

    .line 160
    .line 161
    add-int/lit8 v1, v1, 0x1

    .line 162
    .line 163
    aput v1, v0, p0

    .line 164
    .line 165
    return-wide v4

    .line 166
    :cond_7
    new-instance v0, Ljava/lang/NumberFormatException;

    .line 167
    .line 168
    iget-object v1, p0, Ldefpackage/l32;->x:Ljava/lang/String;

    .line 169
    .line 170
    invoke-virtual {p0}, Ldefpackage/l32;->M()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    new-instance v2, Ljava/lang/StringBuilder;

    .line 175
    .line 176
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    invoke-direct {v0, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    throw v0
.end method

.method public Y()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Ldefpackage/l32;->u:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/l32;->n()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    :cond_0
    const/16 v1, 0xe

    .line 10
    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Ldefpackage/l32;->d0()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    goto :goto_0

    .line 18
    :cond_1
    const/16 v1, 0xc

    .line 19
    .line 20
    if-ne v0, v1, :cond_2

    .line 21
    .line 22
    const/16 v0, 0x27

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Ldefpackage/l32;->b0(C)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    goto :goto_0

    .line 29
    :cond_2
    const/16 v1, 0xd

    .line 30
    .line 31
    if-ne v0, v1, :cond_3

    .line 32
    .line 33
    const/16 v0, 0x22

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Ldefpackage/l32;->b0(C)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    :goto_0
    const/4 v1, 0x0

    .line 40
    iput v1, p0, Ldefpackage/l32;->u:I

    .line 41
    .line 42
    iget-object v1, p0, Ldefpackage/l32;->A:[Ljava/lang/String;

    .line 43
    .line 44
    iget p0, p0, Ldefpackage/l32;->z:I

    .line 45
    .line 46
    add-int/lit8 p0, p0, -0x1

    .line 47
    .line 48
    aput-object v0, v1, p0

    .line 49
    .line 50
    return-object v0

    .line 51
    :cond_3
    invoke-virtual {p0}, Ldefpackage/l32;->e0()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    invoke-static {v0}, Ldefpackage/b11;->x(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {p0}, Ldefpackage/l32;->M()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    const-string v1, "Expected a name but was "

    .line 64
    .line 65
    invoke-static {v0, p0, v1}, Ldefpackage/er1;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const/4 p0, 0x0

    .line 69
    return-object p0
.end method

.method public final Z(Z)I
    .locals 9

    .line 1
    iget v0, p0, Ldefpackage/l32;->q:I

    .line 2
    .line 3
    iget v1, p0, Ldefpackage/l32;->r:I

    .line 4
    .line 5
    :goto_0
    const/4 v2, 0x1

    .line 6
    if-ne v0, v1, :cond_2

    .line 7
    .line 8
    iput v0, p0, Ldefpackage/l32;->q:I

    .line 9
    .line 10
    invoke-virtual {p0, v2}, Ldefpackage/l32;->u(I)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    const/4 p0, -0x1

    .line 19
    return p0

    .line 20
    :cond_0
    new-instance p1, Ljava/io/EOFException;

    .line 21
    .line 22
    invoke-virtual {p0}, Ldefpackage/l32;->M()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const-string v0, "End of input"

    .line 27
    .line 28
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-direct {p1, p0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p1

    .line 36
    :cond_1
    iget v0, p0, Ldefpackage/l32;->q:I

    .line 37
    .line 38
    iget v1, p0, Ldefpackage/l32;->r:I

    .line 39
    .line 40
    :cond_2
    add-int/lit8 v3, v0, 0x1

    .line 41
    .line 42
    iget-object v4, p0, Ldefpackage/l32;->p:[C

    .line 43
    .line 44
    aget-char v5, v4, v0

    .line 45
    .line 46
    const/16 v6, 0xa

    .line 47
    .line 48
    if-ne v5, v6, :cond_3

    .line 49
    .line 50
    iget v0, p0, Ldefpackage/l32;->s:I

    .line 51
    .line 52
    add-int/2addr v0, v2

    .line 53
    iput v0, p0, Ldefpackage/l32;->s:I

    .line 54
    .line 55
    iput v3, p0, Ldefpackage/l32;->t:I

    .line 56
    .line 57
    goto/16 :goto_6

    .line 58
    .line 59
    :cond_3
    const/16 v7, 0x20

    .line 60
    .line 61
    if-eq v5, v7, :cond_f

    .line 62
    .line 63
    const/16 v7, 0xd

    .line 64
    .line 65
    if-eq v5, v7, :cond_f

    .line 66
    .line 67
    const/16 v7, 0x9

    .line 68
    .line 69
    if-ne v5, v7, :cond_4

    .line 70
    .line 71
    goto/16 :goto_6

    .line 72
    .line 73
    :cond_4
    const/16 v7, 0x2f

    .line 74
    .line 75
    if-ne v5, v7, :cond_d

    .line 76
    .line 77
    iput v3, p0, Ldefpackage/l32;->q:I

    .line 78
    .line 79
    const/4 v8, 0x2

    .line 80
    if-ne v3, v1, :cond_5

    .line 81
    .line 82
    iput v0, p0, Ldefpackage/l32;->q:I

    .line 83
    .line 84
    invoke-virtual {p0, v8}, Ldefpackage/l32;->u(I)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    iget v1, p0, Ldefpackage/l32;->q:I

    .line 89
    .line 90
    add-int/2addr v1, v2

    .line 91
    iput v1, p0, Ldefpackage/l32;->q:I

    .line 92
    .line 93
    if-nez v0, :cond_5

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_5
    invoke-virtual {p0}, Ldefpackage/l32;->j()V

    .line 97
    .line 98
    .line 99
    iget v0, p0, Ldefpackage/l32;->q:I

    .line 100
    .line 101
    aget-char v1, v4, v0

    .line 102
    .line 103
    const/16 v3, 0x2a

    .line 104
    .line 105
    if-eq v1, v3, :cond_7

    .line 106
    .line 107
    if-eq v1, v7, :cond_6

    .line 108
    .line 109
    :goto_1
    return v5

    .line 110
    :cond_6
    add-int/lit8 v0, v0, 0x1

    .line 111
    .line 112
    iput v0, p0, Ldefpackage/l32;->q:I

    .line 113
    .line 114
    invoke-virtual {p0}, Ldefpackage/l32;->i0()V

    .line 115
    .line 116
    .line 117
    iget v0, p0, Ldefpackage/l32;->q:I

    .line 118
    .line 119
    iget v1, p0, Ldefpackage/l32;->r:I

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_7
    add-int/lit8 v0, v0, 0x1

    .line 123
    .line 124
    iput v0, p0, Ldefpackage/l32;->q:I

    .line 125
    .line 126
    :goto_2
    iget v0, p0, Ldefpackage/l32;->q:I

    .line 127
    .line 128
    add-int/2addr v0, v8

    .line 129
    iget v1, p0, Ldefpackage/l32;->r:I

    .line 130
    .line 131
    if-le v0, v1, :cond_9

    .line 132
    .line 133
    invoke-virtual {p0, v8}, Ldefpackage/l32;->u(I)Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-eqz v0, :cond_8

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_8
    const-string p1, "Unterminated comment"

    .line 141
    .line 142
    invoke-virtual {p0, p1}, Ldefpackage/l32;->l0(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    const/4 p0, 0x0

    .line 146
    throw p0

    .line 147
    :cond_9
    :goto_3
    iget v0, p0, Ldefpackage/l32;->q:I

    .line 148
    .line 149
    aget-char v1, v4, v0

    .line 150
    .line 151
    if-ne v1, v6, :cond_a

    .line 152
    .line 153
    iget v1, p0, Ldefpackage/l32;->s:I

    .line 154
    .line 155
    add-int/2addr v1, v2

    .line 156
    iput v1, p0, Ldefpackage/l32;->s:I

    .line 157
    .line 158
    add-int/lit8 v0, v0, 0x1

    .line 159
    .line 160
    iput v0, p0, Ldefpackage/l32;->t:I

    .line 161
    .line 162
    goto :goto_5

    .line 163
    :cond_a
    const/4 v0, 0x0

    .line 164
    :goto_4
    iget v1, p0, Ldefpackage/l32;->q:I

    .line 165
    .line 166
    if-ge v0, v8, :cond_c

    .line 167
    .line 168
    add-int/2addr v1, v0

    .line 169
    aget-char v1, v4, v1

    .line 170
    .line 171
    const-string v3, "*/"

    .line 172
    .line 173
    invoke-virtual {v3, v0}, Ljava/lang/String;->charAt(I)C

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    if-eq v1, v3, :cond_b

    .line 178
    .line 179
    :goto_5
    iget v0, p0, Ldefpackage/l32;->q:I

    .line 180
    .line 181
    add-int/2addr v0, v2

    .line 182
    iput v0, p0, Ldefpackage/l32;->q:I

    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_b
    add-int/lit8 v0, v0, 0x1

    .line 186
    .line 187
    goto :goto_4

    .line 188
    :cond_c
    add-int/lit8 v0, v1, 0x2

    .line 189
    .line 190
    iget v1, p0, Ldefpackage/l32;->r:I

    .line 191
    .line 192
    goto/16 :goto_0

    .line 193
    .line 194
    :cond_d
    const/16 v0, 0x23

    .line 195
    .line 196
    if-ne v5, v0, :cond_e

    .line 197
    .line 198
    iput v3, p0, Ldefpackage/l32;->q:I

    .line 199
    .line 200
    invoke-virtual {p0}, Ldefpackage/l32;->j()V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p0}, Ldefpackage/l32;->i0()V

    .line 204
    .line 205
    .line 206
    iget v0, p0, Ldefpackage/l32;->q:I

    .line 207
    .line 208
    iget v1, p0, Ldefpackage/l32;->r:I

    .line 209
    .line 210
    goto/16 :goto_0

    .line 211
    .line 212
    :cond_e
    iput v3, p0, Ldefpackage/l32;->q:I

    .line 213
    .line 214
    return v5

    .line 215
    :cond_f
    :goto_6
    move v0, v3

    .line 216
    goto/16 :goto_0
.end method

.method public a0()V
    .locals 2

    .line 1
    iget v0, p0, Ldefpackage/l32;->u:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/l32;->n()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    :cond_0
    const/4 v1, 0x7

    .line 10
    if-ne v0, v1, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    iput v0, p0, Ldefpackage/l32;->u:I

    .line 14
    .line 15
    iget-object v0, p0, Ldefpackage/l32;->B:[I

    .line 16
    .line 17
    iget p0, p0, Ldefpackage/l32;->z:I

    .line 18
    .line 19
    add-int/lit8 p0, p0, -0x1

    .line 20
    .line 21
    aget v1, v0, p0

    .line 22
    .line 23
    add-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    aput v1, v0, p0

    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    invoke-virtual {p0}, Ldefpackage/l32;->e0()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-static {v0}, Ldefpackage/b11;->x(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {p0}, Ldefpackage/l32;->M()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    const-string v1, "Expected null but was "

    .line 41
    .line 42
    invoke-static {v0, p0, v1}, Ldefpackage/er1;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public b()V
    .locals 3

    .line 1
    iget v0, p0, Ldefpackage/l32;->u:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/l32;->n()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    :cond_0
    const/4 v1, 0x3

    .line 10
    if-ne v0, v1, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-virtual {p0, v0}, Ldefpackage/l32;->f0(I)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Ldefpackage/l32;->B:[I

    .line 17
    .line 18
    iget v2, p0, Ldefpackage/l32;->z:I

    .line 19
    .line 20
    sub-int/2addr v2, v0

    .line 21
    const/4 v0, 0x0

    .line 22
    aput v0, v1, v2

    .line 23
    .line 24
    iput v0, p0, Ldefpackage/l32;->u:I

    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    invoke-virtual {p0}, Ldefpackage/l32;->e0()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-static {v0}, Ldefpackage/b11;->x(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p0}, Ldefpackage/l32;->M()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    const-string v1, "Expected BEGIN_ARRAY but was "

    .line 40
    .line 41
    invoke-static {v0, p0, v1}, Ldefpackage/er1;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final b0(C)Ljava/lang/String;
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    move-object v1, v0

    .line 3
    :goto_0
    iget v2, p0, Ldefpackage/l32;->q:I

    .line 4
    .line 5
    iget v3, p0, Ldefpackage/l32;->r:I

    .line 6
    .line 7
    :goto_1
    move v4, v3

    .line 8
    move v3, v2

    .line 9
    :goto_2
    const/16 v5, 0x10

    .line 10
    .line 11
    const/4 v6, 0x1

    .line 12
    iget-object v7, p0, Ldefpackage/l32;->p:[C

    .line 13
    .line 14
    if-ge v2, v4, :cond_5

    .line 15
    .line 16
    add-int/lit8 v8, v2, 0x1

    .line 17
    .line 18
    aget-char v2, v7, v2

    .line 19
    .line 20
    if-ne v2, p1, :cond_1

    .line 21
    .line 22
    iput v8, p0, Ldefpackage/l32;->q:I

    .line 23
    .line 24
    sub-int/2addr v8, v3

    .line 25
    sub-int/2addr v8, v6

    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    new-instance p0, Ljava/lang/String;

    .line 29
    .line 30
    invoke-direct {p0, v7, v3, v8}, Ljava/lang/String;-><init>([CII)V

    .line 31
    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_0
    invoke-virtual {v1, v7, v3, v8}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :cond_1
    const/16 v9, 0x5c

    .line 43
    .line 44
    if-ne v2, v9, :cond_3

    .line 45
    .line 46
    iput v8, p0, Ldefpackage/l32;->q:I

    .line 47
    .line 48
    sub-int/2addr v8, v3

    .line 49
    add-int/lit8 v2, v8, -0x1

    .line 50
    .line 51
    if-nez v1, :cond_2

    .line 52
    .line 53
    mul-int/lit8 v8, v8, 0x2

    .line 54
    .line 55
    new-instance v1, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-static {v8, v5}, Ljava/lang/Math;->max(II)I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 62
    .line 63
    .line 64
    :cond_2
    invoke-virtual {v1, v7, v3, v2}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, Ldefpackage/l32;->g0()C

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    iget v2, p0, Ldefpackage/l32;->q:I

    .line 75
    .line 76
    iget v3, p0, Ldefpackage/l32;->r:I

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_3
    const/16 v5, 0xa

    .line 80
    .line 81
    if-ne v2, v5, :cond_4

    .line 82
    .line 83
    iget v2, p0, Ldefpackage/l32;->s:I

    .line 84
    .line 85
    add-int/2addr v2, v6

    .line 86
    iput v2, p0, Ldefpackage/l32;->s:I

    .line 87
    .line 88
    iput v8, p0, Ldefpackage/l32;->t:I

    .line 89
    .line 90
    :cond_4
    move v2, v8

    .line 91
    goto :goto_2

    .line 92
    :cond_5
    if-nez v1, :cond_6

    .line 93
    .line 94
    sub-int v1, v2, v3

    .line 95
    .line 96
    mul-int/lit8 v1, v1, 0x2

    .line 97
    .line 98
    new-instance v4, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    invoke-static {v1, v5}, Ljava/lang/Math;->max(II)I

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 105
    .line 106
    .line 107
    move-object v1, v4

    .line 108
    :cond_6
    sub-int v4, v2, v3

    .line 109
    .line 110
    invoke-virtual {v1, v7, v3, v4}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    iput v2, p0, Ldefpackage/l32;->q:I

    .line 114
    .line 115
    invoke-virtual {p0, v6}, Ldefpackage/l32;->u(I)Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-eqz v2, :cond_7

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_7
    const-string p1, "Unterminated string"

    .line 123
    .line 124
    invoke-virtual {p0, p1}, Ldefpackage/l32;->l0(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw v0
.end method

.method public c0()Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, Ldefpackage/l32;->u:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/l32;->n()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    :cond_0
    const/16 v1, 0xa

    .line 10
    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Ldefpackage/l32;->d0()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    goto :goto_0

    .line 18
    :cond_1
    const/16 v1, 0x8

    .line 19
    .line 20
    if-ne v0, v1, :cond_2

    .line 21
    .line 22
    const/16 v0, 0x27

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Ldefpackage/l32;->b0(C)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    goto :goto_0

    .line 29
    :cond_2
    const/16 v1, 0x9

    .line 30
    .line 31
    if-ne v0, v1, :cond_3

    .line 32
    .line 33
    const/16 v0, 0x22

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Ldefpackage/l32;->b0(C)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    goto :goto_0

    .line 40
    :cond_3
    const/16 v1, 0xb

    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    if-ne v0, v1, :cond_4

    .line 44
    .line 45
    iget-object v0, p0, Ldefpackage/l32;->x:Ljava/lang/String;

    .line 46
    .line 47
    iput-object v2, p0, Ldefpackage/l32;->x:Ljava/lang/String;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_4
    const/16 v1, 0xf

    .line 51
    .line 52
    if-ne v0, v1, :cond_5

    .line 53
    .line 54
    iget-wide v0, p0, Ldefpackage/l32;->v:J

    .line 55
    .line 56
    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    goto :goto_0

    .line 61
    :cond_5
    const/16 v1, 0x10

    .line 62
    .line 63
    if-ne v0, v1, :cond_6

    .line 64
    .line 65
    new-instance v0, Ljava/lang/String;

    .line 66
    .line 67
    iget v1, p0, Ldefpackage/l32;->q:I

    .line 68
    .line 69
    iget v2, p0, Ldefpackage/l32;->w:I

    .line 70
    .line 71
    iget-object v3, p0, Ldefpackage/l32;->p:[C

    .line 72
    .line 73
    invoke-direct {v0, v3, v1, v2}, Ljava/lang/String;-><init>([CII)V

    .line 74
    .line 75
    .line 76
    iget v1, p0, Ldefpackage/l32;->q:I

    .line 77
    .line 78
    iget v2, p0, Ldefpackage/l32;->w:I

    .line 79
    .line 80
    add-int/2addr v1, v2

    .line 81
    iput v1, p0, Ldefpackage/l32;->q:I

    .line 82
    .line 83
    :goto_0
    const/4 v1, 0x0

    .line 84
    iput v1, p0, Ldefpackage/l32;->u:I

    .line 85
    .line 86
    iget-object v1, p0, Ldefpackage/l32;->B:[I

    .line 87
    .line 88
    iget p0, p0, Ldefpackage/l32;->z:I

    .line 89
    .line 90
    add-int/lit8 p0, p0, -0x1

    .line 91
    .line 92
    aget v2, v1, p0

    .line 93
    .line 94
    add-int/lit8 v2, v2, 0x1

    .line 95
    .line 96
    aput v2, v1, p0

    .line 97
    .line 98
    return-object v0

    .line 99
    :cond_6
    invoke-virtual {p0}, Ldefpackage/l32;->e0()I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    invoke-static {v0}, Ldefpackage/b11;->x(I)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-virtual {p0}, Ldefpackage/l32;->M()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    const-string v1, "Expected a string but was "

    .line 112
    .line 113
    invoke-static {v0, p0, v1}, Ldefpackage/er1;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    return-object v2
.end method

.method public close()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ldefpackage/l32;->u:I

    .line 3
    .line 4
    iget-object v1, p0, Ldefpackage/l32;->y:[I

    .line 5
    .line 6
    const/16 v2, 0x8

    .line 7
    .line 8
    aput v2, v1, v0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput v0, p0, Ldefpackage/l32;->z:I

    .line 12
    .line 13
    iget-object p0, p0, Ldefpackage/l32;->n:Ljava/io/Reader;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/io/Reader;->close()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final d0()Ljava/lang/String;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :cond_0
    move v2, v1

    .line 4
    :goto_0
    iget v3, p0, Ldefpackage/l32;->q:I

    .line 5
    .line 6
    add-int/2addr v3, v2

    .line 7
    iget v4, p0, Ldefpackage/l32;->r:I

    .line 8
    .line 9
    iget-object v5, p0, Ldefpackage/l32;->p:[C

    .line 10
    .line 11
    if-ge v3, v4, :cond_2

    .line 12
    .line 13
    aget-char v3, v5, v3

    .line 14
    .line 15
    const/16 v4, 0x9

    .line 16
    .line 17
    if-eq v3, v4, :cond_3

    .line 18
    .line 19
    const/16 v4, 0xa

    .line 20
    .line 21
    if-eq v3, v4, :cond_3

    .line 22
    .line 23
    const/16 v4, 0xc

    .line 24
    .line 25
    if-eq v3, v4, :cond_3

    .line 26
    .line 27
    const/16 v4, 0xd

    .line 28
    .line 29
    if-eq v3, v4, :cond_3

    .line 30
    .line 31
    const/16 v4, 0x20

    .line 32
    .line 33
    if-eq v3, v4, :cond_3

    .line 34
    .line 35
    const/16 v4, 0x23

    .line 36
    .line 37
    if-eq v3, v4, :cond_1

    .line 38
    .line 39
    const/16 v4, 0x2c

    .line 40
    .line 41
    if-eq v3, v4, :cond_3

    .line 42
    .line 43
    const/16 v4, 0x2f

    .line 44
    .line 45
    if-eq v3, v4, :cond_1

    .line 46
    .line 47
    const/16 v4, 0x3d

    .line 48
    .line 49
    if-eq v3, v4, :cond_1

    .line 50
    .line 51
    const/16 v4, 0x7b

    .line 52
    .line 53
    if-eq v3, v4, :cond_3

    .line 54
    .line 55
    const/16 v4, 0x7d

    .line 56
    .line 57
    if-eq v3, v4, :cond_3

    .line 58
    .line 59
    const/16 v4, 0x3a

    .line 60
    .line 61
    if-eq v3, v4, :cond_3

    .line 62
    .line 63
    const/16 v4, 0x3b

    .line 64
    .line 65
    if-eq v3, v4, :cond_1

    .line 66
    .line 67
    packed-switch v3, :pswitch_data_0

    .line 68
    .line 69
    .line 70
    add-int/lit8 v2, v2, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    :pswitch_0
    invoke-virtual {p0}, Ldefpackage/l32;->j()V

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_2
    array-length v3, v5

    .line 78
    if-ge v2, v3, :cond_4

    .line 79
    .line 80
    add-int/lit8 v3, v2, 0x1

    .line 81
    .line 82
    invoke-virtual {p0, v3}, Ldefpackage/l32;->u(I)Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-eqz v3, :cond_3

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_3
    :goto_1
    :pswitch_1
    move v1, v2

    .line 90
    goto :goto_2

    .line 91
    :cond_4
    if-nez v0, :cond_5

    .line 92
    .line 93
    new-instance v0, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    const/16 v3, 0x10

    .line 96
    .line 97
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 102
    .line 103
    .line 104
    :cond_5
    iget v3, p0, Ldefpackage/l32;->q:I

    .line 105
    .line 106
    invoke-virtual {v0, v5, v3, v2}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    iget v3, p0, Ldefpackage/l32;->q:I

    .line 110
    .line 111
    add-int/2addr v3, v2

    .line 112
    iput v3, p0, Ldefpackage/l32;->q:I

    .line 113
    .line 114
    const/4 v2, 0x1

    .line 115
    invoke-virtual {p0, v2}, Ldefpackage/l32;->u(I)Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-nez v2, :cond_0

    .line 120
    .line 121
    :goto_2
    iget v2, p0, Ldefpackage/l32;->q:I

    .line 122
    .line 123
    if-nez v0, :cond_6

    .line 124
    .line 125
    new-instance v0, Ljava/lang/String;

    .line 126
    .line 127
    invoke-direct {v0, v5, v2, v1}, Ljava/lang/String;-><init>([CII)V

    .line 128
    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_6
    invoke-virtual {v0, v5, v2, v1}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    :goto_3
    iget v2, p0, Ldefpackage/l32;->q:I

    .line 139
    .line 140
    add-int/2addr v2, v1

    .line 141
    iput v2, p0, Ldefpackage/l32;->q:I

    .line 142
    .line 143
    return-object v0

    .line 144
    nop

    .line 145
    :pswitch_data_0
    .packed-switch 0x5b
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public e0()I
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/l32;->u:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/l32;->n()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    :cond_0
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance p0, Ljava/lang/AssertionError;

    .line 13
    .line 14
    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    .line 15
    .line 16
    .line 17
    throw p0

    .line 18
    :pswitch_0
    const/16 p0, 0xa

    .line 19
    .line 20
    return p0

    .line 21
    :pswitch_1
    const/4 p0, 0x7

    .line 22
    return p0

    .line 23
    :pswitch_2
    const/4 p0, 0x5

    .line 24
    return p0

    .line 25
    :pswitch_3
    const/4 p0, 0x6

    .line 26
    return p0

    .line 27
    :pswitch_4
    const/16 p0, 0x9

    .line 28
    .line 29
    return p0

    .line 30
    :pswitch_5
    const/16 p0, 0x8

    .line 31
    .line 32
    return p0

    .line 33
    :pswitch_6
    const/4 p0, 0x2

    .line 34
    return p0

    .line 35
    :pswitch_7
    const/4 p0, 0x1

    .line 36
    return p0

    .line 37
    :pswitch_8
    const/4 p0, 0x4

    .line 38
    return p0

    .line 39
    :pswitch_9
    const/4 p0, 0x3

    .line 40
    return p0

    .line 41
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public f()V
    .locals 2

    .line 1
    iget v0, p0, Ldefpackage/l32;->u:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/l32;->n()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    :cond_0
    const/4 v1, 0x1

    .line 10
    if-ne v0, v1, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x3

    .line 13
    invoke-virtual {p0, v0}, Ldefpackage/l32;->f0(I)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput v0, p0, Ldefpackage/l32;->u:I

    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    invoke-virtual {p0}, Ldefpackage/l32;->e0()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-static {v0}, Ldefpackage/b11;->x(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {p0}, Ldefpackage/l32;->M()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    const-string v1, "Expected BEGIN_OBJECT but was "

    .line 33
    .line 34
    invoke-static {v0, p0, v1}, Ldefpackage/er1;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final f0(I)V
    .locals 3

    .line 1
    iget v0, p0, Ldefpackage/l32;->z:I

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/l32;->y:[I

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    if-ne v0, v2, :cond_0

    .line 7
    .line 8
    mul-int/lit8 v0, v0, 0x2

    .line 9
    .line 10
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iput-object v1, p0, Ldefpackage/l32;->y:[I

    .line 15
    .line 16
    iget-object v1, p0, Ldefpackage/l32;->B:[I

    .line 17
    .line 18
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iput-object v1, p0, Ldefpackage/l32;->B:[I

    .line 23
    .line 24
    iget-object v1, p0, Ldefpackage/l32;->A:[Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, [Ljava/lang/String;

    .line 31
    .line 32
    iput-object v0, p0, Ldefpackage/l32;->A:[Ljava/lang/String;

    .line 33
    .line 34
    :cond_0
    iget-object v0, p0, Ldefpackage/l32;->y:[I

    .line 35
    .line 36
    iget v1, p0, Ldefpackage/l32;->z:I

    .line 37
    .line 38
    add-int/lit8 v2, v1, 0x1

    .line 39
    .line 40
    iput v2, p0, Ldefpackage/l32;->z:I

    .line 41
    .line 42
    aput p1, v0, v1

    .line 43
    .line 44
    return-void
.end method

.method public final g0()C
    .locals 8

    .line 1
    iget v0, p0, Ldefpackage/l32;->q:I

    .line 2
    .line 3
    iget v1, p0, Ldefpackage/l32;->r:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "Unterminated escape sequence"

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    if-ne v0, v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0, v4}, Ldefpackage/l32;->u(I)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0, v3}, Ldefpackage/l32;->l0(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw v2

    .line 22
    :cond_1
    :goto_0
    iget v0, p0, Ldefpackage/l32;->q:I

    .line 23
    .line 24
    add-int/lit8 v1, v0, 0x1

    .line 25
    .line 26
    iput v1, p0, Ldefpackage/l32;->q:I

    .line 27
    .line 28
    iget-object v5, p0, Ldefpackage/l32;->p:[C

    .line 29
    .line 30
    aget-char v6, v5, v0

    .line 31
    .line 32
    const/16 v7, 0xa

    .line 33
    .line 34
    if-eq v6, v7, :cond_f

    .line 35
    .line 36
    const/16 v1, 0x22

    .line 37
    .line 38
    if-eq v6, v1, :cond_e

    .line 39
    .line 40
    const/16 v1, 0x27

    .line 41
    .line 42
    if-eq v6, v1, :cond_e

    .line 43
    .line 44
    const/16 v1, 0x2f

    .line 45
    .line 46
    if-eq v6, v1, :cond_e

    .line 47
    .line 48
    const/16 v1, 0x5c

    .line 49
    .line 50
    if-eq v6, v1, :cond_e

    .line 51
    .line 52
    const/16 v1, 0x62

    .line 53
    .line 54
    if-eq v6, v1, :cond_d

    .line 55
    .line 56
    const/16 v1, 0x66

    .line 57
    .line 58
    if-eq v6, v1, :cond_c

    .line 59
    .line 60
    const/16 v4, 0x6e

    .line 61
    .line 62
    if-eq v6, v4, :cond_b

    .line 63
    .line 64
    const/16 v4, 0x72

    .line 65
    .line 66
    if-eq v6, v4, :cond_a

    .line 67
    .line 68
    const/16 v4, 0x74

    .line 69
    .line 70
    if-eq v6, v4, :cond_9

    .line 71
    .line 72
    const/16 v4, 0x75

    .line 73
    .line 74
    if-ne v6, v4, :cond_8

    .line 75
    .line 76
    add-int/lit8 v0, v0, 0x5

    .line 77
    .line 78
    iget v4, p0, Ldefpackage/l32;->r:I

    .line 79
    .line 80
    const/4 v6, 0x4

    .line 81
    if-le v0, v4, :cond_3

    .line 82
    .line 83
    invoke-virtual {p0, v6}, Ldefpackage/l32;->u(I)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-eqz v0, :cond_2

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_2
    invoke-virtual {p0, v3}, Ldefpackage/l32;->l0(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw v2

    .line 94
    :cond_3
    :goto_1
    iget v0, p0, Ldefpackage/l32;->q:I

    .line 95
    .line 96
    add-int/lit8 v2, v0, 0x4

    .line 97
    .line 98
    const/4 v3, 0x0

    .line 99
    :goto_2
    if-ge v0, v2, :cond_7

    .line 100
    .line 101
    aget-char v4, v5, v0

    .line 102
    .line 103
    shl-int/lit8 v3, v3, 0x4

    .line 104
    .line 105
    int-to-char v3, v3

    .line 106
    const/16 v7, 0x30

    .line 107
    .line 108
    if-lt v4, v7, :cond_4

    .line 109
    .line 110
    const/16 v7, 0x39

    .line 111
    .line 112
    if-gt v4, v7, :cond_4

    .line 113
    .line 114
    add-int/lit8 v4, v4, -0x30

    .line 115
    .line 116
    :goto_3
    add-int/2addr v4, v3

    .line 117
    int-to-char v3, v4

    .line 118
    goto :goto_4

    .line 119
    :cond_4
    const/16 v7, 0x61

    .line 120
    .line 121
    if-lt v4, v7, :cond_5

    .line 122
    .line 123
    if-gt v4, v1, :cond_5

    .line 124
    .line 125
    add-int/lit8 v4, v4, -0x57

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_5
    const/16 v7, 0x41

    .line 129
    .line 130
    if-lt v4, v7, :cond_6

    .line 131
    .line 132
    const/16 v7, 0x46

    .line 133
    .line 134
    if-gt v4, v7, :cond_6

    .line 135
    .line 136
    add-int/lit8 v4, v4, -0x37

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :goto_4
    add-int/lit8 v0, v0, 0x1

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_6
    new-instance v0, Ljava/lang/NumberFormatException;

    .line 143
    .line 144
    new-instance v1, Ljava/lang/String;

    .line 145
    .line 146
    iget p0, p0, Ldefpackage/l32;->q:I

    .line 147
    .line 148
    invoke-direct {v1, v5, p0, v6}, Ljava/lang/String;-><init>([CII)V

    .line 149
    .line 150
    .line 151
    const-string p0, "\\u"

    .line 152
    .line 153
    invoke-virtual {p0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    invoke-direct {v0, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    throw v0

    .line 161
    :cond_7
    iget v0, p0, Ldefpackage/l32;->q:I

    .line 162
    .line 163
    add-int/2addr v0, v6

    .line 164
    iput v0, p0, Ldefpackage/l32;->q:I

    .line 165
    .line 166
    return v3

    .line 167
    :cond_8
    const-string v0, "Invalid escape sequence"

    .line 168
    .line 169
    invoke-virtual {p0, v0}, Ldefpackage/l32;->l0(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    throw v2

    .line 173
    :cond_9
    const/16 p0, 0x9

    .line 174
    .line 175
    return p0

    .line 176
    :cond_a
    const/16 p0, 0xd

    .line 177
    .line 178
    return p0

    .line 179
    :cond_b
    return v7

    .line 180
    :cond_c
    const/16 p0, 0xc

    .line 181
    .line 182
    return p0

    .line 183
    :cond_d
    const/16 p0, 0x8

    .line 184
    .line 185
    return p0

    .line 186
    :cond_e
    return v6

    .line 187
    :cond_f
    iget v0, p0, Ldefpackage/l32;->s:I

    .line 188
    .line 189
    add-int/2addr v0, v4

    .line 190
    iput v0, p0, Ldefpackage/l32;->s:I

    .line 191
    .line 192
    iput v1, p0, Ldefpackage/l32;->t:I

    .line 193
    .line 194
    return v6
.end method

.method public final h0(C)V
    .locals 5

    .line 1
    :goto_0
    iget v0, p0, Ldefpackage/l32;->q:I

    .line 2
    .line 3
    iget v1, p0, Ldefpackage/l32;->r:I

    .line 4
    .line 5
    :goto_1
    const/4 v2, 0x1

    .line 6
    if-ge v0, v1, :cond_3

    .line 7
    .line 8
    add-int/lit8 v3, v0, 0x1

    .line 9
    .line 10
    iget-object v4, p0, Ldefpackage/l32;->p:[C

    .line 11
    .line 12
    aget-char v0, v4, v0

    .line 13
    .line 14
    if-ne v0, p1, :cond_0

    .line 15
    .line 16
    iput v3, p0, Ldefpackage/l32;->q:I

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const/16 v4, 0x5c

    .line 20
    .line 21
    if-ne v0, v4, :cond_1

    .line 22
    .line 23
    iput v3, p0, Ldefpackage/l32;->q:I

    .line 24
    .line 25
    invoke-virtual {p0}, Ldefpackage/l32;->g0()C

    .line 26
    .line 27
    .line 28
    iget v0, p0, Ldefpackage/l32;->q:I

    .line 29
    .line 30
    iget v1, p0, Ldefpackage/l32;->r:I

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    const/16 v4, 0xa

    .line 34
    .line 35
    if-ne v0, v4, :cond_2

    .line 36
    .line 37
    iget v0, p0, Ldefpackage/l32;->s:I

    .line 38
    .line 39
    add-int/2addr v0, v2

    .line 40
    iput v0, p0, Ldefpackage/l32;->s:I

    .line 41
    .line 42
    iput v3, p0, Ldefpackage/l32;->t:I

    .line 43
    .line 44
    :cond_2
    move v0, v3

    .line 45
    goto :goto_1

    .line 46
    :cond_3
    iput v0, p0, Ldefpackage/l32;->q:I

    .line 47
    .line 48
    invoke-virtual {p0, v2}, Ldefpackage/l32;->u(I)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_4

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_4
    const-string p1, "Unterminated string"

    .line 56
    .line 57
    invoke-virtual {p0, p1}, Ldefpackage/l32;->l0(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    const/4 p0, 0x0

    .line 61
    throw p0
.end method

.method public final i0()V
    .locals 4

    .line 1
    :cond_0
    iget v0, p0, Ldefpackage/l32;->q:I

    .line 2
    .line 3
    iget v1, p0, Ldefpackage/l32;->r:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-lt v0, v1, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0, v2}, Ldefpackage/l32;->u(I)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_3

    .line 13
    .line 14
    :cond_1
    iget v0, p0, Ldefpackage/l32;->q:I

    .line 15
    .line 16
    add-int/lit8 v1, v0, 0x1

    .line 17
    .line 18
    iput v1, p0, Ldefpackage/l32;->q:I

    .line 19
    .line 20
    iget-object v3, p0, Ldefpackage/l32;->p:[C

    .line 21
    .line 22
    aget-char v0, v3, v0

    .line 23
    .line 24
    const/16 v3, 0xa

    .line 25
    .line 26
    if-ne v0, v3, :cond_2

    .line 27
    .line 28
    iget v0, p0, Ldefpackage/l32;->s:I

    .line 29
    .line 30
    add-int/2addr v0, v2

    .line 31
    iput v0, p0, Ldefpackage/l32;->s:I

    .line 32
    .line 33
    iput v1, p0, Ldefpackage/l32;->t:I

    .line 34
    .line 35
    return-void

    .line 36
    :cond_2
    const/16 v1, 0xd

    .line 37
    .line 38
    if-ne v0, v1, :cond_0

    .line 39
    .line 40
    :cond_3
    return-void
.end method

.method public final j()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldefpackage/l32;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string v0, "Use JsonReader.setLenient(true) to accept malformed JSON"

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Ldefpackage/l32;->l0(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final j0()V
    .locals 3

    .line 1
    :cond_0
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget v1, p0, Ldefpackage/l32;->q:I

    .line 3
    .line 4
    add-int/2addr v1, v0

    .line 5
    iget v2, p0, Ldefpackage/l32;->r:I

    .line 6
    .line 7
    if-ge v1, v2, :cond_3

    .line 8
    .line 9
    iget-object v2, p0, Ldefpackage/l32;->p:[C

    .line 10
    .line 11
    aget-char v1, v2, v1

    .line 12
    .line 13
    const/16 v2, 0x9

    .line 14
    .line 15
    if-eq v1, v2, :cond_2

    .line 16
    .line 17
    const/16 v2, 0xa

    .line 18
    .line 19
    if-eq v1, v2, :cond_2

    .line 20
    .line 21
    const/16 v2, 0xc

    .line 22
    .line 23
    if-eq v1, v2, :cond_2

    .line 24
    .line 25
    const/16 v2, 0xd

    .line 26
    .line 27
    if-eq v1, v2, :cond_2

    .line 28
    .line 29
    const/16 v2, 0x20

    .line 30
    .line 31
    if-eq v1, v2, :cond_2

    .line 32
    .line 33
    const/16 v2, 0x23

    .line 34
    .line 35
    if-eq v1, v2, :cond_1

    .line 36
    .line 37
    const/16 v2, 0x2c

    .line 38
    .line 39
    if-eq v1, v2, :cond_2

    .line 40
    .line 41
    const/16 v2, 0x2f

    .line 42
    .line 43
    if-eq v1, v2, :cond_1

    .line 44
    .line 45
    const/16 v2, 0x3d

    .line 46
    .line 47
    if-eq v1, v2, :cond_1

    .line 48
    .line 49
    const/16 v2, 0x7b

    .line 50
    .line 51
    if-eq v1, v2, :cond_2

    .line 52
    .line 53
    const/16 v2, 0x7d

    .line 54
    .line 55
    if-eq v1, v2, :cond_2

    .line 56
    .line 57
    const/16 v2, 0x3a

    .line 58
    .line 59
    if-eq v1, v2, :cond_2

    .line 60
    .line 61
    const/16 v2, 0x3b

    .line 62
    .line 63
    if-eq v1, v2, :cond_1

    .line 64
    .line 65
    packed-switch v1, :pswitch_data_0

    .line 66
    .line 67
    .line 68
    add-int/lit8 v0, v0, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    :pswitch_0
    invoke-virtual {p0}, Ldefpackage/l32;->j()V

    .line 72
    .line 73
    .line 74
    :cond_2
    :pswitch_1
    iget v1, p0, Ldefpackage/l32;->q:I

    .line 75
    .line 76
    add-int/2addr v1, v0

    .line 77
    iput v1, p0, Ldefpackage/l32;->q:I

    .line 78
    .line 79
    return-void

    .line 80
    :cond_3
    iput v1, p0, Ldefpackage/l32;->q:I

    .line 81
    .line 82
    const/4 v0, 0x1

    .line 83
    invoke-virtual {p0, v0}, Ldefpackage/l32;->u(I)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-nez v0, :cond_0

    .line 88
    .line 89
    return-void

    .line 90
    nop

    .line 91
    :pswitch_data_0
    .packed-switch 0x5b
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public k0()V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :cond_0
    iget v2, p0, Ldefpackage/l32;->u:I

    .line 4
    .line 5
    if-nez v2, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Ldefpackage/l32;->n()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    :cond_1
    const/16 v3, 0x27

    .line 12
    .line 13
    const/16 v4, 0x22

    .line 14
    .line 15
    const-string v5, "<skipped>"

    .line 16
    .line 17
    const/4 v6, 0x1

    .line 18
    packed-switch v2, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    :pswitch_0
    goto :goto_2

    .line 22
    :pswitch_1
    return-void

    .line 23
    :pswitch_2
    iget v2, p0, Ldefpackage/l32;->q:I

    .line 24
    .line 25
    iget v3, p0, Ldefpackage/l32;->w:I

    .line 26
    .line 27
    add-int/2addr v2, v3

    .line 28
    iput v2, p0, Ldefpackage/l32;->q:I

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :pswitch_3
    invoke-virtual {p0}, Ldefpackage/l32;->j0()V

    .line 32
    .line 33
    .line 34
    if-nez v1, :cond_3

    .line 35
    .line 36
    iget-object v2, p0, Ldefpackage/l32;->A:[Ljava/lang/String;

    .line 37
    .line 38
    iget v3, p0, Ldefpackage/l32;->z:I

    .line 39
    .line 40
    sub-int/2addr v3, v6

    .line 41
    aput-object v5, v2, v3

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :pswitch_4
    invoke-virtual {p0, v4}, Ldefpackage/l32;->h0(C)V

    .line 45
    .line 46
    .line 47
    if-nez v1, :cond_3

    .line 48
    .line 49
    iget-object v2, p0, Ldefpackage/l32;->A:[Ljava/lang/String;

    .line 50
    .line 51
    iget v3, p0, Ldefpackage/l32;->z:I

    .line 52
    .line 53
    sub-int/2addr v3, v6

    .line 54
    aput-object v5, v2, v3

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :pswitch_5
    invoke-virtual {p0, v3}, Ldefpackage/l32;->h0(C)V

    .line 58
    .line 59
    .line 60
    if-nez v1, :cond_3

    .line 61
    .line 62
    iget-object v2, p0, Ldefpackage/l32;->A:[Ljava/lang/String;

    .line 63
    .line 64
    iget v3, p0, Ldefpackage/l32;->z:I

    .line 65
    .line 66
    sub-int/2addr v3, v6

    .line 67
    aput-object v5, v2, v3

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :pswitch_6
    invoke-virtual {p0}, Ldefpackage/l32;->j0()V

    .line 71
    .line 72
    .line 73
    goto :goto_2

    .line 74
    :pswitch_7
    invoke-virtual {p0, v4}, Ldefpackage/l32;->h0(C)V

    .line 75
    .line 76
    .line 77
    goto :goto_2

    .line 78
    :pswitch_8
    invoke-virtual {p0, v3}, Ldefpackage/l32;->h0(C)V

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :pswitch_9
    iget v2, p0, Ldefpackage/l32;->z:I

    .line 83
    .line 84
    sub-int/2addr v2, v6

    .line 85
    iput v2, p0, Ldefpackage/l32;->z:I

    .line 86
    .line 87
    :goto_0
    add-int/lit8 v1, v1, -0x1

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :pswitch_a
    invoke-virtual {p0, v6}, Ldefpackage/l32;->f0(I)V

    .line 91
    .line 92
    .line 93
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :pswitch_b
    if-nez v1, :cond_2

    .line 97
    .line 98
    iget-object v2, p0, Ldefpackage/l32;->A:[Ljava/lang/String;

    .line 99
    .line 100
    iget v3, p0, Ldefpackage/l32;->z:I

    .line 101
    .line 102
    sub-int/2addr v3, v6

    .line 103
    const/4 v4, 0x0

    .line 104
    aput-object v4, v2, v3

    .line 105
    .line 106
    :cond_2
    iget v2, p0, Ldefpackage/l32;->z:I

    .line 107
    .line 108
    sub-int/2addr v2, v6

    .line 109
    iput v2, p0, Ldefpackage/l32;->z:I

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :pswitch_c
    const/4 v2, 0x3

    .line 113
    invoke-virtual {p0, v2}, Ldefpackage/l32;->f0(I)V

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_3
    :goto_2
    iput v0, p0, Ldefpackage/l32;->u:I

    .line 118
    .line 119
    if-gtz v1, :cond_0

    .line 120
    .line 121
    iget-object v0, p0, Ldefpackage/l32;->B:[I

    .line 122
    .line 123
    iget p0, p0, Ldefpackage/l32;->z:I

    .line 124
    .line 125
    sub-int/2addr p0, v6

    .line 126
    aget v1, v0, p0

    .line 127
    .line 128
    add-int/2addr v1, v6

    .line 129
    aput v1, v0, p0

    .line 130
    .line 131
    return-void

    .line 132
    nop

    .line 133
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final l0(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/gson/stream/MalformedJsonException;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/l32;->M()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    throw v0
.end method

.method public final n()I
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ldefpackage/l32;->y:[I

    .line 4
    .line 5
    iget v2, v0, Ldefpackage/l32;->z:I

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    sub-int/2addr v2, v3

    .line 9
    aget v4, v1, v2

    .line 10
    .line 11
    const/16 v8, 0xa

    .line 12
    .line 13
    const/16 v10, 0x27

    .line 14
    .line 15
    const/4 v11, 0x6

    .line 16
    const/16 v12, 0x5d

    .line 17
    .line 18
    const/16 v13, 0x3b

    .line 19
    .line 20
    const/16 v14, 0x2c

    .line 21
    .line 22
    const/4 v15, 0x3

    .line 23
    const/16 v16, 0x0

    .line 24
    .line 25
    iget-object v6, v0, Ldefpackage/l32;->p:[C

    .line 26
    .line 27
    const/4 v7, 0x4

    .line 28
    const/4 v9, 0x5

    .line 29
    const/16 v20, 0x7

    .line 30
    .line 31
    const/4 v5, 0x2

    .line 32
    if-ne v4, v3, :cond_0

    .line 33
    .line 34
    aput v5, v1, v2

    .line 35
    .line 36
    goto/16 :goto_1

    .line 37
    .line 38
    :cond_0
    if-ne v4, v5, :cond_3

    .line 39
    .line 40
    invoke-virtual {v0, v3}, Ldefpackage/l32;->Z(Z)I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eq v1, v14, :cond_f

    .line 45
    .line 46
    if-eq v1, v13, :cond_2

    .line 47
    .line 48
    if-ne v1, v12, :cond_1

    .line 49
    .line 50
    iput v7, v0, Ldefpackage/l32;->u:I

    .line 51
    .line 52
    return v7

    .line 53
    :cond_1
    const-string v1, "Unterminated array"

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ldefpackage/l32;->l0(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw v16

    .line 59
    :cond_2
    invoke-virtual {v0}, Ldefpackage/l32;->j()V

    .line 60
    .line 61
    .line 62
    goto/16 :goto_1

    .line 63
    .line 64
    :cond_3
    const/16 v5, 0x7d

    .line 65
    .line 66
    if-eq v4, v15, :cond_4

    .line 67
    .line 68
    if-ne v4, v9, :cond_5

    .line 69
    .line 70
    :cond_4
    move/from16 v21, v7

    .line 71
    .line 72
    goto/16 :goto_19

    .line 73
    .line 74
    :cond_5
    if-ne v4, v7, :cond_8

    .line 75
    .line 76
    aput v9, v1, v2

    .line 77
    .line 78
    invoke-virtual {v0, v3}, Ldefpackage/l32;->Z(Z)I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    const/16 v2, 0x3a

    .line 83
    .line 84
    if-eq v1, v2, :cond_f

    .line 85
    .line 86
    const/16 v2, 0x3d

    .line 87
    .line 88
    if-ne v1, v2, :cond_7

    .line 89
    .line 90
    invoke-virtual {v0}, Ldefpackage/l32;->j()V

    .line 91
    .line 92
    .line 93
    iget v1, v0, Ldefpackage/l32;->q:I

    .line 94
    .line 95
    iget v2, v0, Ldefpackage/l32;->r:I

    .line 96
    .line 97
    if-lt v1, v2, :cond_6

    .line 98
    .line 99
    invoke-virtual {v0, v3}, Ldefpackage/l32;->u(I)Z

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-eqz v1, :cond_f

    .line 104
    .line 105
    :cond_6
    iget v1, v0, Ldefpackage/l32;->q:I

    .line 106
    .line 107
    aget-char v2, v6, v1

    .line 108
    .line 109
    const/16 v5, 0x3e

    .line 110
    .line 111
    if-ne v2, v5, :cond_f

    .line 112
    .line 113
    add-int/2addr v1, v3

    .line 114
    iput v1, v0, Ldefpackage/l32;->q:I

    .line 115
    .line 116
    goto/16 :goto_1

    .line 117
    .line 118
    :cond_7
    const-string v1, "Expected \':\'"

    .line 119
    .line 120
    invoke-virtual {v0, v1}, Ldefpackage/l32;->l0(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    throw v16

    .line 124
    :cond_8
    if-ne v4, v11, :cond_c

    .line 125
    .line 126
    iget-boolean v1, v0, Ldefpackage/l32;->o:Z

    .line 127
    .line 128
    if-eqz v1, :cond_b

    .line 129
    .line 130
    invoke-virtual {v0, v3}, Ldefpackage/l32;->Z(Z)I

    .line 131
    .line 132
    .line 133
    iget v1, v0, Ldefpackage/l32;->q:I

    .line 134
    .line 135
    add-int/lit8 v2, v1, -0x1

    .line 136
    .line 137
    iput v2, v0, Ldefpackage/l32;->q:I

    .line 138
    .line 139
    add-int/lit8 v1, v1, 0x4

    .line 140
    .line 141
    iget v2, v0, Ldefpackage/l32;->r:I

    .line 142
    .line 143
    if-le v1, v2, :cond_9

    .line 144
    .line 145
    invoke-virtual {v0, v9}, Ldefpackage/l32;->u(I)Z

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    if-nez v1, :cond_9

    .line 150
    .line 151
    goto :goto_0

    .line 152
    :cond_9
    iget v1, v0, Ldefpackage/l32;->q:I

    .line 153
    .line 154
    aget-char v2, v6, v1

    .line 155
    .line 156
    const/16 v7, 0x29

    .line 157
    .line 158
    if-ne v2, v7, :cond_b

    .line 159
    .line 160
    add-int/lit8 v2, v1, 0x1

    .line 161
    .line 162
    aget-char v2, v6, v2

    .line 163
    .line 164
    if-ne v2, v12, :cond_b

    .line 165
    .line 166
    add-int/lit8 v2, v1, 0x2

    .line 167
    .line 168
    aget-char v2, v6, v2

    .line 169
    .line 170
    if-ne v2, v5, :cond_b

    .line 171
    .line 172
    add-int/lit8 v2, v1, 0x3

    .line 173
    .line 174
    aget-char v2, v6, v2

    .line 175
    .line 176
    if-ne v2, v10, :cond_b

    .line 177
    .line 178
    add-int/lit8 v2, v1, 0x4

    .line 179
    .line 180
    aget-char v2, v6, v2

    .line 181
    .line 182
    if-eq v2, v8, :cond_a

    .line 183
    .line 184
    goto :goto_0

    .line 185
    :cond_a
    add-int/2addr v1, v9

    .line 186
    iput v1, v0, Ldefpackage/l32;->q:I

    .line 187
    .line 188
    :cond_b
    :goto_0
    iget-object v1, v0, Ldefpackage/l32;->y:[I

    .line 189
    .line 190
    iget v2, v0, Ldefpackage/l32;->z:I

    .line 191
    .line 192
    sub-int/2addr v2, v3

    .line 193
    aput v20, v1, v2

    .line 194
    .line 195
    goto :goto_1

    .line 196
    :cond_c
    move/from16 v1, v20

    .line 197
    .line 198
    if-ne v4, v1, :cond_e

    .line 199
    .line 200
    const/4 v1, 0x0

    .line 201
    invoke-virtual {v0, v1}, Ldefpackage/l32;->Z(Z)I

    .line 202
    .line 203
    .line 204
    move-result v2

    .line 205
    const/4 v1, -0x1

    .line 206
    if-ne v2, v1, :cond_d

    .line 207
    .line 208
    const/16 v1, 0x11

    .line 209
    .line 210
    iput v1, v0, Ldefpackage/l32;->u:I

    .line 211
    .line 212
    return v1

    .line 213
    :cond_d
    invoke-virtual {v0}, Ldefpackage/l32;->j()V

    .line 214
    .line 215
    .line 216
    iget v1, v0, Ldefpackage/l32;->q:I

    .line 217
    .line 218
    sub-int/2addr v1, v3

    .line 219
    iput v1, v0, Ldefpackage/l32;->q:I

    .line 220
    .line 221
    goto :goto_1

    .line 222
    :cond_e
    const/16 v1, 0x8

    .line 223
    .line 224
    if-eq v4, v1, :cond_42

    .line 225
    .line 226
    :cond_f
    :goto_1
    invoke-virtual {v0, v3}, Ldefpackage/l32;->Z(Z)I

    .line 227
    .line 228
    .line 229
    move-result v1

    .line 230
    const/16 v2, 0x22

    .line 231
    .line 232
    if-eq v1, v2, :cond_41

    .line 233
    .line 234
    if-eq v1, v10, :cond_40

    .line 235
    .line 236
    if-eq v1, v14, :cond_3c

    .line 237
    .line 238
    if-eq v1, v13, :cond_3c

    .line 239
    .line 240
    const/16 v2, 0x5b

    .line 241
    .line 242
    if-eq v1, v2, :cond_3b

    .line 243
    .line 244
    if-eq v1, v12, :cond_3a

    .line 245
    .line 246
    const/16 v2, 0x7b

    .line 247
    .line 248
    if-eq v1, v2, :cond_39

    .line 249
    .line 250
    iget v1, v0, Ldefpackage/l32;->q:I

    .line 251
    .line 252
    sub-int/2addr v1, v3

    .line 253
    iput v1, v0, Ldefpackage/l32;->q:I

    .line 254
    .line 255
    aget-char v1, v6, v1

    .line 256
    .line 257
    const/16 v2, 0x74

    .line 258
    .line 259
    if-eq v1, v2, :cond_15

    .line 260
    .line 261
    const/16 v2, 0x54

    .line 262
    .line 263
    if-ne v1, v2, :cond_10

    .line 264
    .line 265
    goto :goto_5

    .line 266
    :cond_10
    const/16 v2, 0x66

    .line 267
    .line 268
    if-eq v1, v2, :cond_14

    .line 269
    .line 270
    const/16 v2, 0x46

    .line 271
    .line 272
    if-ne v1, v2, :cond_11

    .line 273
    .line 274
    goto :goto_4

    .line 275
    :cond_11
    const/16 v2, 0x6e

    .line 276
    .line 277
    if-eq v1, v2, :cond_13

    .line 278
    .line 279
    const/16 v2, 0x4e

    .line 280
    .line 281
    if-ne v1, v2, :cond_12

    .line 282
    .line 283
    goto :goto_3

    .line 284
    :cond_12
    :goto_2
    const/4 v1, 0x0

    .line 285
    goto :goto_8

    .line 286
    :cond_13
    :goto_3
    const-string v1, "null"

    .line 287
    .line 288
    const-string v2, "NULL"

    .line 289
    .line 290
    const/4 v4, 0x7

    .line 291
    goto :goto_6

    .line 292
    :cond_14
    :goto_4
    const-string v1, "false"

    .line 293
    .line 294
    const-string v2, "FALSE"

    .line 295
    .line 296
    move v4, v11

    .line 297
    goto :goto_6

    .line 298
    :cond_15
    :goto_5
    const-string v1, "true"

    .line 299
    .line 300
    const-string v2, "TRUE"

    .line 301
    .line 302
    move v4, v9

    .line 303
    :goto_6
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 304
    .line 305
    .line 306
    move-result v5

    .line 307
    move v7, v3

    .line 308
    :goto_7
    iget v10, v0, Ldefpackage/l32;->q:I

    .line 309
    .line 310
    iget v12, v0, Ldefpackage/l32;->r:I

    .line 311
    .line 312
    if-ge v7, v5, :cond_18

    .line 313
    .line 314
    add-int/2addr v10, v7

    .line 315
    if-lt v10, v12, :cond_16

    .line 316
    .line 317
    add-int/lit8 v10, v7, 0x1

    .line 318
    .line 319
    invoke-virtual {v0, v10}, Ldefpackage/l32;->u(I)Z

    .line 320
    .line 321
    .line 322
    move-result v10

    .line 323
    if-nez v10, :cond_16

    .line 324
    .line 325
    goto :goto_2

    .line 326
    :cond_16
    iget v10, v0, Ldefpackage/l32;->q:I

    .line 327
    .line 328
    add-int/2addr v10, v7

    .line 329
    aget-char v10, v6, v10

    .line 330
    .line 331
    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    .line 332
    .line 333
    .line 334
    move-result v12

    .line 335
    if-eq v10, v12, :cond_17

    .line 336
    .line 337
    invoke-virtual {v2, v7}, Ljava/lang/String;->charAt(I)C

    .line 338
    .line 339
    .line 340
    move-result v12

    .line 341
    if-eq v10, v12, :cond_17

    .line 342
    .line 343
    goto :goto_2

    .line 344
    :cond_17
    add-int/lit8 v7, v7, 0x1

    .line 345
    .line 346
    goto :goto_7

    .line 347
    :cond_18
    add-int/2addr v10, v5

    .line 348
    if-lt v10, v12, :cond_19

    .line 349
    .line 350
    add-int/lit8 v1, v5, 0x1

    .line 351
    .line 352
    invoke-virtual {v0, v1}, Ldefpackage/l32;->u(I)Z

    .line 353
    .line 354
    .line 355
    move-result v1

    .line 356
    if-eqz v1, :cond_1a

    .line 357
    .line 358
    :cond_19
    iget v1, v0, Ldefpackage/l32;->q:I

    .line 359
    .line 360
    add-int/2addr v1, v5

    .line 361
    aget-char v1, v6, v1

    .line 362
    .line 363
    invoke-virtual {v0, v1}, Ldefpackage/l32;->K(C)Z

    .line 364
    .line 365
    .line 366
    move-result v1

    .line 367
    if-eqz v1, :cond_1a

    .line 368
    .line 369
    goto :goto_2

    .line 370
    :cond_1a
    iget v1, v0, Ldefpackage/l32;->q:I

    .line 371
    .line 372
    add-int/2addr v1, v5

    .line 373
    iput v1, v0, Ldefpackage/l32;->q:I

    .line 374
    .line 375
    iput v4, v0, Ldefpackage/l32;->u:I

    .line 376
    .line 377
    move v1, v4

    .line 378
    :goto_8
    if-eqz v1, :cond_1b

    .line 379
    .line 380
    return v1

    .line 381
    :cond_1b
    iget v1, v0, Ldefpackage/l32;->q:I

    .line 382
    .line 383
    iget v2, v0, Ldefpackage/l32;->r:I

    .line 384
    .line 385
    move v10, v2

    .line 386
    move v13, v3

    .line 387
    const/4 v2, 0x0

    .line 388
    const-wide/16 v4, 0x0

    .line 389
    .line 390
    const/4 v7, 0x0

    .line 391
    const/4 v12, 0x0

    .line 392
    const-wide/16 v17, 0x0

    .line 393
    .line 394
    :goto_9
    add-int v14, v1, v2

    .line 395
    .line 396
    if-ne v14, v10, :cond_1f

    .line 397
    .line 398
    array-length v1, v6

    .line 399
    if-ne v2, v1, :cond_1d

    .line 400
    .line 401
    :cond_1c
    :goto_a
    const/4 v9, 0x0

    .line 402
    goto/16 :goto_17

    .line 403
    .line 404
    :cond_1d
    add-int/lit8 v1, v2, 0x1

    .line 405
    .line 406
    invoke-virtual {v0, v1}, Ldefpackage/l32;->u(I)Z

    .line 407
    .line 408
    .line 409
    move-result v1

    .line 410
    if-nez v1, :cond_1e

    .line 411
    .line 412
    move-wide/from16 v24, v4

    .line 413
    .line 414
    :goto_b
    const/4 v8, 0x2

    .line 415
    goto/16 :goto_11

    .line 416
    .line 417
    :cond_1e
    iget v1, v0, Ldefpackage/l32;->q:I

    .line 418
    .line 419
    iget v10, v0, Ldefpackage/l32;->r:I

    .line 420
    .line 421
    :cond_1f
    add-int v14, v1, v2

    .line 422
    .line 423
    aget-char v14, v6, v14

    .line 424
    .line 425
    const/16 v8, 0x2b

    .line 426
    .line 427
    if-eq v14, v8, :cond_36

    .line 428
    .line 429
    const/16 v8, 0x45

    .line 430
    .line 431
    if-eq v14, v8, :cond_34

    .line 432
    .line 433
    const/16 v8, 0x65

    .line 434
    .line 435
    if-eq v14, v8, :cond_34

    .line 436
    .line 437
    const/16 v8, 0x2d

    .line 438
    .line 439
    if-eq v14, v8, :cond_32

    .line 440
    .line 441
    const/16 v8, 0x2e

    .line 442
    .line 443
    if-eq v14, v8, :cond_31

    .line 444
    .line 445
    const/16 v8, 0x30

    .line 446
    .line 447
    if-lt v14, v8, :cond_20

    .line 448
    .line 449
    const/16 v8, 0x39

    .line 450
    .line 451
    if-le v14, v8, :cond_21

    .line 452
    .line 453
    :cond_20
    move-wide/from16 v24, v4

    .line 454
    .line 455
    goto :goto_10

    .line 456
    :cond_21
    if-eq v12, v3, :cond_2a

    .line 457
    .line 458
    if-nez v12, :cond_22

    .line 459
    .line 460
    goto :goto_f

    .line 461
    :cond_22
    const/4 v8, 0x2

    .line 462
    if-ne v12, v8, :cond_26

    .line 463
    .line 464
    cmp-long v8, v4, v17

    .line 465
    .line 466
    if-nez v8, :cond_23

    .line 467
    .line 468
    goto :goto_a

    .line 469
    :cond_23
    const-wide/16 v22, 0xa

    .line 470
    .line 471
    mul-long v22, v22, v4

    .line 472
    .line 473
    add-int/lit8 v14, v14, -0x30

    .line 474
    .line 475
    move-wide/from16 v24, v4

    .line 476
    .line 477
    int-to-long v3, v14

    .line 478
    sub-long v22, v22, v3

    .line 479
    .line 480
    const-wide v3, -0xcccccccccccccccL

    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    cmp-long v3, v24, v3

    .line 486
    .line 487
    if-gtz v3, :cond_25

    .line 488
    .line 489
    if-nez v3, :cond_24

    .line 490
    .line 491
    cmp-long v3, v22, v24

    .line 492
    .line 493
    if-gez v3, :cond_24

    .line 494
    .line 495
    goto :goto_c

    .line 496
    :cond_24
    const/4 v3, 0x0

    .line 497
    goto :goto_d

    .line 498
    :cond_25
    :goto_c
    const/4 v3, 0x1

    .line 499
    :goto_d
    and-int/2addr v13, v3

    .line 500
    move-wide/from16 v4, v22

    .line 501
    .line 502
    goto/16 :goto_16

    .line 503
    .line 504
    :cond_26
    move-wide/from16 v24, v4

    .line 505
    .line 506
    if-ne v12, v15, :cond_27

    .line 507
    .line 508
    move-wide/from16 v4, v24

    .line 509
    .line 510
    const/4 v12, 0x4

    .line 511
    goto/16 :goto_16

    .line 512
    .line 513
    :cond_27
    if-eq v12, v9, :cond_29

    .line 514
    .line 515
    if-ne v12, v11, :cond_28

    .line 516
    .line 517
    goto :goto_e

    .line 518
    :cond_28
    move-wide/from16 v4, v24

    .line 519
    .line 520
    goto/16 :goto_16

    .line 521
    .line 522
    :cond_29
    :goto_e
    move-wide/from16 v4, v24

    .line 523
    .line 524
    const/4 v12, 0x7

    .line 525
    goto/16 :goto_16

    .line 526
    .line 527
    :cond_2a
    :goto_f
    add-int/lit8 v14, v14, -0x30

    .line 528
    .line 529
    neg-int v3, v14

    .line 530
    int-to-long v4, v3

    .line 531
    const/4 v12, 0x2

    .line 532
    goto/16 :goto_16

    .line 533
    .line 534
    :goto_10
    invoke-virtual {v0, v14}, Ldefpackage/l32;->K(C)Z

    .line 535
    .line 536
    .line 537
    move-result v1

    .line 538
    if-nez v1, :cond_1c

    .line 539
    .line 540
    goto :goto_b

    .line 541
    :goto_11
    if-ne v12, v8, :cond_2f

    .line 542
    .line 543
    if-eqz v13, :cond_2b

    .line 544
    .line 545
    const-wide/high16 v3, -0x8000000000000000L

    .line 546
    .line 547
    cmp-long v1, v24, v3

    .line 548
    .line 549
    if-nez v1, :cond_2c

    .line 550
    .line 551
    if-eqz v7, :cond_2b

    .line 552
    .line 553
    goto :goto_12

    .line 554
    :cond_2b
    const/4 v8, 0x2

    .line 555
    goto :goto_14

    .line 556
    :cond_2c
    :goto_12
    cmp-long v1, v24, v17

    .line 557
    .line 558
    if-nez v1, :cond_2d

    .line 559
    .line 560
    if-nez v7, :cond_2b

    .line 561
    .line 562
    :cond_2d
    move-wide/from16 v4, v24

    .line 563
    .line 564
    if-eqz v7, :cond_2e

    .line 565
    .line 566
    goto :goto_13

    .line 567
    :cond_2e
    neg-long v4, v4

    .line 568
    :goto_13
    iput-wide v4, v0, Ldefpackage/l32;->v:J

    .line 569
    .line 570
    iget v1, v0, Ldefpackage/l32;->q:I

    .line 571
    .line 572
    add-int/2addr v1, v2

    .line 573
    iput v1, v0, Ldefpackage/l32;->q:I

    .line 574
    .line 575
    const/16 v9, 0xf

    .line 576
    .line 577
    iput v9, v0, Ldefpackage/l32;->u:I

    .line 578
    .line 579
    goto :goto_17

    .line 580
    :cond_2f
    :goto_14
    if-eq v12, v8, :cond_30

    .line 581
    .line 582
    const/4 v1, 0x4

    .line 583
    if-eq v12, v1, :cond_30

    .line 584
    .line 585
    const/4 v1, 0x7

    .line 586
    if-ne v12, v1, :cond_1c

    .line 587
    .line 588
    :cond_30
    iput v2, v0, Ldefpackage/l32;->w:I

    .line 589
    .line 590
    const/16 v9, 0x10

    .line 591
    .line 592
    iput v9, v0, Ldefpackage/l32;->u:I

    .line 593
    .line 594
    goto :goto_17

    .line 595
    :cond_31
    const/4 v3, 0x2

    .line 596
    if-ne v12, v3, :cond_1c

    .line 597
    .line 598
    move v12, v15

    .line 599
    goto :goto_16

    .line 600
    :cond_32
    const/4 v3, 0x2

    .line 601
    if-nez v12, :cond_33

    .line 602
    .line 603
    const/4 v7, 0x1

    .line 604
    const/4 v12, 0x1

    .line 605
    goto :goto_16

    .line 606
    :cond_33
    if-ne v12, v9, :cond_1c

    .line 607
    .line 608
    :goto_15
    move v12, v11

    .line 609
    goto :goto_16

    .line 610
    :cond_34
    const/4 v3, 0x2

    .line 611
    if-eq v12, v3, :cond_35

    .line 612
    .line 613
    const/4 v3, 0x4

    .line 614
    if-ne v12, v3, :cond_1c

    .line 615
    .line 616
    :cond_35
    move v12, v9

    .line 617
    goto :goto_16

    .line 618
    :cond_36
    if-ne v12, v9, :cond_1c

    .line 619
    .line 620
    goto :goto_15

    .line 621
    :goto_16
    add-int/lit8 v2, v2, 0x1

    .line 622
    .line 623
    const/4 v3, 0x1

    .line 624
    const/16 v8, 0xa

    .line 625
    .line 626
    goto/16 :goto_9

    .line 627
    .line 628
    :goto_17
    if-eqz v9, :cond_37

    .line 629
    .line 630
    return v9

    .line 631
    :cond_37
    iget v1, v0, Ldefpackage/l32;->q:I

    .line 632
    .line 633
    aget-char v1, v6, v1

    .line 634
    .line 635
    invoke-virtual {v0, v1}, Ldefpackage/l32;->K(C)Z

    .line 636
    .line 637
    .line 638
    move-result v1

    .line 639
    if-eqz v1, :cond_38

    .line 640
    .line 641
    invoke-virtual {v0}, Ldefpackage/l32;->j()V

    .line 642
    .line 643
    .line 644
    const/16 v1, 0xa

    .line 645
    .line 646
    iput v1, v0, Ldefpackage/l32;->u:I

    .line 647
    .line 648
    return v1

    .line 649
    :cond_38
    const-string v1, "Expected value"

    .line 650
    .line 651
    invoke-virtual {v0, v1}, Ldefpackage/l32;->l0(Ljava/lang/String;)V

    .line 652
    .line 653
    .line 654
    throw v16

    .line 655
    :cond_39
    move v8, v3

    .line 656
    iput v8, v0, Ldefpackage/l32;->u:I

    .line 657
    .line 658
    return v8

    .line 659
    :cond_3a
    move v8, v3

    .line 660
    if-ne v4, v8, :cond_3d

    .line 661
    .line 662
    const/4 v1, 0x4

    .line 663
    iput v1, v0, Ldefpackage/l32;->u:I

    .line 664
    .line 665
    return v1

    .line 666
    :cond_3b
    iput v15, v0, Ldefpackage/l32;->u:I

    .line 667
    .line 668
    return v15

    .line 669
    :cond_3c
    move v8, v3

    .line 670
    :cond_3d
    if-eq v4, v8, :cond_3f

    .line 671
    .line 672
    const/4 v3, 0x2

    .line 673
    if-ne v4, v3, :cond_3e

    .line 674
    .line 675
    goto :goto_18

    .line 676
    :cond_3e
    const-string v1, "Unexpected value"

    .line 677
    .line 678
    invoke-virtual {v0, v1}, Ldefpackage/l32;->l0(Ljava/lang/String;)V

    .line 679
    .line 680
    .line 681
    throw v16

    .line 682
    :cond_3f
    :goto_18
    invoke-virtual {v0}, Ldefpackage/l32;->j()V

    .line 683
    .line 684
    .line 685
    iget v1, v0, Ldefpackage/l32;->q:I

    .line 686
    .line 687
    sub-int/2addr v1, v8

    .line 688
    iput v1, v0, Ldefpackage/l32;->q:I

    .line 689
    .line 690
    const/4 v1, 0x7

    .line 691
    iput v1, v0, Ldefpackage/l32;->u:I

    .line 692
    .line 693
    return v1

    .line 694
    :cond_40
    invoke-virtual {v0}, Ldefpackage/l32;->j()V

    .line 695
    .line 696
    .line 697
    const/16 v1, 0x8

    .line 698
    .line 699
    iput v1, v0, Ldefpackage/l32;->u:I

    .line 700
    .line 701
    return v1

    .line 702
    :cond_41
    const/16 v1, 0x9

    .line 703
    .line 704
    iput v1, v0, Ldefpackage/l32;->u:I

    .line 705
    .line 706
    return v1

    .line 707
    :cond_42
    const-string v0, "JsonReader is closed"

    .line 708
    .line 709
    invoke-static {v0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 710
    .line 711
    .line 712
    const/16 v19, 0x0

    .line 713
    .line 714
    return v19

    .line 715
    :goto_19
    aput v21, v1, v2

    .line 716
    .line 717
    if-ne v4, v9, :cond_45

    .line 718
    .line 719
    const/4 v8, 0x1

    .line 720
    invoke-virtual {v0, v8}, Ldefpackage/l32;->Z(Z)I

    .line 721
    .line 722
    .line 723
    move-result v1

    .line 724
    if-eq v1, v14, :cond_45

    .line 725
    .line 726
    if-eq v1, v13, :cond_44

    .line 727
    .line 728
    if-ne v1, v5, :cond_43

    .line 729
    .line 730
    const/4 v8, 0x2

    .line 731
    iput v8, v0, Ldefpackage/l32;->u:I

    .line 732
    .line 733
    return v8

    .line 734
    :cond_43
    const-string v1, "Unterminated object"

    .line 735
    .line 736
    invoke-virtual {v0, v1}, Ldefpackage/l32;->l0(Ljava/lang/String;)V

    .line 737
    .line 738
    .line 739
    throw v16

    .line 740
    :cond_44
    invoke-virtual {v0}, Ldefpackage/l32;->j()V

    .line 741
    .line 742
    .line 743
    :cond_45
    const/4 v8, 0x1

    .line 744
    invoke-virtual {v0, v8}, Ldefpackage/l32;->Z(Z)I

    .line 745
    .line 746
    .line 747
    move-result v1

    .line 748
    const/16 v2, 0x22

    .line 749
    .line 750
    if-eq v1, v2, :cond_4a

    .line 751
    .line 752
    if-eq v1, v10, :cond_49

    .line 753
    .line 754
    const-string v2, "Expected name"

    .line 755
    .line 756
    if-eq v1, v5, :cond_47

    .line 757
    .line 758
    invoke-virtual {v0}, Ldefpackage/l32;->j()V

    .line 759
    .line 760
    .line 761
    iget v3, v0, Ldefpackage/l32;->q:I

    .line 762
    .line 763
    sub-int/2addr v3, v8

    .line 764
    iput v3, v0, Ldefpackage/l32;->q:I

    .line 765
    .line 766
    int-to-char v1, v1

    .line 767
    invoke-virtual {v0, v1}, Ldefpackage/l32;->K(C)Z

    .line 768
    .line 769
    .line 770
    move-result v1

    .line 771
    if-eqz v1, :cond_46

    .line 772
    .line 773
    const/16 v1, 0xe

    .line 774
    .line 775
    iput v1, v0, Ldefpackage/l32;->u:I

    .line 776
    .line 777
    return v1

    .line 778
    :cond_46
    invoke-virtual {v0, v2}, Ldefpackage/l32;->l0(Ljava/lang/String;)V

    .line 779
    .line 780
    .line 781
    throw v16

    .line 782
    :cond_47
    if-eq v4, v9, :cond_48

    .line 783
    .line 784
    const/4 v8, 0x2

    .line 785
    iput v8, v0, Ldefpackage/l32;->u:I

    .line 786
    .line 787
    return v8

    .line 788
    :cond_48
    invoke-virtual {v0, v2}, Ldefpackage/l32;->l0(Ljava/lang/String;)V

    .line 789
    .line 790
    .line 791
    throw v16

    .line 792
    :cond_49
    invoke-virtual {v0}, Ldefpackage/l32;->j()V

    .line 793
    .line 794
    .line 795
    const/16 v1, 0xc

    .line 796
    .line 797
    iput v1, v0, Ldefpackage/l32;->u:I

    .line 798
    .line 799
    return v1

    .line 800
    :cond_4a
    const/16 v1, 0xd

    .line 801
    .line 802
    iput v1, v0, Ldefpackage/l32;->u:I

    .line 803
    .line 804
    return v1
.end method

.method public q()V
    .locals 3

    .line 1
    iget v0, p0, Ldefpackage/l32;->u:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/l32;->n()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    :cond_0
    const/4 v1, 0x4

    .line 10
    if-ne v0, v1, :cond_1

    .line 11
    .line 12
    iget v0, p0, Ldefpackage/l32;->z:I

    .line 13
    .line 14
    add-int/lit8 v1, v0, -0x1

    .line 15
    .line 16
    iput v1, p0, Ldefpackage/l32;->z:I

    .line 17
    .line 18
    iget-object v1, p0, Ldefpackage/l32;->B:[I

    .line 19
    .line 20
    add-int/lit8 v0, v0, -0x2

    .line 21
    .line 22
    aget v2, v1, v0

    .line 23
    .line 24
    add-int/lit8 v2, v2, 0x1

    .line 25
    .line 26
    aput v2, v1, v0

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    iput v0, p0, Ldefpackage/l32;->u:I

    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    invoke-virtual {p0}, Ldefpackage/l32;->e0()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    invoke-static {v0}, Ldefpackage/b11;->x(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {p0}, Ldefpackage/l32;->M()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    const-string v1, "Expected END_ARRAY but was "

    .line 45
    .line 46
    invoke-static {v0, p0, v1}, Ldefpackage/er1;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public s()V
    .locals 5

    .line 1
    iget v0, p0, Ldefpackage/l32;->u:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/l32;->n()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    :cond_0
    const/4 v1, 0x2

    .line 10
    if-ne v0, v1, :cond_1

    .line 11
    .line 12
    iget v0, p0, Ldefpackage/l32;->z:I

    .line 13
    .line 14
    add-int/lit8 v2, v0, -0x1

    .line 15
    .line 16
    iput v2, p0, Ldefpackage/l32;->z:I

    .line 17
    .line 18
    iget-object v3, p0, Ldefpackage/l32;->A:[Ljava/lang/String;

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    aput-object v4, v3, v2

    .line 22
    .line 23
    iget-object v2, p0, Ldefpackage/l32;->B:[I

    .line 24
    .line 25
    sub-int/2addr v0, v1

    .line 26
    aget v1, v2, v0

    .line 27
    .line 28
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    aput v1, v2, v0

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    iput v0, p0, Ldefpackage/l32;->u:I

    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    invoke-virtual {p0}, Ldefpackage/l32;->e0()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-static {v0}, Ldefpackage/b11;->x(I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {p0}, Ldefpackage/l32;->M()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    const-string v1, "Expected END_OBJECT but was "

    .line 49
    .line 50
    invoke-static {v0, p0, v1}, Ldefpackage/er1;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Ldefpackage/l32;->M()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final u(I)Z
    .locals 7

    .line 1
    iget v0, p0, Ldefpackage/l32;->t:I

    .line 2
    .line 3
    iget v1, p0, Ldefpackage/l32;->q:I

    .line 4
    .line 5
    sub-int/2addr v0, v1

    .line 6
    iput v0, p0, Ldefpackage/l32;->t:I

    .line 7
    .line 8
    iget v0, p0, Ldefpackage/l32;->r:I

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    iget-object v3, p0, Ldefpackage/l32;->p:[C

    .line 12
    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    sub-int/2addr v0, v1

    .line 16
    iput v0, p0, Ldefpackage/l32;->r:I

    .line 17
    .line 18
    invoke-static {v3, v1, v3, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iput v2, p0, Ldefpackage/l32;->r:I

    .line 23
    .line 24
    :goto_0
    iput v2, p0, Ldefpackage/l32;->q:I

    .line 25
    .line 26
    :cond_1
    iget v0, p0, Ldefpackage/l32;->r:I

    .line 27
    .line 28
    array-length v1, v3

    .line 29
    sub-int/2addr v1, v0

    .line 30
    iget-object v4, p0, Ldefpackage/l32;->n:Ljava/io/Reader;

    .line 31
    .line 32
    invoke-virtual {v4, v3, v0, v1}, Ljava/io/Reader;->read([CII)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    const/4 v1, -0x1

    .line 37
    if-eq v0, v1, :cond_3

    .line 38
    .line 39
    iget v1, p0, Ldefpackage/l32;->r:I

    .line 40
    .line 41
    add-int/2addr v1, v0

    .line 42
    iput v1, p0, Ldefpackage/l32;->r:I

    .line 43
    .line 44
    iget v0, p0, Ldefpackage/l32;->s:I

    .line 45
    .line 46
    const/4 v4, 0x1

    .line 47
    if-nez v0, :cond_2

    .line 48
    .line 49
    iget v0, p0, Ldefpackage/l32;->t:I

    .line 50
    .line 51
    if-nez v0, :cond_2

    .line 52
    .line 53
    if-lez v1, :cond_2

    .line 54
    .line 55
    aget-char v5, v3, v2

    .line 56
    .line 57
    const v6, 0xfeff

    .line 58
    .line 59
    .line 60
    if-ne v5, v6, :cond_2

    .line 61
    .line 62
    iget v5, p0, Ldefpackage/l32;->q:I

    .line 63
    .line 64
    add-int/2addr v5, v4

    .line 65
    iput v5, p0, Ldefpackage/l32;->q:I

    .line 66
    .line 67
    add-int/lit8 v0, v0, 0x1

    .line 68
    .line 69
    iput v0, p0, Ldefpackage/l32;->t:I

    .line 70
    .line 71
    add-int/lit8 p1, p1, 0x1

    .line 72
    .line 73
    :cond_2
    if-lt v1, p1, :cond_1

    .line 74
    .line 75
    return v4

    .line 76
    :cond_3
    return v2
.end method

.method public v()Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Ldefpackage/l32;->F(Z)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method
