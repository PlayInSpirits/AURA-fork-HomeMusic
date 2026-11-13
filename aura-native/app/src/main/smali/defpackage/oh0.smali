.class public final Ldefpackage/oh0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final b:Ldefpackage/oh0;


# instance fields
.field public final a:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ldefpackage/oh0;

    .line 7
    .line 8
    invoke-direct {v1, v0}, Ldefpackage/oh0;-><init>(Ljava/util/LinkedHashMap;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v1}, Ldefpackage/bu;->E(Ldefpackage/oh0;)[B

    .line 12
    .line 13
    .line 14
    sput-object v1, Ldefpackage/oh0;->b:Ldefpackage/oh0;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(Ljava/util/LinkedHashMap;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Ldefpackage/oh0;->a:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>(Ldefpackage/oh0;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/util/HashMap;

    .line 8
    .line 9
    iget-object p1, p1, Ldefpackage/oh0;->a:Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Ldefpackage/oh0;->a:Ljava/util/HashMap;

    .line 15
    .line 16
    return-void
.end method

.method public static final a([B)Ldefpackage/oh0;
    .locals 6

    .line 1
    const-string v0, "Error in Data#fromByteArray: "

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    array-length v1, p0

    .line 7
    const/16 v2, 0x2800

    .line 8
    .line 9
    if-gt v1, v2, :cond_5

    .line 10
    .line 11
    array-length v1, p0

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    sget-object p0, Ldefpackage/oh0;->b:Ldefpackage/oh0;

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 18
    .line 19
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 20
    .line 21
    .line 22
    :try_start_0
    new-instance v2, Ljava/io/ByteArrayInputStream;

    .line 23
    .line 24
    invoke-direct {v2, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x2

    .line 28
    new-array p0, p0, [B

    .line 29
    .line 30
    invoke-virtual {v2, p0}, Ljava/io/InputStream;->read([B)I

    .line 31
    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    aget-byte v4, p0, v3

    .line 35
    .line 36
    const/16 v5, -0x54

    .line 37
    .line 38
    if-ne v4, v5, :cond_1

    .line 39
    .line 40
    const/4 v4, 0x1

    .line 41
    aget-byte p0, p0, v4

    .line 42
    .line 43
    const/16 v5, -0x13

    .line 44
    .line 45
    if-ne p0, v5, :cond_1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    move v4, v3

    .line 49
    :goto_0
    invoke-virtual {v2}, Ljava/io/ByteArrayInputStream;->reset()V

    .line 50
    .line 51
    .line 52
    if-eqz v4, :cond_3

    .line 53
    .line 54
    new-instance p0, Ljava/io/ObjectInputStream;

    .line 55
    .line 56
    invoke-direct {p0, v2}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    .line 58
    .line 59
    :try_start_1
    invoke-virtual {p0}, Ljava/io/ObjectInputStream;->readInt()I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    :goto_1
    if-ge v3, v2, :cond_2

    .line 64
    .line 65
    invoke-virtual {p0}, Ljava/io/ObjectInputStream;->readUTF()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-interface {v1, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 77
    .line 78
    .line 79
    add-int/lit8 v3, v3, 0x1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :catchall_0
    move-exception v2

    .line 83
    goto :goto_2

    .line 84
    :cond_2
    :try_start_2
    invoke-virtual {p0}, Ljava/io/ObjectInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_0

    .line 85
    .line 86
    .line 87
    goto :goto_7

    .line 88
    :catch_0
    move-exception p0

    .line 89
    goto :goto_5

    .line 90
    :catch_1
    move-exception p0

    .line 91
    goto :goto_6

    .line 92
    :goto_2
    :try_start_3
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 93
    :catchall_1
    move-exception v3

    .line 94
    :try_start_4
    invoke-static {p0, v2}, Ldefpackage/q05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 95
    .line 96
    .line 97
    throw v3

    .line 98
    :cond_3
    new-instance p0, Ljava/io/DataInputStream;

    .line 99
    .line 100
    invoke-direct {p0, v2}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_4 .. :try_end_4} :catch_0

    .line 101
    .line 102
    .line 103
    :try_start_5
    invoke-static {p0}, Ldefpackage/bu;->j(Ljava/io/DataInputStream;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    :goto_3
    if-ge v3, v2, :cond_4

    .line 111
    .line 112
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readByte()B

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    invoke-static {p0, v4}, Ldefpackage/bu;->k(Ljava/io/DataInputStream;B)Ljava/io/Serializable;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    invoke-interface {v1, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 128
    .line 129
    .line 130
    add-int/lit8 v3, v3, 0x1

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :catchall_2
    move-exception v2

    .line 134
    goto :goto_4

    .line 135
    :cond_4
    :try_start_6
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_6 .. :try_end_6} :catch_0

    .line 136
    .line 137
    .line 138
    goto :goto_7

    .line 139
    :goto_4
    :try_start_7
    throw v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 140
    :catchall_3
    move-exception v3

    .line 141
    :try_start_8
    invoke-static {p0, v2}, Ldefpackage/q05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 142
    .line 143
    .line 144
    throw v3
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_8 .. :try_end_8} :catch_0

    .line 145
    :goto_5
    sget-object v2, Ldefpackage/ki0;->a:Ljava/lang/String;

    .line 146
    .line 147
    invoke-static {}, Ldefpackage/cx;->f()Ldefpackage/cx;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    invoke-virtual {v3, v2, v0, p0}, Ldefpackage/cx;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 152
    .line 153
    .line 154
    goto :goto_7

    .line 155
    :goto_6
    sget-object v2, Ldefpackage/ki0;->a:Ljava/lang/String;

    .line 156
    .line 157
    invoke-static {}, Ldefpackage/cx;->f()Ldefpackage/cx;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    invoke-virtual {v3, v2, v0, p0}, Ldefpackage/cx;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 162
    .line 163
    .line 164
    :goto_7
    new-instance p0, Ldefpackage/oh0;

    .line 165
    .line 166
    invoke-direct {p0, v1}, Ldefpackage/oh0;-><init>(Ljava/util/LinkedHashMap;)V

    .line 167
    .line 168
    .line 169
    return-object p0

    .line 170
    :cond_5
    const-string p0, "Data cannot occupy more than 10240 bytes when serialized"

    .line 171
    .line 172
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    const/4 p0, 0x0

    .line 176
    return-object p0
.end method


# virtual methods
.method public final b(Ljava/lang/String;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/oh0;->a:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const-class p1, Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {p1, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    goto/16 :goto_2

    .line 5
    .line 6
    :cond_0
    const/4 v1, 0x0

    .line 7
    if-eqz p1, :cond_9

    .line 8
    .line 9
    const-class v2, Ldefpackage/oh0;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_1

    .line 20
    .line 21
    goto :goto_3

    .line 22
    :cond_1
    check-cast p1, Ldefpackage/oh0;

    .line 23
    .line 24
    iget-object p1, p1, Ldefpackage/oh0;->a:Ljava/util/HashMap;

    .line 25
    .line 26
    iget-object p0, p0, Ldefpackage/oh0;->a:Ljava/util/HashMap;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {p1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-static {v2, v3}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-nez v3, :cond_2

    .line 41
    .line 42
    goto :goto_3

    .line 43
    :cond_2
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_8

    .line 52
    .line 53
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    check-cast v3, Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {p0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-virtual {p1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    if-eqz v4, :cond_6

    .line 68
    .line 69
    if-nez v3, :cond_4

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_4
    instance-of v5, v4, [Ljava/lang/Object;

    .line 73
    .line 74
    if-eqz v5, :cond_5

    .line 75
    .line 76
    move-object v5, v4

    .line 77
    check-cast v5, [Ljava/lang/Object;

    .line 78
    .line 79
    instance-of v6, v3, [Ljava/lang/Object;

    .line 80
    .line 81
    if-eqz v6, :cond_5

    .line 82
    .line 83
    check-cast v3, [Ljava/lang/Object;

    .line 84
    .line 85
    invoke-static {v5, v3}, Ldefpackage/ti;->W([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    goto :goto_1

    .line 90
    :cond_5
    invoke-virtual {v4, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    goto :goto_1

    .line 95
    :cond_6
    :goto_0
    if-ne v4, v3, :cond_7

    .line 96
    .line 97
    move v3, v0

    .line 98
    goto :goto_1

    .line 99
    :cond_7
    move v3, v1

    .line 100
    :goto_1
    if-nez v3, :cond_3

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_8
    :goto_2
    return v0

    .line 104
    :cond_9
    :goto_3
    return v1
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object p0, p0, Ldefpackage/oh0;->a:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const/4 v0, 0x0

    .line 12
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Ljava/util/Map$Entry;

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    instance-of v3, v2, [Ljava/lang/Object;

    .line 29
    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-static {v1}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    check-cast v2, [Ljava/lang/Object;

    .line 41
    .line 42
    invoke-static {v2}, Ljava/util/Arrays;->deepHashCode([Ljava/lang/Object;)I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    xor-int/2addr v1, v2

    .line 47
    goto :goto_1

    .line 48
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    :goto_1
    add-int/2addr v0, v1

    .line 53
    goto :goto_0

    .line 54
    :cond_1
    mul-int/lit8 v0, v0, 0x1f

    .line 55
    .line 56
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Data {"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Ldefpackage/oh0;->a:Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    move-object v1, p0

    .line 15
    check-cast v1, Ljava/lang/Iterable;

    .line 16
    .line 17
    sget-object v5, Ldefpackage/k5;->p:Ldefpackage/k5;

    .line 18
    .line 19
    const/16 v6, 0x1f

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    const/4 v3, 0x0

    .line 23
    const/4 v4, 0x0

    .line 24
    invoke-static/range {v1 .. v6}, Ldefpackage/q40;->B0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldefpackage/if1;I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const-string v1, "}"

    .line 29
    .line 30
    invoke-static {v0, p0, v1}, Ldefpackage/b11;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method
