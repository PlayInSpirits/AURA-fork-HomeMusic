.class public abstract Le54;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Lhh3;

.field public static final b:Lhh3;

.field public static final c:Lhh3;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lhh3;

    .line 2
    .line 3
    const/16 v1, 0x13

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lhh3;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Le54;->a:Lhh3;

    .line 9
    .line 10
    new-instance v0, Lhh3;

    .line 11
    .line 12
    const/16 v1, 0x14

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lhh3;-><init>(I)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Le54;->b:Lhh3;

    .line 18
    .line 19
    new-instance v0, Lhh3;

    .line 20
    .line 21
    const/16 v1, 0x15

    .line 22
    .line 23
    invoke-direct {v0, v1}, Lhh3;-><init>(I)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Le54;->c:Lhh3;

    .line 27
    .line 28
    return-void
.end method

.method public static final a(Lf03;)Lb54;
    .locals 7

    .line 1
    iget-object p0, p0, Ltf0;->a:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    sget-object v0, Le54;->a:Lhh3;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lj54;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_9

    .line 13
    .line 14
    sget-object v2, Le54;->b:Lhh3;

    .line 15
    .line 16
    invoke-virtual {p0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Lf75;

    .line 21
    .line 22
    if-eqz v2, :cond_8

    .line 23
    .line 24
    sget-object v3, Le54;->c:Lhh3;

    .line 25
    .line 26
    invoke-virtual {p0, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Landroid/os/Bundle;

    .line 31
    .line 32
    sget-object v4, Ld75;->a:Lz45;

    .line 33
    .line 34
    invoke-virtual {p0, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Ljava/lang/String;

    .line 39
    .line 40
    if-eqz p0, :cond_7

    .line 41
    .line 42
    invoke-interface {v0}, Lj54;->f()Lrm3;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    const-string v4, "androidx.lifecycle.internal.SavedStateHandlesProvider"

    .line 47
    .line 48
    invoke-virtual {v0, v4}, Lrm3;->G(Ljava/lang/String;)Li54;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    instance-of v4, v0, Lf54;

    .line 53
    .line 54
    if-eqz v4, :cond_0

    .line 55
    .line 56
    check-cast v0, Lf54;

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    move-object v0, v1

    .line 60
    :goto_0
    if-eqz v0, :cond_6

    .line 61
    .line 62
    invoke-static {v2}, Le54;->c(Lf75;)Lg54;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    iget-object v2, v2, Lg54;->b:Ljava/util/LinkedHashMap;

    .line 67
    .line 68
    invoke-virtual {v2, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    check-cast v4, Lb54;

    .line 73
    .line 74
    if-nez v4, :cond_5

    .line 75
    .line 76
    invoke-virtual {v0}, Lf54;->b()V

    .line 77
    .line 78
    .line 79
    iget-object v4, v0, Lf54;->c:Landroid/os/Bundle;

    .line 80
    .line 81
    if-nez v4, :cond_1

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_1
    invoke-virtual {v4, p0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    if-nez v5, :cond_2

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_2
    invoke-virtual {v4, p0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    if-nez v5, :cond_3

    .line 96
    .line 97
    const/4 v5, 0x0

    .line 98
    new-array v6, v5, [Lkd3;

    .line 99
    .line 100
    invoke-static {v6, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    check-cast v5, [Lkd3;

    .line 105
    .line 106
    invoke-static {v5}, Lfh0;->g([Lkd3;)Landroid/os/Bundle;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    :cond_3
    invoke-virtual {v4, p0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v4}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    if-eqz v4, :cond_4

    .line 118
    .line 119
    iput-object v1, v0, Lf54;->c:Landroid/os/Bundle;

    .line 120
    .line 121
    :cond_4
    move-object v1, v5

    .line 122
    :goto_1
    invoke-static {v1, v3}, Lya4;->j(Landroid/os/Bundle;Landroid/os/Bundle;)Lb54;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-interface {v2, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    return-object v0

    .line 130
    :cond_5
    return-object v4

    .line 131
    :cond_6
    const-string p0, "enableSavedStateHandles() wasn\'t called prior to createSavedStateHandle() call"

    .line 132
    .line 133
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    return-object v1

    .line 137
    :cond_7
    const-string p0, "CreationExtras must have a value by `VIEW_MODEL_KEY`"

    .line 138
    .line 139
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    return-object v1

    .line 143
    :cond_8
    const-string p0, "CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`"

    .line 144
    .line 145
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    return-object v1

    .line 149
    :cond_9
    const-string p0, "CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`"

    .line 150
    .line 151
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    return-object v1
.end method

.method public static final b(Lj54;)V
    .locals 4

    .line 1
    invoke-interface {p0}, Lba2;->h()Lea2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lea2;->h:Lr92;

    .line 6
    .line 7
    sget-object v1, Lr92;->o:Lr92;

    .line 8
    .line 9
    if-eq v0, v1, :cond_1

    .line 10
    .line 11
    sget-object v1, Lr92;->p:Lr92;

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v2, "Failed to enable `SavedStateHandle` for `"

    .line 19
    .line 20
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string p0, "`. The `Lifecycle.State` must be `INITIALIZED` or `CREATED`, but was `"

    .line 27
    .line 28
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string p0, "`. You must call `enableSavedStateHandles()` before the `Lifecycle.State` moves to `STARTED`."

    .line 35
    .line 36
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw v0

    .line 53
    :cond_1
    :goto_0
    invoke-interface {p0}, Lj54;->f()Lrm3;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    const-string v1, "androidx.lifecycle.internal.SavedStateHandlesProvider"

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Lrm3;->G(Ljava/lang/String;)Li54;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    if-nez v0, :cond_2

    .line 64
    .line 65
    new-instance v0, Lf54;

    .line 66
    .line 67
    invoke-interface {p0}, Lj54;->f()Lrm3;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    move-object v3, p0

    .line 72
    check-cast v3, Lf75;

    .line 73
    .line 74
    invoke-direct {v0, v2, v3}, Lf54;-><init>(Lrm3;Lf75;)V

    .line 75
    .line 76
    .line 77
    invoke-interface {p0}, Lj54;->f()Lrm3;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-virtual {v2, v1, v0}, Lrm3;->L(Ljava/lang/String;Li54;)V

    .line 82
    .line 83
    .line 84
    invoke-interface {p0}, Lba2;->h()Lea2;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    new-instance v1, Lvv3;

    .line 89
    .line 90
    const/4 v2, 0x6

    .line 91
    invoke-direct {v1, v2, v0}, Lvv3;-><init>(ILjava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0, v1}, Lea2;->a(Laa2;)V

    .line 95
    .line 96
    .line 97
    :cond_2
    return-void
.end method

.method public static final c(Lf75;)Lg54;
    .locals 3

    .line 1
    new-instance v0, Ld54;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lgh0;->q(Lf75;)Ltf0;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-interface {p0}, Lf75;->d()Le75;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    new-instance v2, Lbq4;

    .line 21
    .line 22
    invoke-direct {v2, p0, v0, v1}, Lbq4;-><init>(Le75;Lb75;Ltf0;)V

    .line 23
    .line 24
    .line 25
    const-class p0, Lg54;

    .line 26
    .line 27
    invoke-static {p0}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    const-string v0, "androidx.lifecycle.internal.SavedStateHandlesVM"

    .line 32
    .line 33
    invoke-virtual {v2, p0, v0}, Lbq4;->l(Li30;Ljava/lang/String;)Lx65;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    check-cast p0, Lg54;

    .line 38
    .line 39
    return-object p0
.end method
