.class public final Lcom/eddyizm/tempus/homemusic/SmartPlan;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final $stable:I = 0x0

.field public static final INSTANCE:Lcom/eddyizm/tempus/homemusic/SmartPlan;

.field public static final MAX_QUEUE:I = 0x1f4


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/eddyizm/tempus/homemusic/SmartPlan;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/eddyizm/tempus/homemusic/SmartPlan;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/eddyizm/tempus/homemusic/SmartPlan;->INSTANCE:Lcom/eddyizm/tempus/homemusic/SmartPlan;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic build$default(Lcom/eddyizm/tempus/homemusic/SmartPlan;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 1
    and-int/lit8 p5, p5, 0x8

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    const/4 p4, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/eddyizm/tempus/homemusic/SmartPlan;->build(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private static final build$recsAfter(Ljava/util/Map;Ljava/util/HashSet;Ljava/util/ArrayList;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/util/List<",
            "Lcom/eddyizm/tempus/homemusic/SmartRec;",
            ">;>;",
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ldefpackage/gg4;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-interface {p0, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/util/List;

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    sget-object p0, Ldefpackage/u01;->n:Ldefpackage/u01;

    .line 10
    .line 11
    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result p3

    .line 19
    if-eqz p3, :cond_3

    .line 20
    .line 21
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p3

    .line 25
    check-cast p3, Lcom/eddyizm/tempus/homemusic/SmartRec;

    .line 26
    .line 27
    invoke-virtual {p3}, Lcom/eddyizm/tempus/homemusic/SmartRec;->getQueueId()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-virtual {p1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    const/4 v0, 0x0

    .line 41
    :goto_1
    if-eqz v0, :cond_1

    .line 42
    .line 43
    new-instance v1, Ldefpackage/gg4;

    .line 44
    .line 45
    invoke-direct {v1, v0, p3}, Ldefpackage/gg4;-><init>(Ljava/lang/String;Lcom/eddyizm/tempus/homemusic/SmartRec;)V

    .line 46
    .line 47
    .line 48
    invoke-interface {p2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    return-void
.end method


# virtual methods
.method public final anchor(Ljava/util/List;ILdefpackage/if1;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ldefpackage/s11;",
            ">;I",
            "Ldefpackage/if1;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    add-int/lit8 p0, p0, -0x1

    .line 12
    .line 13
    if-le p2, p0, :cond_0

    .line 14
    .line 15
    move p2, p0

    .line 16
    :cond_0
    :goto_0
    const/4 p0, -0x1

    .line 17
    if-ge p0, p2, :cond_2

    .line 18
    .line 19
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Ldefpackage/s11;

    .line 24
    .line 25
    iget-boolean v0, p0, Ldefpackage/s11;->b:Z

    .line 26
    .line 27
    iget-object p0, p0, Ldefpackage/s11;->a:Ljava/lang/String;

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    invoke-interface {p3, p0}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Ljava/lang/Boolean;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_1
    add-int/lit8 p2, p2, -0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    const/4 p0, 0x0

    .line 48
    return-object p0
.end method

.method public final build(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Lcom/eddyizm/tempus/homemusic/SmartRec;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ldefpackage/gg4;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Ldefpackage/q40;->T0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    new-instance v0, Lcom/eddyizm/tempus/homemusic/SmartPlan$build$$inlined$sortedBy$1;

    .line 15
    .line 16
    invoke-direct {v0}, Lcom/eddyizm/tempus/homemusic/SmartPlan$build$$inlined$sortedBy$1;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-static {p3, v0}, Ldefpackage/q40;->K0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    move-object v2, v1

    .line 43
    check-cast v2, Lcom/eddyizm/tempus/homemusic/SmartRec;

    .line 44
    .line 45
    invoke-virtual {v2}, Lcom/eddyizm/tempus/homemusic/SmartRec;->getAfter()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    if-nez v2, :cond_0

    .line 50
    .line 51
    const-string v2, ""

    .line 52
    .line 53
    :cond_0
    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    if-nez v3, :cond_1

    .line 58
    .line 59
    new-instance v3, Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    :cond_1
    check-cast v3, Ljava/util/List;

    .line 68
    .line 69
    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    new-instance p3, Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 76
    .line 77
    .line 78
    new-instance v1, Ljava/util/HashSet;

    .line 79
    .line 80
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 81
    .line 82
    .line 83
    if-eqz p4, :cond_3

    .line 84
    .line 85
    sget-object v2, Lcom/eddyizm/tempus/homemusic/SmartContexts;->INSTANCE:Lcom/eddyizm/tempus/homemusic/SmartContexts;

    .line 86
    .line 87
    invoke-virtual {v2, p4}, Lcom/eddyizm/tempus/homemusic/SmartContexts;->hubId(Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-static {v0, v1, p3, v2}, Lcom/eddyizm/tempus/homemusic/SmartPlan;->build$recsAfter(Ljava/util/Map;Ljava/util/HashSet;Ljava/util/ArrayList;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    :cond_3
    new-instance v2, Ljava/util/HashSet;

    .line 95
    .line 96
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    :cond_4
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    const/4 v4, 0x0

    .line 108
    if-eqz v3, :cond_7

    .line 109
    .line 110
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    check-cast v3, Ljava/lang/String;

    .line 115
    .line 116
    sget-object v5, Lcom/eddyizm/tempus/homemusic/SmartContexts;->INSTANCE:Lcom/eddyizm/tempus/homemusic/SmartContexts;

    .line 117
    .line 118
    invoke-virtual {v5, v3}, Lcom/eddyizm/tempus/homemusic/SmartContexts;->mediaId(Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    invoke-virtual {v2, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    invoke-interface {p0, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v6

    .line 129
    if-eqz v6, :cond_5

    .line 130
    .line 131
    invoke-virtual {v1, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    if-eqz v6, :cond_5

    .line 136
    .line 137
    new-instance v6, Ldefpackage/gg4;

    .line 138
    .line 139
    invoke-direct {v6, v5, v4}, Ldefpackage/gg4;-><init>(Ljava/lang/String;Lcom/eddyizm/tempus/homemusic/SmartRec;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    :cond_5
    invoke-interface {p0, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v4

    .line 149
    if-nez v4, :cond_6

    .line 150
    .line 151
    invoke-static {v5, p4}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v4

    .line 155
    if-eqz v4, :cond_4

    .line 156
    .line 157
    :cond_6
    invoke-static {v0, v1, p3, v3}, Lcom/eddyizm/tempus/homemusic/SmartPlan;->build$recsAfter(Ljava/util/Map;Ljava/util/HashSet;Ljava/util/ArrayList;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_7
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    :cond_8
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 166
    .line 167
    .line 168
    move-result p1

    .line 169
    if-eqz p1, :cond_9

    .line 170
    .line 171
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    check-cast p1, Ljava/lang/String;

    .line 176
    .line 177
    invoke-virtual {v2, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result p2

    .line 181
    if-nez p2, :cond_8

    .line 182
    .line 183
    invoke-virtual {v1, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result p2

    .line 187
    if-eqz p2, :cond_8

    .line 188
    .line 189
    new-instance p2, Ldefpackage/gg4;

    .line 190
    .line 191
    invoke-direct {p2, p1, v4}, Ldefpackage/gg4;-><init>(Ljava/lang/String;Lcom/eddyizm/tempus/homemusic/SmartRec;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p3, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_9
    return-object p3
.end method

.method public final insertions(Ljava/util/List;ILjava/util/List;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ldefpackage/s11;",
            ">;I",
            "Ljava/util/List<",
            "Lcom/eddyizm/tempus/homemusic/SmartRec;",
            ">;)",
            "Ljava/util/List<",
            "Ldefpackage/kd3;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance p0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 10
    .line 11
    .line 12
    new-instance p1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    new-instance v0, Lcom/eddyizm/tempus/homemusic/SmartPlan$insertions$$inlined$sortedBy$1;

    .line 18
    .line 19
    invoke-direct {v0}, Lcom/eddyizm/tempus/homemusic/SmartPlan$insertions$$inlined$sortedBy$1;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-static {p3, v0}, Ldefpackage/q40;->K0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    :cond_0
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_9

    .line 35
    .line 36
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Lcom/eddyizm/tempus/homemusic/SmartRec;

    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/eddyizm/tempus/homemusic/SmartRec;->getQueueId()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    if-nez v1, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    invoke-virtual {v0}, Lcom/eddyizm/tempus/homemusic/SmartRec;->getAfter()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    if-eqz v2, :cond_0

    .line 54
    .line 55
    sget-object v3, Lcom/eddyizm/tempus/homemusic/SmartContexts;->INSTANCE:Lcom/eddyizm/tempus/homemusic/SmartContexts;

    .line 56
    .line 57
    invoke-virtual {v3, v2}, Lcom/eddyizm/tempus/homemusic/SmartContexts;->mediaId(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    if-nez v2, :cond_2

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    const/4 v4, 0x0

    .line 69
    if-eqz v3, :cond_3

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_3
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    move v5, v4

    .line 77
    :cond_4
    if-ge v5, v3, :cond_5

    .line 78
    .line 79
    invoke-virtual {p0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    add-int/lit8 v5, v5, 0x1

    .line 84
    .line 85
    check-cast v6, Ldefpackage/s11;

    .line 86
    .line 87
    iget-object v6, v6, Ldefpackage/s11;->a:Ljava/lang/String;

    .line 88
    .line 89
    invoke-static {v6, v1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    if-eqz v6, :cond_4

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_5
    :goto_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    move v5, v4

    .line 101
    :goto_2
    if-ge v5, v3, :cond_7

    .line 102
    .line 103
    invoke-virtual {p0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    add-int/lit8 v5, v5, 0x1

    .line 108
    .line 109
    check-cast v6, Ldefpackage/s11;

    .line 110
    .line 111
    iget-boolean v7, v6, Ldefpackage/s11;->b:Z

    .line 112
    .line 113
    if-nez v7, :cond_6

    .line 114
    .line 115
    iget-object v6, v6, Ldefpackage/s11;->a:Ljava/lang/String;

    .line 116
    .line 117
    invoke-static {v6, v2}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v6

    .line 121
    if-eqz v6, :cond_6

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_6
    add-int/lit8 v4, v4, 0x1

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_7
    const/4 v4, -0x1

    .line 128
    :goto_3
    if-ltz v4, :cond_0

    .line 129
    .line 130
    if-ge v4, p2, :cond_8

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_8
    add-int/lit8 v4, v4, 0x1

    .line 134
    .line 135
    new-instance v2, Ldefpackage/s11;

    .line 136
    .line 137
    const/4 v3, 0x1

    .line 138
    invoke-direct {v2, v1, v3}, Ldefpackage/s11;-><init>(Ljava/lang/String;Z)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0, v4, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    new-instance v2, Ldefpackage/kd3;

    .line 149
    .line 150
    invoke-direct {v2, v1, v0}, Ldefpackage/kd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    invoke-interface {p1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    goto :goto_0

    .line 157
    :cond_9
    return-object p1
.end method

.method public final restore(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ldefpackage/s11;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance p0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    move-object v1, v0

    .line 27
    check-cast v1, Ldefpackage/s11;

    .line 28
    .line 29
    iget-boolean v1, v1, Ldefpackage/s11;->b:Z

    .line 30
    .line 31
    if-nez v1, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    new-instance p2, Ljava/util/ArrayList;

    .line 38
    .line 39
    const/16 v0, 0xa

    .line 40
    .line 41
    invoke-static {p0, v0}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-direct {p2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    const/4 v2, 0x0

    .line 53
    move v3, v2

    .line 54
    :goto_1
    if-ge v3, v1, :cond_2

    .line 55
    .line 56
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    add-int/lit8 v3, v3, 0x1

    .line 61
    .line 62
    check-cast v4, Ldefpackage/s11;

    .line 63
    .line 64
    iget-object v4, v4, Ldefpackage/s11;->a:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {p2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    invoke-static {p2}, Ldefpackage/q40;->T0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    sget-object v1, Lcom/eddyizm/tempus/homemusic/SmartContexts;->INSTANCE:Lcom/eddyizm/tempus/homemusic/SmartContexts;

    .line 75
    .line 76
    new-instance v3, Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-static {p1, v0}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 83
    .line 84
    .line 85
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-eqz v0, :cond_3

    .line 94
    .line 95
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, Ljava/lang/String;

    .line 100
    .line 101
    invoke-virtual {v1, v0}, Lcom/eddyizm/tempus/homemusic/SmartContexts;->mediaId(Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_3
    if-eqz p3, :cond_4

    .line 110
    .line 111
    invoke-virtual {v3, p3}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    goto :goto_3

    .line 116
    :cond_4
    const/4 p1, -0x1

    .line 117
    :goto_3
    add-int/lit8 p1, p1, 0x1

    .line 118
    .line 119
    invoke-static {v3, p1}, Ldefpackage/q40;->u0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 120
    .line 121
    .line 122
    move-result-object p3

    .line 123
    invoke-static {v3, p1}, Ldefpackage/q40;->L0(Ljava/util/List;I)Ljava/util/List;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-static {p3, p1}, Ldefpackage/q40;->G0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    new-instance p3, Ljava/util/ArrayList;

    .line 132
    .line 133
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    move v1, v2

    .line 141
    :cond_5
    :goto_4
    if-ge v1, v0, :cond_6

    .line 142
    .line 143
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    add-int/lit8 v1, v1, 0x1

    .line 148
    .line 149
    move-object v4, v3

    .line 150
    check-cast v4, Ljava/lang/String;

    .line 151
    .line 152
    invoke-interface {p0, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    if-eqz v4, :cond_5

    .line 157
    .line 158
    invoke-virtual {p3, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    goto :goto_4

    .line 162
    :cond_6
    invoke-static {p3}, Ldefpackage/q40;->T0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    new-instance p1, Ljava/util/ArrayList;

    .line 167
    .line 168
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    :cond_7
    :goto_5
    if-ge v2, v0, :cond_8

    .line 176
    .line 177
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    add-int/lit8 v2, v2, 0x1

    .line 182
    .line 183
    move-object v3, v1

    .line 184
    check-cast v3, Ljava/lang/String;

    .line 185
    .line 186
    invoke-interface {p0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    if-nez v3, :cond_7

    .line 191
    .line 192
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    goto :goto_5

    .line 196
    :cond_8
    invoke-static {p3, p1}, Ldefpackage/q40;->G0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    return-object p0
.end method
