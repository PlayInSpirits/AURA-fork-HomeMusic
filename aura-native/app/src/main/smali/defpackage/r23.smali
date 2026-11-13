.class public abstract Ldefpackage/r23;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final synthetic w:I


# instance fields
.field public final n:Ljava/lang/String;

.field public o:Ldefpackage/t23;

.field public p:Ljava/lang/String;

.field public q:Ljava/lang/CharSequence;

.field public final r:Ljava/util/ArrayList;

.field public final s:Ldefpackage/mj4;

.field public final t:Ljava/util/LinkedHashMap;

.field public u:I

.field public v:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Ldefpackage/t43;)V
    .locals 1

    .line 1
    sget-object v0, Ldefpackage/u43;->b:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Ldefpackage/bu;->n(Ljava/lang/Class;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Ldefpackage/r23;->n:Ljava/lang/String;

    .line 15
    .line 16
    new-instance p1, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Ldefpackage/r23;->r:Ljava/util/ArrayList;

    .line 22
    .line 23
    new-instance p1, Ldefpackage/mj4;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-direct {p1, v0}, Ldefpackage/mj4;-><init>(I)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Ldefpackage/r23;->s:Ldefpackage/mj4;

    .line 30
    .line 31
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 32
    .line 33
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Ldefpackage/r23;->t:Ljava/util/LinkedHashMap;

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 5

    .line 1
    iget-object p0, p0, Ldefpackage/r23;->t:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0

    .line 13
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    .line 14
    .line 15
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Ljava/util/Map$Entry;

    .line 37
    .line 38
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Ljava/lang/String;

    .line 43
    .line 44
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    check-cast v2, Ldefpackage/z13;

    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    iget-boolean v4, v2, Ldefpackage/z13;->c:Z

    .line 57
    .line 58
    if-eqz v4, :cond_1

    .line 59
    .line 60
    iget-object v4, v2, Ldefpackage/z13;->d:Ljava/lang/Object;

    .line 61
    .line 62
    if-eqz v4, :cond_1

    .line 63
    .line 64
    iget-object v2, v2, Ldefpackage/z13;->a:Ldefpackage/h33;

    .line 65
    .line 66
    invoke-virtual {v2, v0, v3, v4}, Ldefpackage/h33;->e(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    if-eqz p1, :cond_5

    .line 71
    .line 72
    invoke-virtual {v0, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-eqz p1, :cond_5

    .line 88
    .line 89
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    check-cast p1, Ljava/util/Map$Entry;

    .line 94
    .line 95
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    check-cast v1, Ljava/lang/String;

    .line 100
    .line 101
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    check-cast p1, Ldefpackage/z13;

    .line 106
    .line 107
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    iget-object v2, p1, Ldefpackage/z13;->a:Ldefpackage/h33;

    .line 111
    .line 112
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    iget-boolean p1, p1, Ldefpackage/z13;->b:Z

    .line 116
    .line 117
    if-nez p1, :cond_3

    .line 118
    .line 119
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    if-eqz p1, :cond_3

    .line 124
    .line 125
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    if-eqz p1, :cond_4

    .line 130
    .line 131
    :cond_3
    :try_start_0
    invoke-virtual {v2, v1, v0}, Ldefpackage/h33;->a(Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :catch_0
    :cond_4
    const-string p0, "Wrong argument type for \'"

    .line 136
    .line 137
    const-string p1, "\' in argument bundle. "

    .line 138
    .line 139
    invoke-static {p0, v1, p1}, Ldefpackage/xa3;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    invoke-virtual {v2}, Ldefpackage/h33;->b()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    const-string p1, " expected."

    .line 151
    .line 152
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 160
    .line 161
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    throw p1

    .line 169
    :cond_5
    return-object v0
.end method

.method public final b(Ldefpackage/r23;)[I
    .locals 6

    .line 1
    new-instance v0, Ldefpackage/ii;

    .line 2
    .line 3
    invoke-direct {v0}, Ldefpackage/ii;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    iget-object v1, p0, Ldefpackage/r23;->o:Ldefpackage/t23;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object v3, p1, Ldefpackage/r23;->o:Ldefpackage/t23;

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    move-object v3, v2

    .line 15
    :goto_1
    if-eqz v3, :cond_1

    .line 16
    .line 17
    iget-object v3, p1, Ldefpackage/r23;->o:Ldefpackage/t23;

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget v4, p0, Ldefpackage/r23;->u:I

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    invoke-virtual {v3, v4, v3, v2, v5}, Ldefpackage/t23;->h(ILdefpackage/r23;Ldefpackage/r23;Z)Ldefpackage/r23;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    if-ne v2, p0, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0, p0}, Ldefpackage/ii;->addFirst(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_1
    if-eqz v1, :cond_2

    .line 36
    .line 37
    iget v2, v1, Ldefpackage/t23;->y:I

    .line 38
    .line 39
    iget v3, p0, Ldefpackage/r23;->u:I

    .line 40
    .line 41
    if-eq v2, v3, :cond_3

    .line 42
    .line 43
    :cond_2
    invoke-virtual {v0, p0}, Ldefpackage/ii;->addFirst(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    :cond_3
    invoke-static {v1, p1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    if-eqz p0, :cond_4

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_4
    if-nez v1, :cond_6

    .line 54
    .line 55
    :goto_2
    invoke-static {v0}, Ldefpackage/q40;->Q0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    new-instance p1, Ljava/util/ArrayList;

    .line 60
    .line 61
    const/16 v0, 0xa

    .line 62
    .line 63
    invoke-static {p0, v0}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 68
    .line 69
    .line 70
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_5

    .line 79
    .line 80
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, Ldefpackage/r23;

    .line 85
    .line 86
    iget v0, v0, Ldefpackage/r23;->u:I

    .line 87
    .line 88
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_5
    invoke-static {p1}, Ldefpackage/q40;->P0(Ljava/util/List;)[I

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    return-object p0

    .line 101
    :cond_6
    move-object p0, v1

    .line 102
    goto :goto_0
.end method

.method public final d(I)Ldefpackage/y13;
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/r23;->s:Ldefpackage/mj4;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldefpackage/mj4;->e()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    move-object v0, v2

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {v0, p1}, Ldefpackage/mj4;->b(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ldefpackage/y13;

    .line 17
    .line 18
    :goto_0
    if-nez v0, :cond_2

    .line 19
    .line 20
    iget-object p0, p0, Ldefpackage/r23;->o:Ldefpackage/t23;

    .line 21
    .line 22
    if-eqz p0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Ldefpackage/r23;->d(I)Ldefpackage/y13;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_1
    return-object v2

    .line 30
    :cond_2
    return-object v0
.end method

.method public e(Ldefpackage/ik;)Ldefpackage/p23;
    .locals 27

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    iget-object v8, v1, Ldefpackage/r23;->r:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v9, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    return-object v9

    .line 15
    :cond_0
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v10

    .line 19
    move-object v12, v9

    .line 20
    const/4 v0, 0x0

    .line 21
    :goto_0
    if-ge v0, v10, :cond_27

    .line 22
    .line 23
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    add-int/lit8 v13, v0, 0x1

    .line 28
    .line 29
    check-cast v2, Ldefpackage/n23;

    .line 30
    .line 31
    iget-object v0, v7, Ldefpackage/ik;->b:Landroid/net/Uri;

    .line 32
    .line 33
    const/16 v3, 0xa

    .line 34
    .line 35
    iget-object v4, v1, Ldefpackage/r23;->t:Ljava/util/LinkedHashMap;

    .line 36
    .line 37
    if-eqz v0, :cond_b

    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    iget-object v5, v2, Ldefpackage/n23;->f:Ldefpackage/rp4;

    .line 49
    .line 50
    invoke-virtual {v5}, Ldefpackage/rp4;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    check-cast v5, Ljava/util/regex/Pattern;

    .line 55
    .line 56
    if-eqz v5, :cond_1

    .line 57
    .line 58
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    invoke-virtual {v5, v6}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    goto :goto_1

    .line 67
    :cond_1
    move-object v5, v9

    .line 68
    :goto_1
    if-nez v5, :cond_2

    .line 69
    .line 70
    :goto_2
    move-object/from16 v16, v9

    .line 71
    .line 72
    goto/16 :goto_7

    .line 73
    .line 74
    :cond_2
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->matches()Z

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    if-nez v6, :cond_3

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_3
    new-instance v6, Landroid/os/Bundle;

    .line 82
    .line 83
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, v5, v6, v4}, Ldefpackage/n23;->c(Ljava/util/regex/Matcher;Landroid/os/Bundle;Ljava/util/Map;)Z

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    if-nez v5, :cond_4

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_4
    iget-object v5, v2, Ldefpackage/n23;->g:Ldefpackage/rp4;

    .line 94
    .line 95
    invoke-virtual {v5}, Ldefpackage/rp4;->getValue()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    check-cast v5, Ljava/lang/Boolean;

    .line 100
    .line 101
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    if-eqz v5, :cond_5

    .line 106
    .line 107
    invoke-virtual {v2, v0, v6, v4}, Ldefpackage/n23;->d(Landroid/net/Uri;Landroid/os/Bundle;Ljava/util/Map;)Z

    .line 108
    .line 109
    .line 110
    move-result v5

    .line 111
    if-nez v5, :cond_5

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_5
    invoke-virtual {v0}, Landroid/net/Uri;->getFragment()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    iget-object v14, v2, Ldefpackage/n23;->m:Ldefpackage/rp4;

    .line 119
    .line 120
    invoke-virtual {v14}, Ldefpackage/rp4;->getValue()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v14

    .line 124
    check-cast v14, Ljava/util/regex/Pattern;

    .line 125
    .line 126
    if-eqz v14, :cond_6

    .line 127
    .line 128
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    invoke-virtual {v14, v5}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    goto :goto_3

    .line 137
    :cond_6
    move-object v5, v9

    .line 138
    :goto_3
    if-nez v5, :cond_7

    .line 139
    .line 140
    :goto_4
    move-object/from16 v16, v9

    .line 141
    .line 142
    goto :goto_6

    .line 143
    :cond_7
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->matches()Z

    .line 144
    .line 145
    .line 146
    move-result v14

    .line 147
    if-nez v14, :cond_8

    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_8
    iget-object v14, v2, Ldefpackage/n23;->k:Ldefpackage/r72;

    .line 151
    .line 152
    invoke-interface {v14}, Ldefpackage/r72;->getValue()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v14

    .line 156
    check-cast v14, Ljava/util/List;

    .line 157
    .line 158
    new-instance v15, Ljava/util/ArrayList;

    .line 159
    .line 160
    move-object/from16 v16, v9

    .line 161
    .line 162
    invoke-static {v14, v3}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 163
    .line 164
    .line 165
    move-result v9

    .line 166
    invoke-direct {v15, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 167
    .line 168
    .line 169
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 170
    .line 171
    .line 172
    move-result-object v9

    .line 173
    const/4 v14, 0x0

    .line 174
    :goto_5
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 175
    .line 176
    .line 177
    move-result v17

    .line 178
    if-eqz v17, :cond_a

    .line 179
    .line 180
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v17

    .line 184
    add-int/lit8 v3, v14, 0x1

    .line 185
    .line 186
    if-ltz v14, :cond_9

    .line 187
    .line 188
    move-object/from16 v14, v17

    .line 189
    .line 190
    check-cast v14, Ljava/lang/String;

    .line 191
    .line 192
    invoke-virtual {v5, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v17

    .line 196
    invoke-static/range {v17 .. v17}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v11

    .line 200
    invoke-virtual {v4, v14}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v17

    .line 204
    move-object/from16 v1, v17

    .line 205
    .line 206
    check-cast v1, Ldefpackage/z13;

    .line 207
    .line 208
    :try_start_0
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    invoke-static {v6, v14, v11, v1}, Ldefpackage/n23;->e(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ldefpackage/z13;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 212
    .line 213
    .line 214
    sget-object v1, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 215
    .line 216
    invoke-virtual {v15, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-object/from16 v1, p0

    .line 220
    .line 221
    move v14, v3

    .line 222
    const/16 v3, 0xa

    .line 223
    .line 224
    goto :goto_5

    .line 225
    :cond_9
    invoke-static {}, Ldefpackage/gb;->c0()V

    .line 226
    .line 227
    .line 228
    throw v16

    .line 229
    :catch_0
    :cond_a
    :goto_6
    new-instance v1, Ldefpackage/m23;

    .line 230
    .line 231
    const/4 v3, 0x0

    .line 232
    invoke-direct {v1, v3, v6}, Ldefpackage/m23;-><init>(ILandroid/os/Bundle;)V

    .line 233
    .line 234
    .line 235
    invoke-static {v4, v1}, Ldefpackage/ud3;->b0(Ljava/util/Map;Ldefpackage/if1;)Ljava/util/ArrayList;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    if-nez v1, :cond_c

    .line 244
    .line 245
    :goto_7
    goto :goto_8

    .line 246
    :cond_b
    move-object/from16 v16, v9

    .line 247
    .line 248
    :goto_8
    move-object/from16 v6, v16

    .line 249
    .line 250
    :cond_c
    iget-object v1, v2, Ldefpackage/n23;->a:Ljava/lang/String;

    .line 251
    .line 252
    if-eqz v0, :cond_10

    .line 253
    .line 254
    if-nez v1, :cond_d

    .line 255
    .line 256
    goto :goto_a

    .line 257
    :cond_d
    invoke-virtual {v0}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    .line 258
    .line 259
    .line 260
    move-result-object v3

    .line 261
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    invoke-virtual {v1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    new-instance v5, Ljava/util/LinkedHashSet;

    .line 276
    .line 277
    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    .line 278
    .line 279
    .line 280
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 281
    .line 282
    .line 283
    move-result-object v3

    .line 284
    :cond_e
    :goto_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 285
    .line 286
    .line 287
    move-result v9

    .line 288
    if-eqz v9, :cond_f

    .line 289
    .line 290
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v9

    .line 294
    invoke-interface {v1, v9}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    move-result v11

    .line 298
    if-eqz v11, :cond_e

    .line 299
    .line 300
    invoke-interface {v5, v9}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    goto :goto_9

    .line 304
    :cond_f
    invoke-interface {v5}, Ljava/util/Set;->size()I

    .line 305
    .line 306
    .line 307
    move-result v1

    .line 308
    move v3, v1

    .line 309
    goto :goto_b

    .line 310
    :cond_10
    :goto_a
    const/4 v3, 0x0

    .line 311
    :goto_b
    iget-object v1, v7, Ldefpackage/ik;->c:Ljava/lang/String;

    .line 312
    .line 313
    if-eqz v1, :cond_11

    .line 314
    .line 315
    iget-object v9, v2, Ldefpackage/n23;->b:Ljava/lang/String;

    .line 316
    .line 317
    invoke-virtual {v1, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    move-result v1

    .line 321
    if-eqz v1, :cond_11

    .line 322
    .line 323
    const/4 v1, 0x1

    .line 324
    goto :goto_c

    .line 325
    :cond_11
    const/4 v1, 0x0

    .line 326
    :goto_c
    iget-object v9, v7, Ldefpackage/ik;->d:Ljava/lang/String;

    .line 327
    .line 328
    if-eqz v9, :cond_1d

    .line 329
    .line 330
    iget-object v14, v2, Ldefpackage/n23;->c:Ljava/lang/String;

    .line 331
    .line 332
    if-eqz v14, :cond_1d

    .line 333
    .line 334
    iget-object v15, v2, Ldefpackage/n23;->o:Ldefpackage/rp4;

    .line 335
    .line 336
    invoke-virtual {v15}, Ldefpackage/rp4;->getValue()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v15

    .line 340
    check-cast v15, Ljava/util/regex/Pattern;

    .line 341
    .line 342
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v15, v9}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 346
    .line 347
    .line 348
    move-result-object v15

    .line 349
    invoke-virtual {v15}, Ljava/util/regex/Matcher;->matches()Z

    .line 350
    .line 351
    .line 352
    move-result v15

    .line 353
    if-nez v15, :cond_12

    .line 354
    .line 355
    goto/16 :goto_17

    .line 356
    .line 357
    :cond_12
    const-string v15, "/"

    .line 358
    .line 359
    invoke-static {v15}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 360
    .line 361
    .line 362
    move-result-object v11

    .line 363
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 364
    .line 365
    .line 366
    const/16 v19, 0x0

    .line 367
    .line 368
    invoke-static/range {v19 .. v19}, Ldefpackage/qm4;->A0(I)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {v11, v14}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 372
    .line 373
    .line 374
    move-result-object v11

    .line 375
    invoke-virtual {v11}, Ljava/util/regex/Matcher;->find()Z

    .line 376
    .line 377
    .line 378
    move-result v20

    .line 379
    if-nez v20, :cond_13

    .line 380
    .line 381
    invoke-virtual {v14}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v11

    .line 385
    invoke-static {v11}, Ldefpackage/gb;->O(Ljava/lang/Object;)Ljava/util/List;

    .line 386
    .line 387
    .line 388
    move-result-object v11

    .line 389
    move/from16 v21, v1

    .line 390
    .line 391
    move/from16 v22, v3

    .line 392
    .line 393
    const/16 v20, 0x1

    .line 394
    .line 395
    goto :goto_e

    .line 396
    :cond_13
    const/16 v20, 0x1

    .line 397
    .line 398
    new-instance v5, Ljava/util/ArrayList;

    .line 399
    .line 400
    move/from16 v21, v1

    .line 401
    .line 402
    const/16 v1, 0xa

    .line 403
    .line 404
    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 405
    .line 406
    .line 407
    move/from16 v22, v3

    .line 408
    .line 409
    const/4 v1, 0x0

    .line 410
    :goto_d
    invoke-virtual {v11}, Ljava/util/regex/Matcher;->start()I

    .line 411
    .line 412
    .line 413
    move-result v3

    .line 414
    invoke-virtual {v14, v1, v3}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 415
    .line 416
    .line 417
    move-result-object v1

    .line 418
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v1

    .line 422
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 423
    .line 424
    .line 425
    invoke-virtual {v11}, Ljava/util/regex/Matcher;->end()I

    .line 426
    .line 427
    .line 428
    move-result v1

    .line 429
    invoke-virtual {v11}, Ljava/util/regex/Matcher;->find()Z

    .line 430
    .line 431
    .line 432
    move-result v3

    .line 433
    if-nez v3, :cond_1c

    .line 434
    .line 435
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    .line 436
    .line 437
    .line 438
    move-result v3

    .line 439
    invoke-virtual {v14, v1, v3}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 440
    .line 441
    .line 442
    move-result-object v1

    .line 443
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object v1

    .line 447
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 448
    .line 449
    .line 450
    move-object v11, v5

    .line 451
    :goto_e
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    .line 452
    .line 453
    .line 454
    move-result v1

    .line 455
    sget-object v3, Ldefpackage/u01;->n:Ldefpackage/u01;

    .line 456
    .line 457
    if-nez v1, :cond_15

    .line 458
    .line 459
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 460
    .line 461
    .line 462
    move-result v1

    .line 463
    invoke-interface {v11, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 464
    .line 465
    .line 466
    move-result-object v1

    .line 467
    :goto_f
    invoke-interface {v1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 468
    .line 469
    .line 470
    move-result v5

    .line 471
    if-eqz v5, :cond_15

    .line 472
    .line 473
    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v5

    .line 477
    check-cast v5, Ljava/lang/String;

    .line 478
    .line 479
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 480
    .line 481
    .line 482
    move-result v5

    .line 483
    if-nez v5, :cond_14

    .line 484
    .line 485
    goto :goto_f

    .line 486
    :cond_14
    invoke-interface {v1}, Ljava/util/ListIterator;->nextIndex()I

    .line 487
    .line 488
    .line 489
    move-result v1

    .line 490
    add-int/lit8 v1, v1, 0x1

    .line 491
    .line 492
    invoke-static {v11, v1}, Ldefpackage/q40;->L0(Ljava/util/List;I)Ljava/util/List;

    .line 493
    .line 494
    .line 495
    move-result-object v1

    .line 496
    :goto_10
    const/4 v5, 0x0

    .line 497
    goto :goto_11

    .line 498
    :cond_15
    move-object v1, v3

    .line 499
    goto :goto_10

    .line 500
    :goto_11
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    move-result-object v11

    .line 504
    check-cast v11, Ljava/lang/String;

    .line 505
    .line 506
    move/from16 v14, v20

    .line 507
    .line 508
    invoke-interface {v1, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v1

    .line 512
    check-cast v1, Ljava/lang/String;

    .line 513
    .line 514
    invoke-static {v15}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 515
    .line 516
    .line 517
    move-result-object v14

    .line 518
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 519
    .line 520
    .line 521
    invoke-static {v5}, Ldefpackage/qm4;->A0(I)V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v14, v9}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 525
    .line 526
    .line 527
    move-result-object v23

    .line 528
    invoke-virtual/range {v23 .. v23}, Ljava/util/regex/Matcher;->find()Z

    .line 529
    .line 530
    .line 531
    move-result v5

    .line 532
    if-nez v5, :cond_16

    .line 533
    .line 534
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 535
    .line 536
    .line 537
    move-result-object v5

    .line 538
    invoke-static {v5}, Ldefpackage/gb;->O(Ljava/lang/Object;)Ljava/util/List;

    .line 539
    .line 540
    .line 541
    move-result-object v5

    .line 542
    goto :goto_12

    .line 543
    :cond_16
    new-instance v5, Ljava/util/ArrayList;

    .line 544
    .line 545
    const/16 v14, 0xa

    .line 546
    .line 547
    invoke-direct {v5, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 548
    .line 549
    .line 550
    const/4 v14, 0x0

    .line 551
    :cond_17
    invoke-virtual/range {v23 .. v23}, Ljava/util/regex/Matcher;->start()I

    .line 552
    .line 553
    .line 554
    move-result v15

    .line 555
    invoke-virtual {v9, v14, v15}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 556
    .line 557
    .line 558
    move-result-object v14

    .line 559
    invoke-virtual {v14}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 560
    .line 561
    .line 562
    move-result-object v14

    .line 563
    invoke-virtual {v5, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 564
    .line 565
    .line 566
    invoke-virtual/range {v23 .. v23}, Ljava/util/regex/Matcher;->end()I

    .line 567
    .line 568
    .line 569
    move-result v14

    .line 570
    invoke-virtual/range {v23 .. v23}, Ljava/util/regex/Matcher;->find()Z

    .line 571
    .line 572
    .line 573
    move-result v15

    .line 574
    if-nez v15, :cond_17

    .line 575
    .line 576
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 577
    .line 578
    .line 579
    move-result v15

    .line 580
    invoke-virtual {v9, v14, v15}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 581
    .line 582
    .line 583
    move-result-object v9

    .line 584
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 585
    .line 586
    .line 587
    move-result-object v9

    .line 588
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 589
    .line 590
    .line 591
    :goto_12
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 592
    .line 593
    .line 594
    move-result v9

    .line 595
    if-nez v9, :cond_19

    .line 596
    .line 597
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 598
    .line 599
    .line 600
    move-result v9

    .line 601
    invoke-interface {v5, v9}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 602
    .line 603
    .line 604
    move-result-object v9

    .line 605
    :goto_13
    invoke-interface {v9}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 606
    .line 607
    .line 608
    move-result v14

    .line 609
    if-eqz v14, :cond_19

    .line 610
    .line 611
    invoke-interface {v9}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 612
    .line 613
    .line 614
    move-result-object v14

    .line 615
    check-cast v14, Ljava/lang/String;

    .line 616
    .line 617
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    .line 618
    .line 619
    .line 620
    move-result v14

    .line 621
    if-nez v14, :cond_18

    .line 622
    .line 623
    goto :goto_13

    .line 624
    :cond_18
    invoke-interface {v9}, Ljava/util/ListIterator;->nextIndex()I

    .line 625
    .line 626
    .line 627
    move-result v3

    .line 628
    const/4 v14, 0x1

    .line 629
    add-int/2addr v3, v14

    .line 630
    invoke-static {v5, v3}, Ldefpackage/q40;->L0(Ljava/util/List;I)Ljava/util/List;

    .line 631
    .line 632
    .line 633
    move-result-object v3

    .line 634
    :goto_14
    const/4 v15, 0x0

    .line 635
    goto :goto_15

    .line 636
    :cond_19
    const/4 v14, 0x1

    .line 637
    goto :goto_14

    .line 638
    :goto_15
    invoke-interface {v3, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 639
    .line 640
    .line 641
    move-result-object v5

    .line 642
    check-cast v5, Ljava/lang/String;

    .line 643
    .line 644
    invoke-interface {v3, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 645
    .line 646
    .line 647
    move-result-object v3

    .line 648
    check-cast v3, Ljava/lang/String;

    .line 649
    .line 650
    invoke-static {v11, v5}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 651
    .line 652
    .line 653
    move-result v5

    .line 654
    if-eqz v5, :cond_1a

    .line 655
    .line 656
    const/4 v5, 0x2

    .line 657
    goto :goto_16

    .line 658
    :cond_1a
    move v5, v15

    .line 659
    :goto_16
    invoke-static {v1, v3}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 660
    .line 661
    .line 662
    move-result v1

    .line 663
    if-eqz v1, :cond_1b

    .line 664
    .line 665
    add-int/lit8 v5, v5, 0x1

    .line 666
    .line 667
    :cond_1b
    move/from16 v26, v15

    .line 668
    .line 669
    goto :goto_18

    .line 670
    :cond_1c
    const/16 v20, 0x1

    .line 671
    .line 672
    goto/16 :goto_d

    .line 673
    .line 674
    :cond_1d
    :goto_17
    move/from16 v21, v1

    .line 675
    .line 676
    move/from16 v22, v3

    .line 677
    .line 678
    const/16 v26, 0x0

    .line 679
    .line 680
    const/4 v5, -0x1

    .line 681
    :goto_18
    if-nez v6, :cond_24

    .line 682
    .line 683
    if-nez v21, :cond_1e

    .line 684
    .line 685
    const/4 v1, -0x1

    .line 686
    if-le v5, v1, :cond_25

    .line 687
    .line 688
    :cond_1e
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 689
    .line 690
    .line 691
    new-instance v1, Landroid/os/Bundle;

    .line 692
    .line 693
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 694
    .line 695
    .line 696
    if-nez v0, :cond_1f

    .line 697
    .line 698
    goto :goto_1a

    .line 699
    :cond_1f
    iget-object v3, v2, Ldefpackage/n23;->f:Ldefpackage/rp4;

    .line 700
    .line 701
    invoke-virtual {v3}, Ldefpackage/rp4;->getValue()Ljava/lang/Object;

    .line 702
    .line 703
    .line 704
    move-result-object v3

    .line 705
    check-cast v3, Ljava/util/regex/Pattern;

    .line 706
    .line 707
    if-eqz v3, :cond_20

    .line 708
    .line 709
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 710
    .line 711
    .line 712
    move-result-object v9

    .line 713
    invoke-virtual {v3, v9}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 714
    .line 715
    .line 716
    move-result-object v3

    .line 717
    goto :goto_19

    .line 718
    :cond_20
    move-object/from16 v3, v16

    .line 719
    .line 720
    :goto_19
    if-nez v3, :cond_21

    .line 721
    .line 722
    goto :goto_1a

    .line 723
    :cond_21
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z

    .line 724
    .line 725
    .line 726
    move-result v9

    .line 727
    if-nez v9, :cond_22

    .line 728
    .line 729
    goto :goto_1a

    .line 730
    :cond_22
    invoke-virtual {v2, v3, v1, v4}, Ldefpackage/n23;->c(Ljava/util/regex/Matcher;Landroid/os/Bundle;Ljava/util/Map;)Z

    .line 731
    .line 732
    .line 733
    iget-object v3, v2, Ldefpackage/n23;->g:Ldefpackage/rp4;

    .line 734
    .line 735
    invoke-virtual {v3}, Ldefpackage/rp4;->getValue()Ljava/lang/Object;

    .line 736
    .line 737
    .line 738
    move-result-object v3

    .line 739
    check-cast v3, Ljava/lang/Boolean;

    .line 740
    .line 741
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 742
    .line 743
    .line 744
    move-result v3

    .line 745
    if-eqz v3, :cond_23

    .line 746
    .line 747
    invoke-virtual {v2, v0, v1, v4}, Ldefpackage/n23;->d(Landroid/net/Uri;Landroid/os/Bundle;Ljava/util/Map;)Z

    .line 748
    .line 749
    .line 750
    :cond_23
    :goto_1a
    new-instance v0, Ldefpackage/m23;

    .line 751
    .line 752
    const/4 v14, 0x1

    .line 753
    invoke-direct {v0, v14, v1}, Ldefpackage/m23;-><init>(ILandroid/os/Bundle;)V

    .line 754
    .line 755
    .line 756
    invoke-static {v4, v0}, Ldefpackage/ud3;->b0(Ljava/util/Map;Ldefpackage/if1;)Ljava/util/ArrayList;

    .line 757
    .line 758
    .line 759
    move-result-object v0

    .line 760
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 761
    .line 762
    .line 763
    move-result v0

    .line 764
    if-eqz v0, :cond_25

    .line 765
    .line 766
    :cond_24
    new-instance v0, Ldefpackage/p23;

    .line 767
    .line 768
    iget-boolean v3, v2, Ldefpackage/n23;->p:Z

    .line 769
    .line 770
    move-object/from16 v1, p0

    .line 771
    .line 772
    move-object v2, v6

    .line 773
    move/from16 v4, v22

    .line 774
    .line 775
    move v6, v5

    .line 776
    move/from16 v5, v21

    .line 777
    .line 778
    invoke-direct/range {v0 .. v6}, Ldefpackage/p23;-><init>(Ldefpackage/r23;Landroid/os/Bundle;ZIZI)V

    .line 779
    .line 780
    .line 781
    if-eqz v12, :cond_26

    .line 782
    .line 783
    invoke-virtual {v0, v12}, Ldefpackage/p23;->a(Ldefpackage/p23;)I

    .line 784
    .line 785
    .line 786
    move-result v1

    .line 787
    if-lez v1, :cond_25

    .line 788
    .line 789
    goto :goto_1c

    .line 790
    :cond_25
    move-object/from16 v1, p0

    .line 791
    .line 792
    :goto_1b
    move v0, v13

    .line 793
    move-object/from16 v9, v16

    .line 794
    .line 795
    goto/16 :goto_0

    .line 796
    .line 797
    :cond_26
    :goto_1c
    move-object/from16 v1, p0

    .line 798
    .line 799
    move-object v12, v0

    .line 800
    goto :goto_1b

    .line 801
    :cond_27
    return-object v12
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    goto/16 :goto_4

    .line 5
    .line 6
    :cond_0
    const/4 v1, 0x0

    .line 7
    if-eqz p1, :cond_7

    .line 8
    .line 9
    instance-of v2, p1, Ldefpackage/r23;

    .line 10
    .line 11
    if-nez v2, :cond_1

    .line 12
    .line 13
    goto/16 :goto_5

    .line 14
    .line 15
    :cond_1
    check-cast p1, Ldefpackage/r23;

    .line 16
    .line 17
    iget-object v2, p1, Ldefpackage/r23;->s:Ldefpackage/mj4;

    .line 18
    .line 19
    iget-object v3, p1, Ldefpackage/r23;->t:Ljava/util/LinkedHashMap;

    .line 20
    .line 21
    iget-object v4, p1, Ldefpackage/r23;->r:Ljava/util/ArrayList;

    .line 22
    .line 23
    iget-object v5, p0, Ldefpackage/r23;->r:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-static {v5, v4}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    iget-object v5, p0, Ldefpackage/r23;->s:Ldefpackage/mj4;

    .line 30
    .line 31
    invoke-virtual {v5}, Ldefpackage/mj4;->e()I

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    invoke-virtual {v2}, Ldefpackage/mj4;->e()I

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    if-ne v6, v7, :cond_4

    .line 40
    .line 41
    new-instance v6, Ldefpackage/nj4;

    .line 42
    .line 43
    invoke-direct {v6, v5}, Ldefpackage/nj4;-><init>(Ldefpackage/mj4;)V

    .line 44
    .line 45
    .line 46
    invoke-static {v6}, Ldefpackage/fa4;->b0(Ljava/util/Iterator;)Ldefpackage/aa4;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    check-cast v6, Ldefpackage/gb0;

    .line 51
    .line 52
    invoke-virtual {v6}, Ldefpackage/gb0;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    :cond_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    if-eqz v7, :cond_3

    .line 61
    .line 62
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    check-cast v7, Ljava/lang/Number;

    .line 67
    .line 68
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    invoke-virtual {v5, v7}, Ldefpackage/mj4;->b(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v8

    .line 76
    invoke-virtual {v2, v7}, Ldefpackage/mj4;->b(I)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    invoke-static {v8, v7}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v7

    .line 84
    if-nez v7, :cond_2

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_3
    move v2, v0

    .line 88
    goto :goto_1

    .line 89
    :cond_4
    :goto_0
    move v2, v1

    .line 90
    :goto_1
    iget-object v5, p0, Ldefpackage/r23;->t:Ljava/util/LinkedHashMap;

    .line 91
    .line 92
    invoke-interface {v5}, Ljava/util/Map;->size()I

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    invoke-interface {v3}, Ljava/util/Map;->size()I

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    if-ne v6, v7, :cond_6

    .line 101
    .line 102
    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    check-cast v5, Ljava/lang/Iterable;

    .line 107
    .line 108
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result v6

    .line 119
    if-eqz v6, :cond_5

    .line 120
    .line 121
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    check-cast v6, Ljava/util/Map$Entry;

    .line 126
    .line 127
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    invoke-interface {v3, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v7

    .line 135
    if-eqz v7, :cond_6

    .line 136
    .line 137
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v7

    .line 141
    invoke-virtual {v3, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v7

    .line 145
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    invoke-static {v7, v6}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v6

    .line 153
    if-eqz v6, :cond_6

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_5
    move v3, v0

    .line 157
    goto :goto_3

    .line 158
    :cond_6
    move v3, v1

    .line 159
    :goto_3
    iget v5, p0, Ldefpackage/r23;->u:I

    .line 160
    .line 161
    iget v6, p1, Ldefpackage/r23;->u:I

    .line 162
    .line 163
    if-ne v5, v6, :cond_7

    .line 164
    .line 165
    iget-object p0, p0, Ldefpackage/r23;->v:Ljava/lang/String;

    .line 166
    .line 167
    iget-object p1, p1, Ldefpackage/r23;->v:Ljava/lang/String;

    .line 168
    .line 169
    invoke-static {p0, p1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result p0

    .line 173
    if-eqz p0, :cond_7

    .line 174
    .line 175
    if-eqz v4, :cond_7

    .line 176
    .line 177
    if-eqz v2, :cond_7

    .line 178
    .line 179
    if-eqz v3, :cond_7

    .line 180
    .line 181
    :goto_4
    return v0

    .line 182
    :cond_7
    :goto_5
    return v1
.end method

.method public f(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Ldefpackage/zs3;->e:[I

    .line 6
    .line 7
    invoke-virtual {v0, p2, v1}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x2

    .line 15
    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const/4 v0, 0x1

    .line 20
    const/4 v1, 0x0

    .line 21
    const/4 v3, 0x0

    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    iput v1, p0, Ldefpackage/r23;->u:I

    .line 25
    .line 26
    iput-object v3, p0, Ldefpackage/r23;->p:Ljava/lang/String;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-static {v2}, Ldefpackage/qm4;->u0(Ljava/lang/CharSequence;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-nez v4, :cond_3

    .line 34
    .line 35
    const-string v4, "android-app://androidx.navigation/"

    .line 36
    .line 37
    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    new-instance v5, Ldefpackage/n23;

    .line 42
    .line 43
    invoke-direct {v5, v4, v3, v3}, Ldefpackage/n23;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    new-instance v6, Ldefpackage/q23;

    .line 47
    .line 48
    invoke-direct {v6, v5, v0}, Ldefpackage/q23;-><init>(Ldefpackage/n23;I)V

    .line 49
    .line 50
    .line 51
    iget-object v5, p0, Ldefpackage/r23;->t:Ljava/util/LinkedHashMap;

    .line 52
    .line 53
    invoke-static {v5, v6}, Ldefpackage/ud3;->b0(Ljava/util/Map;Ldefpackage/if1;)Ljava/util/ArrayList;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    if-eqz v5, :cond_2

    .line 62
    .line 63
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    iput v4, p0, Ldefpackage/r23;->u:I

    .line 68
    .line 69
    iput-object v3, p0, Ldefpackage/r23;->p:Ljava/lang/String;

    .line 70
    .line 71
    :goto_0
    iput-object v2, p0, Ldefpackage/r23;->v:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eqz v2, :cond_1

    .line 78
    .line 79
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    iput v0, p0, Ldefpackage/r23;->u:I

    .line 84
    .line 85
    iput-object v3, p0, Ldefpackage/r23;->p:Ljava/lang/String;

    .line 86
    .line 87
    invoke-static {p1, v0}, Ldefpackage/ya4;->v(Landroid/content/Context;I)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    iput-object p1, p0, Ldefpackage/r23;->p:Ljava/lang/String;

    .line 92
    .line 93
    :cond_1
    invoke-virtual {p2, v1}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    iput-object p1, p0, Ldefpackage/r23;->q:Ljava/lang/CharSequence;

    .line 98
    .line 99
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :cond_2
    const-string v3, "\" for destination "

    .line 104
    .line 105
    const-string v5, ". Following required arguments are missing: "

    .line 106
    .line 107
    const-string v1, "Cannot set route \""

    .line 108
    .line 109
    move-object v4, p0

    .line 110
    invoke-static/range {v1 .. v6}, Ldefpackage/nz2;->q(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :cond_3
    const-string p0, "Cannot have an empty route"

    .line 115
    .line 116
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    return-void
.end method

.method public hashCode()I
    .locals 9

    .line 1
    iget v0, p0, Ldefpackage/r23;->u:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    mul-int/2addr v0, v1

    .line 6
    iget-object v2, p0, Ldefpackage/r23;->v:Ljava/lang/String;

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v2, v3

    .line 17
    :goto_0
    add-int/2addr v0, v2

    .line 18
    iget-object v2, p0, Ldefpackage/r23;->r:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    move v5, v3

    .line 25
    :goto_1
    if-ge v5, v4, :cond_4

    .line 26
    .line 27
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    add-int/lit8 v5, v5, 0x1

    .line 32
    .line 33
    check-cast v6, Ldefpackage/n23;

    .line 34
    .line 35
    mul-int/lit8 v0, v0, 0x1f

    .line 36
    .line 37
    iget-object v7, v6, Ldefpackage/n23;->a:Ljava/lang/String;

    .line 38
    .line 39
    if-eqz v7, :cond_1

    .line 40
    .line 41
    invoke-virtual {v7}, Ljava/lang/Object;->hashCode()I

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    goto :goto_2

    .line 46
    :cond_1
    move v7, v3

    .line 47
    :goto_2
    add-int/2addr v0, v7

    .line 48
    mul-int/2addr v0, v1

    .line 49
    iget-object v7, v6, Ldefpackage/n23;->b:Ljava/lang/String;

    .line 50
    .line 51
    if-eqz v7, :cond_2

    .line 52
    .line 53
    invoke-virtual {v7}, Ljava/lang/Object;->hashCode()I

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    goto :goto_3

    .line 58
    :cond_2
    move v7, v3

    .line 59
    :goto_3
    add-int/2addr v0, v7

    .line 60
    mul-int/2addr v0, v1

    .line 61
    iget-object v6, v6, Ldefpackage/n23;->c:Ljava/lang/String;

    .line 62
    .line 63
    if-eqz v6, :cond_3

    .line 64
    .line 65
    invoke-virtual {v6}, Ljava/lang/Object;->hashCode()I

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    goto :goto_4

    .line 70
    :cond_3
    move v6, v3

    .line 71
    :goto_4
    add-int/2addr v0, v6

    .line 72
    goto :goto_1

    .line 73
    :cond_4
    iget-object v2, p0, Ldefpackage/r23;->s:Ldefpackage/mj4;

    .line 74
    .line 75
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    move v4, v3

    .line 79
    :goto_5
    invoke-virtual {v2}, Ldefpackage/mj4;->e()I

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    if-ge v4, v5, :cond_5

    .line 84
    .line 85
    const/4 v5, 0x1

    .line 86
    goto :goto_6

    .line 87
    :cond_5
    move v5, v3

    .line 88
    :goto_6
    if-eqz v5, :cond_9

    .line 89
    .line 90
    add-int/lit8 v5, v4, 0x1

    .line 91
    .line 92
    invoke-virtual {v2, v4}, Ldefpackage/mj4;->f(I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    check-cast v4, Ldefpackage/y13;

    .line 97
    .line 98
    mul-int/lit8 v0, v0, 0x1f

    .line 99
    .line 100
    iget v6, v4, Ldefpackage/y13;->a:I

    .line 101
    .line 102
    add-int/2addr v0, v6

    .line 103
    mul-int/2addr v0, v1

    .line 104
    iget-object v6, v4, Ldefpackage/y13;->b:Ldefpackage/y23;

    .line 105
    .line 106
    if-eqz v6, :cond_6

    .line 107
    .line 108
    invoke-virtual {v6}, Ldefpackage/y23;->hashCode()I

    .line 109
    .line 110
    .line 111
    move-result v6

    .line 112
    goto :goto_7

    .line 113
    :cond_6
    move v6, v3

    .line 114
    :goto_7
    add-int/2addr v0, v6

    .line 115
    iget-object v6, v4, Ldefpackage/y13;->c:Landroid/os/Bundle;

    .line 116
    .line 117
    if-eqz v6, :cond_8

    .line 118
    .line 119
    invoke-virtual {v6}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    if-eqz v6, :cond_8

    .line 124
    .line 125
    check-cast v6, Ljava/lang/Iterable;

    .line 126
    .line 127
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    :goto_8
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v7

    .line 135
    if-eqz v7, :cond_8

    .line 136
    .line 137
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v7

    .line 141
    check-cast v7, Ljava/lang/String;

    .line 142
    .line 143
    mul-int/lit8 v0, v0, 0x1f

    .line 144
    .line 145
    iget-object v8, v4, Ldefpackage/y13;->c:Landroid/os/Bundle;

    .line 146
    .line 147
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v8, v7}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v7

    .line 154
    if-eqz v7, :cond_7

    .line 155
    .line 156
    invoke-virtual {v7}, Ljava/lang/Object;->hashCode()I

    .line 157
    .line 158
    .line 159
    move-result v7

    .line 160
    goto :goto_9

    .line 161
    :cond_7
    move v7, v3

    .line 162
    :goto_9
    add-int/2addr v0, v7

    .line 163
    goto :goto_8

    .line 164
    :cond_8
    move v4, v5

    .line 165
    goto :goto_5

    .line 166
    :cond_9
    iget-object p0, p0, Ldefpackage/r23;->t:Ljava/util/LinkedHashMap;

    .line 167
    .line 168
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    check-cast v2, Ljava/lang/Iterable;

    .line 173
    .line 174
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 179
    .line 180
    .line 181
    move-result v4

    .line 182
    if-eqz v4, :cond_b

    .line 183
    .line 184
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    check-cast v4, Ljava/lang/String;

    .line 189
    .line 190
    mul-int/lit8 v0, v0, 0x1f

    .line 191
    .line 192
    invoke-static {v4, v0, v1}, Ldefpackage/f34;->e(Ljava/lang/String;II)I

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    invoke-virtual {p0, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    if-eqz v4, :cond_a

    .line 201
    .line 202
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 203
    .line 204
    .line 205
    move-result v4

    .line 206
    goto :goto_b

    .line 207
    :cond_a
    move v4, v3

    .line 208
    :goto_b
    add-int/2addr v0, v4

    .line 209
    goto :goto_a

    .line 210
    :cond_b
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, "("

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Ldefpackage/r23;->p:Ljava/lang/String;

    .line 23
    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    const-string v1, "0x"

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget v1, p0, Ldefpackage/r23;->u:I

    .line 32
    .line 33
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    :goto_0
    const-string v1, ")"

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, Ldefpackage/r23;->v:Ljava/lang/String;

    .line 50
    .line 51
    if-eqz v1, :cond_2

    .line 52
    .line 53
    invoke-static {v1}, Ldefpackage/qm4;->u0(Ljava/lang/CharSequence;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    const-string v1, " route="

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    iget-object v1, p0, Ldefpackage/r23;->v:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    :cond_2
    :goto_1
    iget-object v1, p0, Ldefpackage/r23;->q:Ljava/lang/CharSequence;

    .line 71
    .line 72
    if-eqz v1, :cond_3

    .line 73
    .line 74
    const-string v1, " label="

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    iget-object p0, p0, Ldefpackage/r23;->q:Ljava/lang/CharSequence;

    .line 80
    .line 81
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    return-object p0
.end method
