.class public Ldefpackage/rd1;
.super Ldefpackage/t43;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldefpackage/rd1$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ldefpackage/t43;"
    }
.end annotation

.annotation runtime Ldefpackage/s43;
    value = "fragment"
.end annotation


# instance fields
.field public final c:Landroid/content/Context;

.field public final d:Ldefpackage/ld1;

.field public final e:I

.field public final f:Ljava/util/LinkedHashSet;

.field public final g:Ljava/util/ArrayList;

.field public final h:Ldefpackage/pd1;

.field public final i:Ldefpackage/ir0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ldefpackage/ld1;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/rd1;->c:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/rd1;->d:Ldefpackage/ld1;

    .line 7
    .line 8
    iput p3, p0, Ldefpackage/rd1;->e:I

    .line 9
    .line 10
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 11
    .line 12
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Ldefpackage/rd1;->f:Ljava/util/LinkedHashSet;

    .line 16
    .line 17
    new-instance p1, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Ldefpackage/rd1;->g:Ljava/util/ArrayList;

    .line 23
    .line 24
    new-instance p1, Ldefpackage/pd1;

    .line 25
    .line 26
    const/4 p2, 0x0

    .line 27
    invoke-direct {p1, p2, p0}, Ldefpackage/pd1;-><init>(ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Ldefpackage/rd1;->h:Ldefpackage/pd1;

    .line 31
    .line 32
    new-instance p1, Ldefpackage/ir0;

    .line 33
    .line 34
    const/4 p2, 0x1

    .line 35
    invoke-direct {p1, p2, p0}, Ldefpackage/ir0;-><init>(ILjava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Ldefpackage/rd1;->i:Ldefpackage/ir0;

    .line 39
    .line 40
    return-void
.end method

.method public static k(Ldefpackage/rd1;Ljava/lang/String;I)V
    .locals 3

    .line 1
    and-int/lit8 v0, p2, 0x2

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    move v0, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v1

    .line 10
    :goto_0
    and-int/lit8 p2, p2, 0x4

    .line 11
    .line 12
    if-eqz p2, :cond_1

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    move v1, v2

    .line 16
    :goto_1
    iget-object p0, p0, Ldefpackage/rd1;->g:Ljava/util/ArrayList;

    .line 17
    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    new-instance p2, Ldefpackage/td1;

    .line 21
    .line 22
    invoke-direct {p2, v2, p1}, Ldefpackage/td1;-><init>(ILjava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-static {p0, p2}, Ldefpackage/v40;->p0(Ljava/util/List;Ldefpackage/if1;)Z

    .line 26
    .line 27
    .line 28
    :cond_2
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    new-instance v0, Ldefpackage/kd3;

    .line 33
    .line 34
    invoke-direct {v0, p1, p2}, Ldefpackage/kd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public static n()Z
    .locals 2

    .line 1
    const-string v0, "FragmentManager"

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-static {v0, v1}, Landroid/util/Ldefpackage/og;->isLoggable(Ljava/lang/String;I)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    const-string v0, "FragmentNavigator"

    .line 11
    .line 12
    invoke-static {v0, v1}, Landroid/util/Ldefpackage/og;->isLoggable(Ljava/lang/String;I)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0

    .line 21
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 22
    return v0
.end method


# virtual methods
.method public final a()Ldefpackage/r23;
    .locals 1

    .line 1
    new-instance v0, Ldefpackage/sd1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ldefpackage/r23;-><init>(Ldefpackage/t43;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final d(Ljava/util/List;Ldefpackage/y23;)V
    .locals 8

    .line 1
    iget-object v0, p0, Ldefpackage/rd1;->d:Ldefpackage/ld1;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldefpackage/ld1;->N()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const-string v2, "FragmentNavigator"

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const-string p0, "Ignoring navigate() call: FragmentManager has already saved its state"

    .line 12
    .line 13
    invoke-static {v2, p0}, Landroid/util/Ldefpackage/og;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_5

    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Ldefpackage/a23;

    .line 32
    .line 33
    invoke-virtual {p0}, Ldefpackage/t43;->b()Ldefpackage/d23;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    iget-object v3, v3, Ldefpackage/d23;->e:Ldefpackage/vu3;

    .line 38
    .line 39
    iget-object v3, v3, Ldefpackage/vu3;->n:Ldefpackage/nl4;

    .line 40
    .line 41
    invoke-virtual {v3}, Ldefpackage/nl4;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    check-cast v3, Ljava/util/List;

    .line 46
    .line 47
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    const/4 v4, 0x0

    .line 52
    if-eqz p2, :cond_1

    .line 53
    .line 54
    if-nez v3, :cond_1

    .line 55
    .line 56
    iget-boolean v5, p2, Ldefpackage/y23;->b:Z

    .line 57
    .line 58
    if-eqz v5, :cond_1

    .line 59
    .line 60
    iget-object v5, p0, Ldefpackage/rd1;->f:Ljava/util/LinkedHashSet;

    .line 61
    .line 62
    iget-object v6, v1, Ldefpackage/a23;->s:Ljava/lang/String;

    .line 63
    .line 64
    invoke-interface {v5, v6}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    if-eqz v5, :cond_1

    .line 69
    .line 70
    iget-object v3, v1, Ldefpackage/a23;->s:Ljava/lang/String;

    .line 71
    .line 72
    new-instance v5, Ldefpackage/kd1;

    .line 73
    .line 74
    invoke-direct {v5, v0, v3, v4}, Ldefpackage/kd1;-><init>(Ldefpackage/ld1;Ljava/lang/String;I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v5, v4}, Ldefpackage/ld1;->w(Ldefpackage/id1;Z)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Ldefpackage/t43;->b()Ldefpackage/d23;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-virtual {v3, v1}, Ldefpackage/d23;->h(Ldefpackage/a23;)V

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_1
    invoke-virtual {p0, v1, p2}, Ldefpackage/rd1;->m(Ldefpackage/a23;Ldefpackage/y23;)Ldefpackage/po;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    iget-object v6, v1, Ldefpackage/a23;->s:Ljava/lang/String;

    .line 93
    .line 94
    if-nez v3, :cond_3

    .line 95
    .line 96
    invoke-virtual {p0}, Ldefpackage/t43;->b()Ldefpackage/d23;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    iget-object v3, v3, Ldefpackage/d23;->e:Ldefpackage/vu3;

    .line 101
    .line 102
    iget-object v3, v3, Ldefpackage/vu3;->n:Ldefpackage/nl4;

    .line 103
    .line 104
    invoke-virtual {v3}, Ldefpackage/nl4;->getValue()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    check-cast v3, Ljava/util/List;

    .line 109
    .line 110
    invoke-static {v3}, Ldefpackage/q40;->D0(Ljava/util/List;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    check-cast v3, Ldefpackage/a23;

    .line 115
    .line 116
    const/4 v7, 0x6

    .line 117
    if-eqz v3, :cond_2

    .line 118
    .line 119
    iget-object v3, v3, Ldefpackage/a23;->s:Ljava/lang/String;

    .line 120
    .line 121
    invoke-static {p0, v3, v7}, Ldefpackage/rd1;->k(Ldefpackage/rd1;Ljava/lang/String;I)V

    .line 122
    .line 123
    .line 124
    :cond_2
    invoke-static {p0, v6, v7}, Ldefpackage/rd1;->k(Ldefpackage/rd1;Ljava/lang/String;I)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v5, v6}, Ldefpackage/po;->c(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    :cond_3
    invoke-virtual {v5, v4}, Ldefpackage/po;->e(Z)I

    .line 131
    .line 132
    .line 133
    invoke-static {}, Ldefpackage/rd1;->n()Z

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    if-eqz v3, :cond_4

    .line 138
    .line 139
    new-instance v3, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    const-string v4, "Calling pushWithTransition via navigate() on entry "

    .line 142
    .line 143
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    invoke-static {v2, v3}, Landroid/util/Ldefpackage/og;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 154
    .line 155
    .line 156
    :cond_4
    invoke-virtual {p0}, Ldefpackage/t43;->b()Ldefpackage/d23;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    invoke-virtual {v3, v1}, Ldefpackage/d23;->h(Ldefpackage/a23;)V

    .line 161
    .line 162
    .line 163
    goto/16 :goto_0

    .line 164
    .line 165
    :cond_5
    return-void
.end method

.method public final e(Ldefpackage/d23;)V
    .locals 3

    .line 1
    iput-object p1, p0, Ldefpackage/t43;->a:Ldefpackage/d23;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Ldefpackage/t43;->b:Z

    .line 5
    .line 6
    invoke-static {}, Ldefpackage/rd1;->n()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const-string v0, "FragmentNavigator"

    .line 13
    .line 14
    const-string v1, "onAttach"

    .line 15
    .line 16
    invoke-static {v0, v1}, Landroid/util/Ldefpackage/og;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    :cond_0
    new-instance v0, Ldefpackage/qd1;

    .line 20
    .line 21
    invoke-direct {v0, p1, p0}, Ldefpackage/qd1;-><init>(Ldefpackage/d23;Ldefpackage/rd1;)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Ldefpackage/rd1;->d:Ldefpackage/ld1;

    .line 25
    .line 26
    iget-object v2, v1, Ldefpackage/ld1;->o:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 27
    .line 28
    invoke-virtual {v2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    new-instance v0, Ldefpackage/vd1;

    .line 32
    .line 33
    invoke-direct {v0, p1, p0}, Ldefpackage/vd1;-><init>(Ldefpackage/d23;Ldefpackage/rd1;)V

    .line 34
    .line 35
    .line 36
    iget-object p0, v1, Ldefpackage/ld1;->m:Ljava/util/ArrayList;

    .line 37
    .line 38
    if-nez p0, :cond_1

    .line 39
    .line 40
    new-instance p0, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object p0, v1, Ldefpackage/ld1;->m:Ljava/util/ArrayList;

    .line 46
    .line 47
    :cond_1
    iget-object p0, v1, Ldefpackage/ld1;->m:Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final f(Ldefpackage/a23;)V
    .locals 7

    .line 1
    iget-object v0, p1, Ldefpackage/a23;->s:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/rd1;->d:Ldefpackage/ld1;

    .line 4
    .line 5
    invoke-virtual {v1}, Ldefpackage/ld1;->N()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    const-string p0, "FragmentNavigator"

    .line 12
    .line 13
    const-string p1, "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state"

    .line 14
    .line 15
    invoke-static {p0, p1}, Landroid/util/Ldefpackage/og;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const/4 v2, 0x0

    .line 20
    invoke-virtual {p0, p1, v2}, Ldefpackage/rd1;->m(Ldefpackage/a23;Ldefpackage/y23;)Ldefpackage/po;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {p0}, Ldefpackage/t43;->b()Ldefpackage/d23;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    iget-object v3, v3, Ldefpackage/d23;->e:Ldefpackage/vu3;

    .line 29
    .line 30
    iget-object v3, v3, Ldefpackage/vu3;->n:Ldefpackage/nl4;

    .line 31
    .line 32
    invoke-virtual {v3}, Ldefpackage/nl4;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Ljava/util/List;

    .line 37
    .line 38
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    const/4 v5, 0x0

    .line 43
    const/4 v6, 0x1

    .line 44
    if-le v4, v6, :cond_2

    .line 45
    .line 46
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    const/4 v6, 0x2

    .line 51
    sub-int/2addr v4, v6

    .line 52
    invoke-static {v3, v4}, Ldefpackage/q40;->y0(Ljava/util/List;I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    check-cast v3, Ldefpackage/a23;

    .line 57
    .line 58
    if-eqz v3, :cond_1

    .line 59
    .line 60
    iget-object v3, v3, Ldefpackage/a23;->s:Ljava/lang/String;

    .line 61
    .line 62
    const/4 v4, 0x6

    .line 63
    invoke-static {p0, v3, v4}, Ldefpackage/rd1;->k(Ldefpackage/rd1;Ljava/lang/String;I)V

    .line 64
    .line 65
    .line 66
    :cond_1
    const/4 v3, 0x4

    .line 67
    invoke-static {p0, v0, v3}, Ldefpackage/rd1;->k(Ldefpackage/rd1;Ljava/lang/String;I)V

    .line 68
    .line 69
    .line 70
    new-instance v3, Ldefpackage/jd1;

    .line 71
    .line 72
    const/4 v4, -0x1

    .line 73
    invoke-direct {v3, v1, v0, v4}, Ldefpackage/jd1;-><init>(Ldefpackage/ld1;Ljava/lang/String;I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, v3, v5}, Ldefpackage/ld1;->w(Ldefpackage/id1;Z)V

    .line 77
    .line 78
    .line 79
    invoke-static {p0, v0, v6}, Ldefpackage/rd1;->k(Ldefpackage/rd1;Ljava/lang/String;I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v0}, Ldefpackage/po;->c(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    :cond_2
    invoke-virtual {v2, v5}, Ldefpackage/po;->e(Z)I

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Ldefpackage/t43;->b()Ldefpackage/d23;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-virtual {p0, p1}, Ldefpackage/d23;->c(Ldefpackage/a23;)V

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method public final g(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const-string v0, "androidx-nav-fragment:navigator:savedIds"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Ldefpackage/rd1;->f:Ljava/util/LinkedHashSet;

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/Set;->clear()V

    .line 12
    .line 13
    .line 14
    invoke-static {p1, p0}, Ldefpackage/v40;->n0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final h()Landroid/os/Bundle;
    .locals 2

    .line 1
    iget-object p0, p0, Ldefpackage/rd1;->f:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Set;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return-object p0

    .line 11
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 14
    .line 15
    .line 16
    new-instance p0, Ldefpackage/kd3;

    .line 17
    .line 18
    const-string v1, "androidx-nav-fragment:navigator:savedIds"

    .line 19
    .line 20
    invoke-direct {p0, v1, v0}, Ldefpackage/kd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    filled-new-array {p0}, [Ldefpackage/kd3;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {p0}, Ldefpackage/fh0;->g([Ldefpackage/kd3;)Landroid/os/Bundle;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method public final i(Ldefpackage/a23;Z)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v3, v0, Ldefpackage/rd1;->d:Ldefpackage/ld1;

    .line 11
    .line 12
    invoke-virtual {v3}, Ldefpackage/ld1;->N()Z

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    const-string v5, "FragmentNavigator"

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    const-string v0, "Ignoring popBackStack() call: FragmentManager has already saved its state"

    .line 21
    .line 22
    invoke-static {v5, v0}, Landroid/util/Ldefpackage/og;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    invoke-virtual {v0}, Ldefpackage/t43;->b()Ldefpackage/d23;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    iget-object v4, v4, Ldefpackage/d23;->e:Ldefpackage/vu3;

    .line 31
    .line 32
    iget-object v4, v4, Ldefpackage/vu3;->n:Ldefpackage/nl4;

    .line 33
    .line 34
    invoke-virtual {v4}, Ldefpackage/nl4;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    check-cast v4, Ljava/util/List;

    .line 39
    .line 40
    invoke-interface {v4, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    invoke-interface {v4, v6, v7}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    invoke-static {v4}, Ldefpackage/q40;->w0(Ljava/util/List;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v8

    .line 56
    check-cast v8, Ldefpackage/a23;

    .line 57
    .line 58
    const/4 v9, 0x1

    .line 59
    sub-int/2addr v6, v9

    .line 60
    invoke-static {v4, v6}, Ldefpackage/q40;->y0(Ljava/util/List;I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    check-cast v4, Ldefpackage/a23;

    .line 65
    .line 66
    if-eqz v4, :cond_1

    .line 67
    .line 68
    iget-object v4, v4, Ldefpackage/a23;->s:Ljava/lang/String;

    .line 69
    .line 70
    const/4 v6, 0x6

    .line 71
    invoke-static {v0, v4, v6}, Ldefpackage/rd1;->k(Ldefpackage/rd1;Ljava/lang/String;I)V

    .line 72
    .line 73
    .line 74
    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    :cond_2
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result v10

    .line 87
    const/4 v12, 0x0

    .line 88
    if-eqz v10, :cond_7

    .line 89
    .line 90
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v10

    .line 94
    move-object v13, v10

    .line 95
    check-cast v13, Ldefpackage/a23;

    .line 96
    .line 97
    iget-object v14, v0, Ldefpackage/rd1;->g:Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    iget-object v15, v13, Ldefpackage/a23;->s:Ljava/lang/String;

    .line 103
    .line 104
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 105
    .line 106
    .line 107
    move-result-object v14

    .line 108
    :goto_1
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result v16

    .line 112
    if-eqz v16, :cond_5

    .line 113
    .line 114
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v16

    .line 118
    move-object/from16 v11, v16

    .line 119
    .line 120
    check-cast v11, Ldefpackage/kd3;

    .line 121
    .line 122
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    iget-object v11, v11, Ldefpackage/kd3;->n:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v11, Ljava/lang/String;

    .line 128
    .line 129
    if-ltz v12, :cond_4

    .line 130
    .line 131
    invoke-static {v15, v11}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v11

    .line 135
    if-eqz v11, :cond_3

    .line 136
    .line 137
    move v11, v12

    .line 138
    goto :goto_2

    .line 139
    :cond_3
    add-int/lit8 v12, v12, 0x1

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_4
    invoke-static {}, Ldefpackage/gb;->c0()V

    .line 143
    .line 144
    .line 145
    const/4 v0, 0x0

    .line 146
    throw v0

    .line 147
    :cond_5
    const/4 v11, -0x1

    .line 148
    :goto_2
    if-ltz v11, :cond_6

    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_6
    iget-object v11, v13, Ldefpackage/a23;->s:Ljava/lang/String;

    .line 152
    .line 153
    iget-object v12, v8, Ldefpackage/a23;->s:Ljava/lang/String;

    .line 154
    .line 155
    invoke-static {v11, v12}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v11

    .line 159
    if-nez v11, :cond_2

    .line 160
    .line 161
    :goto_3
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    goto :goto_0

    .line 165
    :cond_7
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 166
    .line 167
    .line 168
    move-result v6

    .line 169
    move v10, v12

    .line 170
    :goto_4
    if-ge v10, v6, :cond_8

    .line 171
    .line 172
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v11

    .line 176
    add-int/lit8 v10, v10, 0x1

    .line 177
    .line 178
    check-cast v11, Ldefpackage/a23;

    .line 179
    .line 180
    iget-object v11, v11, Ldefpackage/a23;->s:Ljava/lang/String;

    .line 181
    .line 182
    const/4 v13, 0x4

    .line 183
    invoke-static {v0, v11, v13}, Ldefpackage/rd1;->k(Ldefpackage/rd1;Ljava/lang/String;I)V

    .line 184
    .line 185
    .line 186
    goto :goto_4

    .line 187
    :cond_8
    if-eqz v2, :cond_a

    .line 188
    .line 189
    invoke-static {v7}, Ldefpackage/q40;->H0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 190
    .line 191
    .line 192
    move-result-object v4

    .line 193
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 194
    .line 195
    .line 196
    move-result-object v4

    .line 197
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 198
    .line 199
    .line 200
    move-result v6

    .line 201
    if-eqz v6, :cond_b

    .line 202
    .line 203
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v6

    .line 207
    check-cast v6, Ldefpackage/a23;

    .line 208
    .line 209
    invoke-static {v6, v8}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v7

    .line 213
    if-eqz v7, :cond_9

    .line 214
    .line 215
    new-instance v7, Ljava/lang/StringBuilder;

    .line 216
    .line 217
    const-string v10, "FragmentManager cannot save the state of the initial destination "

    .line 218
    .line 219
    invoke-direct {v7, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v6

    .line 229
    invoke-static {v5, v6}, Landroid/util/Ldefpackage/og;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 230
    .line 231
    .line 232
    goto :goto_5

    .line 233
    :cond_9
    iget-object v7, v6, Ldefpackage/a23;->s:Ljava/lang/String;

    .line 234
    .line 235
    new-instance v10, Ldefpackage/kd1;

    .line 236
    .line 237
    invoke-direct {v10, v3, v7, v9}, Ldefpackage/kd1;-><init>(Ldefpackage/ld1;Ljava/lang/String;I)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v3, v10, v12}, Ldefpackage/ld1;->w(Ldefpackage/id1;Z)V

    .line 241
    .line 242
    .line 243
    iget-object v7, v0, Ldefpackage/rd1;->f:Ljava/util/LinkedHashSet;

    .line 244
    .line 245
    iget-object v6, v6, Ldefpackage/a23;->s:Ljava/lang/String;

    .line 246
    .line 247
    invoke-interface {v7, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    goto :goto_5

    .line 251
    :cond_a
    iget-object v4, v1, Ldefpackage/a23;->s:Ljava/lang/String;

    .line 252
    .line 253
    new-instance v6, Ldefpackage/jd1;

    .line 254
    .line 255
    const/4 v7, -0x1

    .line 256
    invoke-direct {v6, v3, v4, v7}, Ldefpackage/jd1;-><init>(Ldefpackage/ld1;Ljava/lang/String;I)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v3, v6, v12}, Ldefpackage/ld1;->w(Ldefpackage/id1;Z)V

    .line 260
    .line 261
    .line 262
    :cond_b
    invoke-static {}, Ldefpackage/rd1;->n()Z

    .line 263
    .line 264
    .line 265
    move-result v3

    .line 266
    if-eqz v3, :cond_c

    .line 267
    .line 268
    new-instance v3, Ljava/lang/StringBuilder;

    .line 269
    .line 270
    const-string v4, "Calling popWithTransition via popBackStack() on entry "

    .line 271
    .line 272
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    const-string v4, " with savedState "

    .line 279
    .line 280
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v3

    .line 290
    invoke-static {v5, v3}, Landroid/util/Ldefpackage/og;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 291
    .line 292
    .line 293
    :cond_c
    invoke-virtual {v0}, Ldefpackage/t43;->b()Ldefpackage/d23;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    invoke-virtual {v0, v1, v2}, Ldefpackage/d23;->f(Ldefpackage/a23;Z)V

    .line 298
    .line 299
    .line 300
    return-void
.end method

.method public final l(Ldefpackage/kc1;Ldefpackage/a23;Ldefpackage/d23;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ldefpackage/kc1;->d()Ldefpackage/e75;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    const-class v2, Ldefpackage/rd1$a;

    .line 14
    .line 15
    invoke-static {v2}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-interface {v1, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-nez v4, :cond_1

    .line 24
    .line 25
    new-instance v4, Ldefpackage/z65;

    .line 26
    .line 27
    invoke-direct {v4, v3}, Ldefpackage/z65;-><init>(Ldefpackage/i30;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    new-instance v3, Ldefpackage/zy1;

    .line 41
    .line 42
    const/4 v4, 0x0

    .line 43
    new-array v4, v4, [Ldefpackage/z65;

    .line 44
    .line 45
    invoke-interface {v1, v4}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, [Ldefpackage/z65;

    .line 50
    .line 51
    array-length v4, v1

    .line 52
    invoke-static {v1, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, [Ldefpackage/z65;

    .line 57
    .line 58
    invoke-direct {v3, v1}, Ldefpackage/zy1;-><init>([Ldefpackage/z65;)V

    .line 59
    .line 60
    .line 61
    sget-object v1, Ldefpackage/sf0;->b:Ldefpackage/sf0;

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    new-instance v4, Ldefpackage/bq4;

    .line 67
    .line 68
    invoke-direct {v4, v0, v3, v1}, Ldefpackage/bq4;-><init>(Ldefpackage/e75;Ldefpackage/b75;Ldefpackage/tf0;)V

    .line 69
    .line 70
    .line 71
    invoke-static {v2}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {v0}, Ldefpackage/i30;->b()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    if-eqz v1, :cond_0

    .line 80
    .line 81
    const-string v2, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 82
    .line 83
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {v4, v0, v1}, Ldefpackage/bq4;->l(Ldefpackage/i30;Ljava/lang/String;)Ldefpackage/x65;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    check-cast v0, Ldefpackage/rd1$a;

    .line 92
    .line 93
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 94
    .line 95
    new-instance v2, Ldefpackage/gp;

    .line 96
    .line 97
    invoke-direct {v2, p2, p3, p0, p1}, Ldefpackage/gp;-><init>(Ldefpackage/a23;Ldefpackage/d23;Ldefpackage/rd1;Ldefpackage/kc1;)V

    .line 98
    .line 99
    .line 100
    invoke-direct {v1, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    iput-object v1, v0, Ldefpackage/rd1$a;->b:Ljava/lang/ref/WeakReference;

    .line 104
    .line 105
    return-void

    .line 106
    :cond_0
    const-string p0, "Local and anonymous classes can not be ViewModels"

    .line 107
    .line 108
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :cond_1
    invoke-virtual {v3}, Ldefpackage/i30;->b()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    const-string p1, "A `initializer` with the same `clazz` has already been added: "

    .line 117
    .line 118
    const-string p2, "."

    .line 119
    .line 120
    invoke-static {p1, p0, p2}, Ldefpackage/xa3;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    invoke-static {p0}, Ldefpackage/kf2;->e(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    return-void
.end method

.method public final m(Ldefpackage/a23;Ldefpackage/y23;)Ldefpackage/po;
    .locals 7

    .line 1
    iget-object v0, p1, Ldefpackage/a23;->o:Ldefpackage/r23;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    check-cast v0, Ldefpackage/sd1;

    .line 7
    .line 8
    invoke-virtual {p1}, Ldefpackage/a23;->c()Landroid/os/Bundle;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-object v0, v0, Ldefpackage/sd1;->x:Ljava/lang/String;

    .line 13
    .line 14
    if-eqz v0, :cond_b

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    const/16 v4, 0x2e

    .line 22
    .line 23
    iget-object v5, p0, Ldefpackage/rd1;->c:Landroid/content/Context;

    .line 24
    .line 25
    if-ne v3, v4, :cond_0

    .line 26
    .line 27
    new-instance v3, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    :cond_0
    iget-object v3, p0, Ldefpackage/rd1;->d:Ldefpackage/ld1;

    .line 47
    .line 48
    invoke-virtual {v3}, Ldefpackage/ld1;->F()Ldefpackage/dd1;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-virtual {v5}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v4, v0}, Ldefpackage/dd1;->a(Ljava/lang/String;)Ldefpackage/kc1;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ldefpackage/kc1;->c0(Landroid/os/Bundle;)V

    .line 63
    .line 64
    .line 65
    new-instance v1, Ldefpackage/po;

    .line 66
    .line 67
    invoke-direct {v1, v3}, Ldefpackage/po;-><init>(Ldefpackage/ld1;)V

    .line 68
    .line 69
    .line 70
    const/4 v3, -0x1

    .line 71
    if-eqz p2, :cond_1

    .line 72
    .line 73
    iget v4, p2, Ldefpackage/y23;->f:I

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    move v4, v3

    .line 77
    :goto_0
    if-eqz p2, :cond_2

    .line 78
    .line 79
    iget v5, p2, Ldefpackage/y23;->g:I

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    move v5, v3

    .line 83
    :goto_1
    if-eqz p2, :cond_3

    .line 84
    .line 85
    iget v6, p2, Ldefpackage/y23;->h:I

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_3
    move v6, v3

    .line 89
    :goto_2
    if-eqz p2, :cond_4

    .line 90
    .line 91
    iget p2, p2, Ldefpackage/y23;->i:I

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_4
    move p2, v3

    .line 95
    :goto_3
    if-ne v4, v3, :cond_5

    .line 96
    .line 97
    if-ne v5, v3, :cond_5

    .line 98
    .line 99
    if-ne v6, v3, :cond_5

    .line 100
    .line 101
    if-eq p2, v3, :cond_a

    .line 102
    .line 103
    :cond_5
    if-eq v4, v3, :cond_6

    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_6
    move v4, v2

    .line 107
    :goto_4
    if-eq v5, v3, :cond_7

    .line 108
    .line 109
    goto :goto_5

    .line 110
    :cond_7
    move v5, v2

    .line 111
    :goto_5
    if-eq v6, v3, :cond_8

    .line 112
    .line 113
    goto :goto_6

    .line 114
    :cond_8
    move v6, v2

    .line 115
    :goto_6
    if-eq p2, v3, :cond_9

    .line 116
    .line 117
    move v2, p2

    .line 118
    :cond_9
    iput v4, v1, Ldefpackage/po;->b:I

    .line 119
    .line 120
    iput v5, v1, Ldefpackage/po;->c:I

    .line 121
    .line 122
    iput v6, v1, Ldefpackage/po;->d:I

    .line 123
    .line 124
    iput v2, v1, Ldefpackage/po;->e:I

    .line 125
    .line 126
    :cond_a
    iget p0, p0, Ldefpackage/rd1;->e:I

    .line 127
    .line 128
    iget-object p1, p1, Ldefpackage/a23;->s:Ljava/lang/String;

    .line 129
    .line 130
    invoke-virtual {v1, p0, v0, p1}, Ldefpackage/po;->j(ILdefpackage/kc1;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1, v0}, Ldefpackage/po;->l(Ldefpackage/kc1;)V

    .line 134
    .line 135
    .line 136
    const/4 p0, 0x1

    .line 137
    iput-boolean p0, v1, Ldefpackage/po;->p:Z

    .line 138
    .line 139
    return-object v1

    .line 140
    :cond_b
    const-string p0, "Fragment class was not set"

    .line 141
    .line 142
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    const/4 p0, 0x0

    .line 146
    return-object p0
.end method
