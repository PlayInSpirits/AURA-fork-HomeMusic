.class public final Ldefpackage/wz2;
.super Ldefpackage/tz3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final e:Ldefpackage/hu2;

.field public static final f:Ldefpackage/hu2;

.field public static final g:[B

.field public static final h:[B

.field public static final i:[B


# instance fields
.field public final a:Ldefpackage/yw;

.field public final b:Ljava/util/List;

.field public final c:Ldefpackage/hu2;

.field public d:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "multipart/mixed"

    .line 2
    .line 3
    invoke-static {v0}, Ldefpackage/ve5;->a(Ljava/lang/String;)Ldefpackage/hu2;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Ldefpackage/wz2;->e:Ldefpackage/hu2;

    .line 8
    .line 9
    const-string v0, "multipart/alternative"

    .line 10
    .line 11
    invoke-static {v0}, Ldefpackage/ve5;->a(Ljava/lang/String;)Ldefpackage/hu2;

    .line 12
    .line 13
    .line 14
    const-string v0, "multipart/digest"

    .line 15
    .line 16
    invoke-static {v0}, Ldefpackage/ve5;->a(Ljava/lang/String;)Ldefpackage/hu2;

    .line 17
    .line 18
    .line 19
    const-string v0, "multipart/parallel"

    .line 20
    .line 21
    invoke-static {v0}, Ldefpackage/ve5;->a(Ljava/lang/String;)Ldefpackage/hu2;

    .line 22
    .line 23
    .line 24
    const-string v0, "multipart/form-data"

    .line 25
    .line 26
    invoke-static {v0}, Ldefpackage/ve5;->a(Ljava/lang/String;)Ldefpackage/hu2;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, Ldefpackage/wz2;->f:Ldefpackage/hu2;

    .line 31
    .line 32
    const/4 v0, 0x2

    .line 33
    new-array v1, v0, [B

    .line 34
    .line 35
    fill-array-data v1, :array_0

    .line 36
    .line 37
    .line 38
    sput-object v1, Ldefpackage/wz2;->g:[B

    .line 39
    .line 40
    new-array v1, v0, [B

    .line 41
    .line 42
    fill-array-data v1, :array_1

    .line 43
    .line 44
    .line 45
    sput-object v1, Ldefpackage/wz2;->h:[B

    .line 46
    .line 47
    new-array v0, v0, [B

    .line 48
    .line 49
    fill-array-data v0, :array_2

    .line 50
    .line 51
    .line 52
    sput-object v0, Ldefpackage/wz2;->i:[B

    .line 53
    .line 54
    return-void

    .line 55
    :array_0
    .array-data 1
        0x3at
        0x20t
    .end array-data

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    nop

    .line 61
    :array_1
    .array-data 1
        0xdt
        0xat
    .end array-data

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    nop

    .line 67
    :array_2
    .array-data 1
        0x2dt
        0x2dt
    .end array-data
.end method

.method public constructor <init>(Ldefpackage/yw;Ldefpackage/hu2;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Ldefpackage/wz2;->a:Ldefpackage/yw;

    .line 11
    .line 12
    iput-object p3, p0, Ldefpackage/wz2;->b:Ljava/util/List;

    .line 13
    .line 14
    new-instance p3, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string p2, "; boundary="

    .line 23
    .line 24
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Ldefpackage/yw;->q()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {p1}, Ldefpackage/ve5;->a(Ljava/lang/String;)Ldefpackage/hu2;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iput-object p1, p0, Ldefpackage/wz2;->c:Ldefpackage/hu2;

    .line 43
    .line 44
    const-wide/16 p1, -0x1

    .line 45
    .line 46
    iput-wide p1, p0, Ldefpackage/wz2;->d:J

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final a(Ldefpackage/ew;Z)J
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    new-instance v1, Ldefpackage/tv;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    move-object v2, v1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    move-object v2, v1

    .line 14
    move-object/from16 v1, p1

    .line 15
    .line 16
    :goto_0
    iget-object v3, v0, Ldefpackage/wz2;->b:Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    const/4 v5, 0x0

    .line 23
    const-wide/16 v6, 0x0

    .line 24
    .line 25
    move v8, v5

    .line 26
    :goto_1
    iget-object v9, v0, Ldefpackage/wz2;->a:Ldefpackage/yw;

    .line 27
    .line 28
    sget-object v10, Ldefpackage/wz2;->i:[B

    .line 29
    .line 30
    sget-object v11, Ldefpackage/wz2;->h:[B

    .line 31
    .line 32
    if-ge v8, v4, :cond_5

    .line 33
    .line 34
    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v12

    .line 38
    check-cast v12, Ldefpackage/vz2;

    .line 39
    .line 40
    iget-object v13, v12, Ldefpackage/vz2;->a:Ldefpackage/tl1;

    .line 41
    .line 42
    iget-object v12, v12, Ldefpackage/vz2;->b:Ldefpackage/tz3;

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-interface {v1, v10}, Ldefpackage/ew;->write([B)Ldefpackage/ew;

    .line 48
    .line 49
    .line 50
    invoke-interface {v1, v9}, Ldefpackage/ew;->A(Ldefpackage/yw;)Ldefpackage/ew;

    .line 51
    .line 52
    .line 53
    invoke-interface {v1, v11}, Ldefpackage/ew;->write([B)Ldefpackage/ew;

    .line 54
    .line 55
    .line 56
    if-eqz v13, :cond_1

    .line 57
    .line 58
    invoke-virtual {v13}, Ldefpackage/tl1;->size()I

    .line 59
    .line 60
    .line 61
    move-result v9

    .line 62
    move v10, v5

    .line 63
    :goto_2
    if-ge v10, v9, :cond_1

    .line 64
    .line 65
    invoke-virtual {v13, v10}, Ldefpackage/tl1;->b(I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v14

    .line 69
    invoke-interface {v1, v14}, Ldefpackage/ew;->y(Ljava/lang/String;)Ldefpackage/ew;

    .line 70
    .line 71
    .line 72
    move-result-object v14

    .line 73
    sget-object v15, Ldefpackage/wz2;->g:[B

    .line 74
    .line 75
    invoke-interface {v14, v15}, Ldefpackage/ew;->write([B)Ldefpackage/ew;

    .line 76
    .line 77
    .line 78
    move-result-object v14

    .line 79
    invoke-virtual {v13, v10}, Ldefpackage/tl1;->e(I)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v15

    .line 83
    invoke-interface {v14, v15}, Ldefpackage/ew;->y(Ljava/lang/String;)Ldefpackage/ew;

    .line 84
    .line 85
    .line 86
    move-result-object v14

    .line 87
    invoke-interface {v14, v11}, Ldefpackage/ew;->write([B)Ldefpackage/ew;

    .line 88
    .line 89
    .line 90
    add-int/lit8 v10, v10, 0x1

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_1
    invoke-virtual {v12}, Ldefpackage/tz3;->contentType()Ldefpackage/hu2;

    .line 94
    .line 95
    .line 96
    move-result-object v9

    .line 97
    if-eqz v9, :cond_2

    .line 98
    .line 99
    const-string v10, "Content-Type: "

    .line 100
    .line 101
    invoke-interface {v1, v10}, Ldefpackage/ew;->y(Ljava/lang/String;)Ldefpackage/ew;

    .line 102
    .line 103
    .line 104
    move-result-object v10

    .line 105
    iget-object v9, v9, Ldefpackage/hu2;->a:Ljava/lang/String;

    .line 106
    .line 107
    invoke-interface {v10, v9}, Ldefpackage/ew;->y(Ljava/lang/String;)Ldefpackage/ew;

    .line 108
    .line 109
    .line 110
    move-result-object v9

    .line 111
    invoke-interface {v9, v11}, Ldefpackage/ew;->write([B)Ldefpackage/ew;

    .line 112
    .line 113
    .line 114
    :cond_2
    invoke-virtual {v12}, Ldefpackage/tz3;->contentLength()J

    .line 115
    .line 116
    .line 117
    move-result-wide v9

    .line 118
    const-wide/16 v13, -0x1

    .line 119
    .line 120
    cmp-long v15, v9, v13

    .line 121
    .line 122
    if-nez v15, :cond_3

    .line 123
    .line 124
    if-eqz p2, :cond_3

    .line 125
    .line 126
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2}, Ldefpackage/tv;->b()V

    .line 130
    .line 131
    .line 132
    return-wide v13

    .line 133
    :cond_3
    invoke-interface {v1, v11}, Ldefpackage/ew;->write([B)Ldefpackage/ew;

    .line 134
    .line 135
    .line 136
    if-eqz p2, :cond_4

    .line 137
    .line 138
    add-long/2addr v6, v9

    .line 139
    goto :goto_3

    .line 140
    :cond_4
    invoke-virtual {v12, v1}, Ldefpackage/tz3;->writeTo(Ldefpackage/ew;)V

    .line 141
    .line 142
    .line 143
    :goto_3
    invoke-interface {v1, v11}, Ldefpackage/ew;->write([B)Ldefpackage/ew;

    .line 144
    .line 145
    .line 146
    add-int/lit8 v8, v8, 0x1

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    invoke-interface {v1, v10}, Ldefpackage/ew;->write([B)Ldefpackage/ew;

    .line 153
    .line 154
    .line 155
    invoke-interface {v1, v9}, Ldefpackage/ew;->A(Ldefpackage/yw;)Ldefpackage/ew;

    .line 156
    .line 157
    .line 158
    invoke-interface {v1, v10}, Ldefpackage/ew;->write([B)Ldefpackage/ew;

    .line 159
    .line 160
    .line 161
    invoke-interface {v1, v11}, Ldefpackage/ew;->write([B)Ldefpackage/ew;

    .line 162
    .line 163
    .line 164
    if-eqz p2, :cond_6

    .line 165
    .line 166
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    iget-wide v0, v2, Ldefpackage/tv;->o:J

    .line 170
    .line 171
    add-long/2addr v6, v0

    .line 172
    invoke-virtual {v2}, Ldefpackage/tv;->b()V

    .line 173
    .line 174
    .line 175
    :cond_6
    return-wide v6
.end method

.method public final contentLength()J
    .locals 4

    .line 1
    iget-wide v0, p0, Ldefpackage/wz2;->d:J

    .line 2
    .line 3
    const-wide/16 v2, -0x1

    .line 4
    .line 5
    cmp-long v2, v0, v2

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-virtual {p0, v0, v1}, Ldefpackage/wz2;->a(Ldefpackage/ew;Z)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    iput-wide v0, p0, Ldefpackage/wz2;->d:J

    .line 16
    .line 17
    :cond_0
    return-wide v0
.end method

.method public final contentType()Ldefpackage/hu2;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/wz2;->c:Ldefpackage/hu2;

    .line 2
    .line 3
    return-object p0
.end method

.method public final isOneShot()Z
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/wz2;->b:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Ldefpackage/vz2;

    .line 25
    .line 26
    iget-object v0, v0, Ldefpackage/vz2;->b:Ldefpackage/tz3;

    .line 27
    .line 28
    invoke-virtual {v0}, Ldefpackage/tz3;->isOneShot()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    const/4 p0, 0x1

    .line 35
    return p0

    .line 36
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 37
    return p0
.end method

.method public final writeTo(Ldefpackage/ew;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, p1, v0}, Ldefpackage/wz2;->a(Ldefpackage/ew;Z)J

    .line 6
    .line 7
    .line 8
    return-void
.end method
