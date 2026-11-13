.class public final Lcom/eddyizm/tempus/homemusic/WaveSession$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/eddyizm/tempus/homemusic/WaveSession;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ldefpackage/xj0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/eddyizm/tempus/homemusic/WaveSession$Companion;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic startBody$default(Lcom/eddyizm/tempus/homemusic/WaveSession$Companion;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/Map;
    .locals 1

    .line 1
    and-int/lit8 p7, p6, 0x4

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p7, :cond_0

    .line 5
    .line 6
    move-object p3, v0

    .line 7
    :cond_0
    and-int/lit8 p7, p6, 0x8

    .line 8
    .line 9
    if-eqz p7, :cond_1

    .line 10
    .line 11
    move-object p4, v0

    .line 12
    :cond_1
    and-int/lit8 p6, p6, 0x10

    .line 13
    .line 14
    if-eqz p6, :cond_2

    .line 15
    .line 16
    move-object p5, v0

    .line 17
    :cond_2
    invoke-virtual/range {p0 .. p5}, Lcom/eddyizm/tempus/homemusic/WaveSession$Companion;->startBody(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method


# virtual methods
.method public final startBody(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v0, "ref"

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v2, v1

    .line 17
    :goto_0
    instance-of v3, v2, Ljava/lang/String;

    .line 18
    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    check-cast v2, Ljava/lang/String;

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move-object v2, v1

    .line 25
    :goto_1
    const-string v3, "artist_ref"

    .line 26
    .line 27
    if-eqz p1, :cond_2

    .line 28
    .line 29
    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    goto :goto_2

    .line 34
    :cond_2
    move-object v4, v1

    .line 35
    :goto_2
    instance-of v5, v4, Ljava/lang/String;

    .line 36
    .line 37
    if-eqz v5, :cond_3

    .line 38
    .line 39
    check-cast v4, Ljava/lang/String;

    .line 40
    .line 41
    goto :goto_3

    .line 42
    :cond_3
    move-object v4, v1

    .line 43
    :goto_3
    const-string v5, "nd_artist_id"

    .line 44
    .line 45
    if-eqz p1, :cond_4

    .line 46
    .line 47
    invoke-interface {p1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    goto :goto_4

    .line 52
    :cond_4
    move-object p1, v1

    .line 53
    :goto_4
    instance-of v6, p1, Ljava/lang/String;

    .line 54
    .line 55
    if-eqz v6, :cond_5

    .line 56
    .line 57
    check-cast p1, Ljava/lang/String;

    .line 58
    .line 59
    goto :goto_5

    .line 60
    :cond_5
    move-object p1, v1

    .line 61
    :goto_5
    const-string v6, "seed"

    .line 62
    .line 63
    if-eqz v2, :cond_7

    .line 64
    .line 65
    invoke-static {v2}, Ldefpackage/qm4;->u0(Ljava/lang/CharSequence;)Z

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    if-eqz v7, :cond_6

    .line 70
    .line 71
    goto :goto_6

    .line 72
    :cond_6
    invoke-static {v0, v2}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, v6, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    goto :goto_8

    .line 83
    :cond_7
    :goto_6
    if-eqz p1, :cond_9

    .line 84
    .line 85
    invoke-static {p1}, Ldefpackage/qm4;->u0(Ljava/lang/CharSequence;)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_8

    .line 90
    .line 91
    goto :goto_7

    .line 92
    :cond_8
    invoke-static {v5, p1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0, v6, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    goto :goto_8

    .line 103
    :cond_9
    :goto_7
    if-eqz v4, :cond_b

    .line 104
    .line 105
    invoke-static {v4}, Ldefpackage/qm4;->u0(Ljava/lang/CharSequence;)Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-eqz p1, :cond_a

    .line 110
    .line 111
    goto :goto_8

    .line 112
    :cond_a
    invoke-static {v3, v4}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0, v6, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    :cond_b
    :goto_8
    if-eqz p2, :cond_d

    .line 123
    .line 124
    invoke-static {p2}, Ldefpackage/qm4;->u0(Ljava/lang/CharSequence;)Z

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    if-eqz p1, :cond_c

    .line 129
    .line 130
    goto :goto_9

    .line 131
    :cond_c
    const-string p1, "mode"

    .line 132
    .line 133
    invoke-virtual {p0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    :cond_d
    :goto_9
    sget-object p1, Ldefpackage/k62;->c:Ldefpackage/ux3;

    .line 137
    .line 138
    invoke-static {p3}, Ldefpackage/gi1;->b0(Ljava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    if-eqz p1, :cond_e

    .line 143
    .line 144
    const-string p2, "origin"

    .line 145
    .line 146
    invoke-virtual {p0, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    :cond_e
    const/16 p1, 0x20

    .line 150
    .line 151
    if-eqz p4, :cond_10

    .line 152
    .line 153
    invoke-static {p4}, Ldefpackage/qm4;->u0(Ljava/lang/CharSequence;)Z

    .line 154
    .line 155
    .line 156
    move-result p2

    .line 157
    if-nez p2, :cond_f

    .line 158
    .line 159
    goto :goto_a

    .line 160
    :cond_f
    move-object p4, v1

    .line 161
    :goto_a
    if-eqz p4, :cond_10

    .line 162
    .line 163
    const-string p2, "restart_of"

    .line 164
    .line 165
    invoke-static {p1, p4}, Ldefpackage/qm4;->J0(ILjava/lang/String;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p3

    .line 169
    invoke-virtual {p0, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    :cond_10
    if-eqz p5, :cond_12

    .line 173
    .line 174
    invoke-static {p5}, Ldefpackage/qm4;->u0(Ljava/lang/CharSequence;)Z

    .line 175
    .line 176
    .line 177
    move-result p2

    .line 178
    if-nez p2, :cond_11

    .line 179
    .line 180
    goto :goto_b

    .line 181
    :cond_11
    move-object p5, v1

    .line 182
    :goto_b
    if-eqz p5, :cond_12

    .line 183
    .line 184
    const-string p2, "client"

    .line 185
    .line 186
    invoke-static {p1, p5}, Ldefpackage/qm4;->J0(ILjava/lang/String;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    invoke-virtual {p0, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    :cond_12
    return-object p0
.end method
