.class public final Ldefpackage/mf4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/zj2;
.implements Ldefpackage/kg1;
.implements Lcom/eddyizm/tempus/interfaces/StarCallback;


# static fields
.field public static volatile r:Ldefpackage/mf4;


# instance fields
.field public final synthetic n:I

.field public o:Z

.field public p:Ljava/lang/Object;

.field public q:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/mf4;->n:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance p1, Ljava/lang/Object;

    .line 14
    .line 15
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Ldefpackage/mf4;->p:Ljava/lang/Object;

    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    new-instance p1, Ljava/util/WeakHashMap;

    .line 25
    .line 26
    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, Ldefpackage/mf4;->p:Ljava/lang/Object;

    .line 34
    .line 35
    new-instance p1, Ljava/util/HashSet;

    .line 36
    .line 37
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, Ldefpackage/mf4;->q:Ljava/lang/Object;

    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Ldefpackage/mf4;->n:I

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ldefpackage/mf4;->q:Ljava/lang/Object;

    .line 49
    new-instance v0, Ldefpackage/aj;

    invoke-direct {v0, p1}, Ldefpackage/aj;-><init>(Landroid/content/Context;)V

    .line 50
    new-instance p1, Ldefpackage/sd0;

    invoke-direct {p1, v0}, Ldefpackage/sd0;-><init>(Ljava/lang/Object;)V

    .line 51
    new-instance v0, Ldefpackage/kf4;

    invoke-direct {v0, p0}, Ldefpackage/kf4;-><init>(Ldefpackage/mf4;)V

    .line 52
    new-instance v1, Ldefpackage/ll;

    invoke-direct {v1, p1, v0}, Ldefpackage/ll;-><init>(Ldefpackage/sd0;Ldefpackage/kf4;)V

    .line 53
    iput-object v1, p0, Ldefpackage/mf4;->p:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldefpackage/d34;Lcom/eddyizm/tempus/subsonic/models/Child;Z)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, Ldefpackage/mf4;->n:I

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    iput-object p1, p0, Ldefpackage/mf4;->p:Ljava/lang/Object;

    iput-object p2, p0, Ldefpackage/mf4;->q:Ljava/lang/Object;

    iput-boolean p3, p0, Ldefpackage/mf4;->o:Z

    return-void
.end method

.method public constructor <init>(Ljava/util/Map;ZLjava/util/List;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Ldefpackage/mf4;->n:I

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Ldefpackage/mf4;->p:Ljava/lang/Object;

    .line 45
    iput-boolean p2, p0, Ldefpackage/mf4;->o:Z

    .line 46
    iput-object p3, p0, Ldefpackage/mf4;->q:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldefpackage/s63;Ldefpackage/vl2;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Ldefpackage/mf4;->n:I

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    iput-object p1, p0, Ldefpackage/mf4;->p:Ljava/lang/Object;

    .line 62
    iput-object p2, p0, Ldefpackage/mf4;->q:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldefpackage/xk;Ldefpackage/xk;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ldefpackage/mf4;->n:I

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput-object p1, p0, Ldefpackage/mf4;->p:Ljava/lang/Object;

    .line 56
    iput-object p2, p0, Ldefpackage/mf4;->q:Ljava/lang/Object;

    .line 57
    iput-boolean v0, p0, Ldefpackage/mf4;->o:Z

    return-void
.end method

.method public static b(Ljava/lang/Class;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getModifiers()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isInterface(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-string v0, "Interfaces can\'t be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: "

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_0
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    const-string v0, "Abstract classes can\'t be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: "

    .line 33
    .line 34
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :cond_1
    const/4 p0, 0x0

    .line 40
    return-object p0
.end method

.method public static f(Landroid/content/Context;)Ldefpackage/mf4;
    .locals 2

    .line 1
    sget-object v0, Ldefpackage/mf4;->r:Ldefpackage/mf4;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Ldefpackage/mf4;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Ldefpackage/mf4;->r:Ldefpackage/mf4;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Ldefpackage/mf4;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-direct {v1, p0}, Ldefpackage/mf4;-><init>(Landroid/content/Context;)V

    .line 19
    .line 20
    .line 21
    sput-object v1, Ldefpackage/mf4;->r:Ldefpackage/mf4;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    :goto_0
    monitor-exit v0

    .line 27
    goto :goto_2

    .line 28
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    throw p0

    .line 30
    :cond_1
    :goto_2
    sget-object p0, Ldefpackage/mf4;->r:Ldefpackage/mf4;

    .line 31
    .line 32
    return-object p0
.end method


# virtual methods
.method public bridge synthetic a(Ldefpackage/ml3;)Ldefpackage/ak2;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ldefpackage/mf4;->d(Ldefpackage/ml3;)Ldefpackage/yk;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public c(Ldefpackage/pz3;)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-object v1, p0, Ldefpackage/mf4;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/Set;

    .line 8
    .line 9
    invoke-interface {v1, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-object p0, p0, Ldefpackage/mf4;->q:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Ljava/util/HashSet;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-nez p0, :cond_2

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 v0, 0x0

    .line 27
    :cond_2
    :goto_0
    if-eqz v0, :cond_3

    .line 28
    .line 29
    invoke-interface {p1}, Ldefpackage/pz3;->clear()V

    .line 30
    .line 31
    .line 32
    :cond_3
    return v0
.end method

.method public d(Ldefpackage/ml3;)Ldefpackage/yk;
    .locals 6

    .line 1
    const-string v0, "createCodec:"

    .line 2
    .line 3
    iget-object v1, p1, Ldefpackage/ml3;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ldefpackage/dk2;

    .line 6
    .line 7
    iget-object v1, v1, Ldefpackage/dk2;->a:Ljava/lang/String;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    :try_start_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v1}, Landroid/media/MediaCodec;->createByCodecName(Ljava/lang/String;)Landroid/media/MediaCodec;

    .line 26
    .line 27
    .line 28
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 29
    :try_start_1
    iget-boolean v1, p0, Ldefpackage/mf4;->o:Z

    .line 30
    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 34
    .line 35
    const/16 v3, 0x24

    .line 36
    .line 37
    if-lt v1, v3, :cond_0

    .line 38
    .line 39
    new-instance v1, Ldefpackage/pz1;

    .line 40
    .line 41
    const/16 v3, 0x1b

    .line 42
    .line 43
    invoke-direct {v1, v3, v0}, Ldefpackage/pz1;-><init>(ILjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    const/4 v3, 0x4

    .line 47
    goto :goto_0

    .line 48
    :catch_0
    move-exception p0

    .line 49
    goto :goto_2

    .line 50
    :cond_0
    new-instance v1, Ldefpackage/bl;

    .line 51
    .line 52
    iget-object v3, p0, Ldefpackage/mf4;->q:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v3, Ldefpackage/xk;

    .line 55
    .line 56
    invoke-virtual {v3}, Ldefpackage/xk;->get()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    check-cast v3, Landroid/os/HandlerThread;

    .line 61
    .line 62
    invoke-direct {v1, v0, v3}, Ldefpackage/bl;-><init>(Landroid/media/MediaCodec;Landroid/os/HandlerThread;)V

    .line 63
    .line 64
    .line 65
    const/4 v3, 0x0

    .line 66
    :goto_0
    new-instance v4, Ldefpackage/yk;

    .line 67
    .line 68
    iget-object p0, p0, Ldefpackage/mf4;->p:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p0, Ldefpackage/xk;

    .line 71
    .line 72
    invoke-virtual {p0}, Ldefpackage/xk;->get()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    check-cast p0, Landroid/os/HandlerThread;

    .line 77
    .line 78
    iget-object v5, p1, Ldefpackage/ml3;->f:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v5, Ldefpackage/ns3;

    .line 81
    .line 82
    invoke-direct {v4, v0, p0, v1, v5}, Ldefpackage/yk;-><init>(Landroid/media/MediaCodec;Landroid/os/HandlerThread;Ldefpackage/ck2;Ldefpackage/ns3;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 83
    .line 84
    .line 85
    :try_start_2
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 86
    .line 87
    .line 88
    iget-object p0, p1, Ldefpackage/ml3;->d:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast p0, Landroid/view/Surface;

    .line 91
    .line 92
    if-nez p0, :cond_1

    .line 93
    .line 94
    iget-object v1, p1, Ldefpackage/ml3;->a:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v1, Ldefpackage/dk2;

    .line 97
    .line 98
    iget-boolean v1, v1, Ldefpackage/dk2;->h:Z

    .line 99
    .line 100
    if-eqz v1, :cond_1

    .line 101
    .line 102
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 103
    .line 104
    const/16 v2, 0x23

    .line 105
    .line 106
    if-lt v1, v2, :cond_1

    .line 107
    .line 108
    or-int/lit8 v3, v3, 0x8

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :catch_1
    move-exception p0

    .line 112
    move-object v2, v4

    .line 113
    goto :goto_2

    .line 114
    :cond_1
    :goto_1
    iget-object v1, p1, Ldefpackage/ml3;->b:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v1, Landroid/media/MediaFormat;

    .line 117
    .line 118
    iget-object p1, p1, Ldefpackage/ml3;->e:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast p1, Landroid/media/MediaCrypto;

    .line 121
    .line 122
    invoke-static {v4, v1, p0, p1, v3}, Ldefpackage/yk;->b(Ldefpackage/yk;Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 123
    .line 124
    .line 125
    return-object v4

    .line 126
    :catch_2
    move-exception p0

    .line 127
    move-object v0, v2

    .line 128
    :goto_2
    if-nez v2, :cond_2

    .line 129
    .line 130
    if-eqz v0, :cond_3

    .line 131
    .line 132
    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    .line 133
    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_2
    invoke-virtual {v2}, Ldefpackage/yk;->a()V

    .line 137
    .line 138
    .line 139
    :cond_3
    :goto_3
    throw p0
.end method

.method public e(Lcom/google/gson/reflect/TypeToken;)Ldefpackage/o73;
    .locals 7

    .line 1
    invoke-virtual {p1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v1, p0, Ldefpackage/mf4;->p:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Ljava/util/Map;

    .line 12
    .line 13
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const/4 v3, 0x0

    .line 18
    if-nez v2, :cond_13

    .line 19
    .line 20
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-nez v1, :cond_12

    .line 25
    .line 26
    const-class v1, Ljava/util/EnumSet;

    .line 27
    .line 28
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    new-instance v1, Ldefpackage/d34;

    .line 35
    .line 36
    const/16 v2, 0x11

    .line 37
    .line 38
    invoke-direct {v1, v2, v0}, Ldefpackage/d34;-><init>(ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const-class v1, Ljava/util/EnumMap;

    .line 43
    .line 44
    if-ne p1, v1, :cond_1

    .line 45
    .line 46
    new-instance v1, Ldefpackage/zh0;

    .line 47
    .line 48
    const/16 v2, 0x10

    .line 49
    .line 50
    invoke-direct {v1, v2, v0}, Ldefpackage/zh0;-><init>(ILjava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    move-object v1, v3

    .line 55
    :goto_0
    if-eqz v1, :cond_2

    .line 56
    .line 57
    return-object v1

    .line 58
    :cond_2
    iget-object v1, p0, Ldefpackage/mf4;->q:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v1, Ljava/util/List;

    .line 61
    .line 62
    invoke-static {v1}, Ldefpackage/fu;->x(Ljava/util/List;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/Class;->getModifiers()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_3

    .line 74
    .line 75
    :catch_0
    move-object v1, v3

    .line 76
    goto :goto_2

    .line 77
    :cond_3
    :try_start_0
    invoke-virtual {p1, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 78
    .line 79
    .line 80
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 81
    sget-object v2, Ldefpackage/ox3;->a:Ldefpackage/hw;

    .line 82
    .line 83
    const/4 v2, 0x1

    .line 84
    :try_start_1
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 85
    .line 86
    .line 87
    move-object v4, v3

    .line 88
    goto :goto_1

    .line 89
    :catch_1
    move-exception v4

    .line 90
    new-instance v5, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    const-string v6, "Failed making constructor \'"

    .line 93
    .line 94
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-static {v1}, Ldefpackage/ox3;->b(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string v6, "\' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: "

    .line 105
    .line 106
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    :goto_1
    if-eqz v4, :cond_4

    .line 121
    .line 122
    new-instance v1, Ldefpackage/uc0;

    .line 123
    .line 124
    invoke-direct {v1, v2, v4}, Ldefpackage/uc0;-><init>(ILjava/lang/String;)V

    .line 125
    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_4
    new-instance v2, Ldefpackage/zg5;

    .line 129
    .line 130
    invoke-direct {v2, v1}, Ldefpackage/zg5;-><init>(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    move-object v1, v2

    .line 134
    :goto_2
    if-eqz v1, :cond_5

    .line 135
    .line 136
    return-object v1

    .line 137
    :cond_5
    const-class v1, Ljava/util/Collection;

    .line 138
    .line 139
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    const/4 v2, 0x0

    .line 144
    if-eqz v1, :cond_9

    .line 145
    .line 146
    const-class v0, Ljava/util/SortedSet;

    .line 147
    .line 148
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    if-eqz v0, :cond_6

    .line 153
    .line 154
    new-instance v3, Ldefpackage/i80;

    .line 155
    .line 156
    const/4 v0, 0x5

    .line 157
    invoke-direct {v3, v0}, Ldefpackage/i80;-><init>(I)V

    .line 158
    .line 159
    .line 160
    goto/16 :goto_3

    .line 161
    .line 162
    :cond_6
    const-class v0, Ljava/util/Set;

    .line 163
    .line 164
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-eqz v0, :cond_7

    .line 169
    .line 170
    new-instance v3, Ldefpackage/i80;

    .line 171
    .line 172
    const/4 v0, 0x6

    .line 173
    invoke-direct {v3, v0}, Ldefpackage/i80;-><init>(I)V

    .line 174
    .line 175
    .line 176
    goto/16 :goto_3

    .line 177
    .line 178
    :cond_7
    const-class v0, Ljava/util/Queue;

    .line 179
    .line 180
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    if-eqz v0, :cond_8

    .line 185
    .line 186
    new-instance v3, Ldefpackage/i80;

    .line 187
    .line 188
    const/4 v0, 0x7

    .line 189
    invoke-direct {v3, v0}, Ldefpackage/i80;-><init>(I)V

    .line 190
    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_8
    new-instance v3, Ldefpackage/i80;

    .line 194
    .line 195
    const/16 v0, 0x8

    .line 196
    .line 197
    invoke-direct {v3, v0}, Ldefpackage/i80;-><init>(I)V

    .line 198
    .line 199
    .line 200
    goto :goto_3

    .line 201
    :cond_9
    const-class v1, Ljava/util/Map;

    .line 202
    .line 203
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    if-eqz v1, :cond_e

    .line 208
    .line 209
    const-class v1, Ljava/util/concurrent/ConcurrentNavigableMap;

    .line 210
    .line 211
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    if-eqz v1, :cond_a

    .line 216
    .line 217
    new-instance v3, Ldefpackage/i80;

    .line 218
    .line 219
    const/16 v0, 0x9

    .line 220
    .line 221
    invoke-direct {v3, v0}, Ldefpackage/i80;-><init>(I)V

    .line 222
    .line 223
    .line 224
    goto :goto_3

    .line 225
    :cond_a
    const-class v1, Ljava/util/concurrent/ConcurrentMap;

    .line 226
    .line 227
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 228
    .line 229
    .line 230
    move-result v1

    .line 231
    if-eqz v1, :cond_b

    .line 232
    .line 233
    new-instance v3, Ldefpackage/i80;

    .line 234
    .line 235
    const/16 v0, 0xa

    .line 236
    .line 237
    invoke-direct {v3, v0}, Ldefpackage/i80;-><init>(I)V

    .line 238
    .line 239
    .line 240
    goto :goto_3

    .line 241
    :cond_b
    const-class v1, Ljava/util/SortedMap;

    .line 242
    .line 243
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 244
    .line 245
    .line 246
    move-result v1

    .line 247
    if-eqz v1, :cond_c

    .line 248
    .line 249
    new-instance v3, Ldefpackage/i80;

    .line 250
    .line 251
    const/16 v0, 0xb

    .line 252
    .line 253
    invoke-direct {v3, v0}, Ldefpackage/i80;-><init>(I)V

    .line 254
    .line 255
    .line 256
    goto :goto_3

    .line 257
    :cond_c
    instance-of v1, v0, Ljava/lang/reflect/ParameterizedType;

    .line 258
    .line 259
    if-eqz v1, :cond_d

    .line 260
    .line 261
    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    .line 262
    .line 263
    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    aget-object v0, v0, v2

    .line 268
    .line 269
    invoke-static {v0}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    invoke-virtual {v0}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    const-class v1, Ljava/lang/String;

    .line 278
    .line 279
    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    if-nez v0, :cond_d

    .line 284
    .line 285
    new-instance v3, Ldefpackage/i80;

    .line 286
    .line 287
    const/16 v0, 0xc

    .line 288
    .line 289
    invoke-direct {v3, v0}, Ldefpackage/i80;-><init>(I)V

    .line 290
    .line 291
    .line 292
    goto :goto_3

    .line 293
    :cond_d
    new-instance v3, Ldefpackage/i80;

    .line 294
    .line 295
    const/16 v0, 0xd

    .line 296
    .line 297
    invoke-direct {v3, v0}, Ldefpackage/i80;-><init>(I)V

    .line 298
    .line 299
    .line 300
    :cond_e
    :goto_3
    if-eqz v3, :cond_f

    .line 301
    .line 302
    return-object v3

    .line 303
    :cond_f
    invoke-static {p1}, Ldefpackage/mf4;->b(Ljava/lang/Class;)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    if-eqz v0, :cond_10

    .line 308
    .line 309
    new-instance p0, Ldefpackage/vc0;

    .line 310
    .line 311
    invoke-direct {p0, v0}, Ldefpackage/vc0;-><init>(Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    return-object p0

    .line 315
    :cond_10
    iget-boolean p0, p0, Ldefpackage/mf4;->o:Z

    .line 316
    .line 317
    if-eqz p0, :cond_11

    .line 318
    .line 319
    new-instance p0, Ldefpackage/zh0;

    .line 320
    .line 321
    const/16 v0, 0xf

    .line 322
    .line 323
    invoke-direct {p0, v0, p1}, Ldefpackage/zh0;-><init>(ILjava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    goto :goto_4

    .line 327
    :cond_11
    new-instance p0, Ljava/lang/StringBuilder;

    .line 328
    .line 329
    const-string v0, "Unable to create instance of "

    .line 330
    .line 331
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    const-string p1, "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem."

    .line 338
    .line 339
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 340
    .line 341
    .line 342
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object p0

    .line 346
    new-instance p1, Ldefpackage/uc0;

    .line 347
    .line 348
    invoke-direct {p1, v2, p0}, Ldefpackage/uc0;-><init>(ILjava/lang/String;)V

    .line 349
    .line 350
    .line 351
    move-object p0, p1

    .line 352
    :goto_4
    return-object p0

    .line 353
    :cond_12
    invoke-static {}, Ldefpackage/kf2;->k()V

    .line 354
    .line 355
    .line 356
    return-object v3

    .line 357
    :cond_13
    invoke-static {}, Ldefpackage/kf2;->k()V

    .line 358
    .line 359
    .line 360
    return-object v3
.end method

.method public g()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Ldefpackage/mf4;->o:Z

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    iget-object v0, p0, Ldefpackage/mf4;->q:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/util/HashSet;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_2

    .line 16
    :cond_0
    iget-object v0, p0, Ldefpackage/mf4;->p:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Ldefpackage/ll;

    .line 19
    .line 20
    iget-object v1, v0, Ldefpackage/ll;->q:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, Ldefpackage/sd0;

    .line 23
    .line 24
    invoke-virtual {v1}, Ldefpackage/sd0;->get()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Landroid/net/ConnectivityManager;

    .line 29
    .line 30
    invoke-virtual {v2}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const/4 v3, 0x0

    .line 35
    const/4 v4, 0x1

    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    move v2, v4

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move v2, v3

    .line 41
    :goto_0
    iput-boolean v2, v0, Ldefpackage/ll;->o:Z

    .line 42
    .line 43
    :try_start_0
    invoke-virtual {v1}, Ldefpackage/sd0;->get()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, Landroid/net/ConnectivityManager;

    .line 48
    .line 49
    iget-object v0, v0, Ldefpackage/ll;->r:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v0, Ldefpackage/oy1;

    .line 52
    .line 53
    invoke-virtual {v1, v0}, Landroid/net/ConnectivityManager;->registerDefaultNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    .line 55
    .line 56
    move v3, v4

    .line 57
    goto :goto_1

    .line 58
    :catch_0
    move-exception v0

    .line 59
    const/4 v1, 0x5

    .line 60
    const-string v2, "ConnectivityMonitor"

    .line 61
    .line 62
    invoke-static {v2, v1}, Landroid/util/Ldefpackage/og;->isLoggable(Ljava/lang/String;I)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_2

    .line 67
    .line 68
    const-string v1, "Failed to register callback"

    .line 69
    .line 70
    invoke-static {v2, v1, v0}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 71
    .line 72
    .line 73
    :cond_2
    :goto_1
    iput-boolean v3, p0, Ldefpackage/mf4;->o:Z

    .line 74
    .line 75
    :cond_3
    :goto_2
    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 7

    .line 1
    check-cast p1, Landroid/graphics/Bitmap;

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/mf4;->p:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ldefpackage/s63;

    .line 6
    .line 7
    iget-boolean v1, p0, Ldefpackage/mf4;->o:Z

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ldefpackage/s63;->d(Landroid/graphics/Bitmap;)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Ldefpackage/mf4;->q:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Ldefpackage/vl2;

    .line 17
    .line 18
    new-instance v5, Ldefpackage/rm2;

    .line 19
    .line 20
    invoke-virtual {v0}, Ldefpackage/s63;->a()Landroid/app/Notification;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-direct {v5, p1}, Ldefpackage/rm2;-><init>(Landroid/app/Notification;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Ldefpackage/vl2;->o:Ljava/lang/Object;

    .line 28
    .line 29
    move-object v2, p1

    .line 30
    check-cast v2, Ldefpackage/lo2;

    .line 31
    .line 32
    iget v3, p0, Ldefpackage/vl2;->p:I

    .line 33
    .line 34
    iget-object p0, p0, Ldefpackage/vl2;->q:Ljava/lang/Object;

    .line 35
    .line 36
    move-object v4, p0

    .line 37
    check-cast v4, Ldefpackage/kn2;

    .line 38
    .line 39
    iget-object p0, v2, Ldefpackage/lo2;->r:Ldefpackage/h41;

    .line 40
    .line 41
    new-instance v1, Ldefpackage/ct0;

    .line 42
    .line 43
    const/4 v6, 0x2

    .line 44
    invoke-direct/range {v1 .. v6}, Ldefpackage/ct0;-><init>(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v1}, Ldefpackage/h41;->execute(Ljava/lang/Runnable;)V

    .line 48
    .line 49
    .line 50
    :cond_0
    return-void
.end method

.method public i(Ldefpackage/hk5;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/mf4;->p:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Ldefpackage/mf4;->q:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Ljava/util/ArrayDeque;

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    new-instance v1, Ljava/util/ArrayDeque;

    .line 11
    .line 12
    invoke-direct {v1}, Ljava/util/ArrayDeque;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, Ldefpackage/mf4;->q:Ljava/lang/Object;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    :goto_0
    iget-object p0, p0, Ldefpackage/mf4;->q:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, Ljava/util/ArrayDeque;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    monitor-exit v0

    .line 28
    return-void

    .line 29
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    throw p0
.end method

.method public j(Ldefpackage/jw;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/mf4;->p:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Ldefpackage/mf4;->q:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Ljava/util/ArrayDeque;

    .line 7
    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    iget-boolean v1, p0, Ldefpackage/mf4;->o:Z

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    goto :goto_2

    .line 15
    :cond_0
    const/4 v1, 0x1

    .line 16
    iput-boolean v1, p0, Ldefpackage/mf4;->o:Z

    .line 17
    .line 18
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 19
    :goto_0
    iget-object v1, p0, Ldefpackage/mf4;->p:Ljava/lang/Object;

    .line 20
    .line 21
    monitor-enter v1

    .line 22
    :try_start_1
    iget-object v0, p0, Ldefpackage/mf4;->q:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Ljava/util/ArrayDeque;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Ldefpackage/hk5;

    .line 31
    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    const/4 p1, 0x0

    .line 35
    iput-boolean p1, p0, Ldefpackage/mf4;->o:Z

    .line 36
    .line 37
    monitor-exit v1

    .line 38
    return-void

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    invoke-virtual {v0, p1}, Ldefpackage/hk5;->a(Ldefpackage/jw;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :goto_1
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 47
    throw p0

    .line 48
    :catchall_1
    move-exception p0

    .line 49
    goto :goto_3

    .line 50
    :cond_2
    :goto_2
    :try_start_3
    monitor-exit v0

    .line 51
    return-void

    .line 52
    :goto_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 53
    throw p0
.end method

.method public o(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-boolean p0, p0, Ldefpackage/mf4;->o:Z

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    new-instance p0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v0, "Failed to load bitmap: "

    .line 8
    .line 9
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const-string p1, "NotificationProvider"

    .line 24
    .line 25
    invoke-static {p1, p0}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public onError()V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/mf4;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/d34;

    .line 4
    .line 5
    iget-object v1, p0, Ldefpackage/mf4;->q:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/4 v2, 0x0

    .line 14
    iget-boolean p0, p0, Ldefpackage/mf4;->o:Z

    .line 15
    .line 16
    invoke-virtual {v0, v1, v2, p0, v2}, Ldefpackage/d34;->J(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Ldefpackage/mf4;->n:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :sswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, "{numRequests="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Ldefpackage/mf4;->p:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, Ljava/util/Set;

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Set;->size()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v1, ", isPaused="

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    iget-boolean p0, p0, Ldefpackage/mf4;->o:Z

    .line 45
    .line 46
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string p0, "}"

    .line 50
    .line 51
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0

    .line 59
    :sswitch_1
    iget-object p0, p0, Ldefpackage/mf4;->p:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p0, Ljava/util/Map;

    .line 62
    .line 63
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0

    .line 68
    nop

    .line 69
    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_1
        0x6 -> :sswitch_0
    .end sparse-switch
.end method
