.class public final Ld34;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lst4;
.implements Lou2;
.implements Lretrofit2/Callback;
.implements Lj4;
.implements Lpp;
.implements Lr83;
.implements Lv11;
.implements Lsu2;
.implements Ln20;
.implements Lyy;
.implements Lo73;
.implements Lid0;
.implements Lex4;
.implements Lq51;


# static fields
.field public static p:Ld34;

.field public static final q:Le34;

.field public static final r:Ld34;

.field public static final s:[Ljava/lang/String;

.field public static t:J


# instance fields
.field public final synthetic n:I

.field public o:Ljava/lang/Object;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Le34;

    .line 2
    .line 3
    const/4 v4, 0x0

    .line 4
    const/4 v5, 0x0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct/range {v0 .. v5}, Le34;-><init>(IZZII)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Ld34;->q:Le34;

    .line 12
    .line 13
    const/16 v0, 0x9

    .line 14
    .line 15
    new-array v0, v0, [F

    .line 16
    .line 17
    fill-array-data v0, :array_0

    .line 18
    .line 19
    .line 20
    new-instance v1, Ld34;

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    invoke-direct {v1, v2, v0}, Ld34;-><init>(ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    sput-object v1, Ld34;->r:Ld34;

    .line 27
    .line 28
    const-string v0, "_data"

    .line 29
    .line 30
    filled-new-array {v0}, [Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sput-object v0, Ld34;->s:[Ljava/lang/String;

    .line 35
    .line 36
    return-void

    .line 37
    :array_0
    .array-data 4
        0x3f652546    # 0.8951f
        -0x40bff2e5    # -0.7502f
        0x3d1f559b    # 0.0389f
        0x3e886595    # 0.2664f
        0x3fdb53f8    # 1.7135f
        -0x4273b646    # -0.0685f
        -0x41dab9f5    # -0.1614f
        0x3d1652bd    # 0.0367f
        0x3f83c9ef    # 1.0296f
    .end array-data
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 1
    iput p1, p0, Ld34;->n:I

    .line 2
    .line 3
    sparse-switch p1, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance p1, Lcj4;

    .line 10
    .line 11
    sget-object v0, Lya4;->a:Lca1;

    .line 12
    .line 13
    invoke-direct {p1, v0}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Ld34;->o:Ljava/lang/Object;

    .line 17
    .line 18
    return-void

    .line 19
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    iput-object p1, p0, Ld34;->o:Ljava/lang/Object;

    .line 24
    .line 25
    return-void

    .line 26
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lcom/eddyizm/tempus/database/AppDatabase;->y()Lcom/eddyizm/tempus/database/AppDatabase;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Lcom/eddyizm/tempus/database/AppDatabase;->x()Li61;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, Ld34;->o:Ljava/lang/Object;

    .line 38
    .line 39
    return-void

    .line 40
    nop

    .line 41
    :sswitch_data_0
    .sparse-switch
        0x19 -> :sswitch_1
        0x1c -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(IIIIZZLrm2;)V
    .locals 12

    const/16 v0, 0x10

    iput v0, p0, Ld34;->n:I

    .line 49
    sget-object v2, Lgr4;->l:Lgr4;

    .line 50
    sget-object v0, Lfz0;->L:Lfz0;

    .line 51
    sget-object v10, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    new-instance v11, Ldv3;

    .line 53
    new-instance v1, Lea0;

    move v3, p1

    move v4, p2

    move v5, p3

    move/from16 v6, p4

    move/from16 v7, p5

    move/from16 v8, p6

    move-object/from16 v9, p7

    invoke-direct/range {v1 .. v9}, Lea0;-><init>(Lgr4;IIIIZZLrm2;)V

    .line 54
    invoke-direct {v11, v2, v10, v0, v1}, Ldv3;-><init>(Lgr4;Ljava/util/concurrent/TimeUnit;Lfz0;Lea0;)V

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    iput-object v11, p0, Ld34;->o:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 48
    iput p1, p0, Ld34;->n:I

    iput-object p2, p0, Ld34;->o:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 41
    iput p1, p0, Ld34;->n:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/ClipData;I)V
    .locals 1

    const/16 v0, 0x12

    iput v0, p0, Ld34;->n:I

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    invoke-static {p1, p2}, Ldb;->e(Landroid/content/ClipData;I)Landroid/view/ContentInfo$Builder;

    move-result-object p1

    iput-object p1, p0, Ld34;->o:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/widget/LinearLayout;Lcom/google/android/material/appbar/MaterialToolbar;)V
    .locals 0

    const/16 p1, 0x1b

    iput p1, p0, Ld34;->n:I

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p2, p0, Ld34;->o:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lzg5;)V
    .locals 1

    const/16 v0, 0x1d

    iput v0, p0, Ld34;->n:I

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    new-instance v0, Ljava/util/HashMap;

    .line 44
    iget-object p1, p1, Lzg5;->n:Ljava/lang/Object;

    check-cast p1, Ljava/util/HashMap;

    .line 45
    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Ld34;->o:Ljava/lang/Object;

    return-void
.end method

.method public static declared-synchronized E()Ld34;
    .locals 4

    .line 1
    const-class v0, Ld34;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Ld34;->p:Ld34;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Ld34;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-direct {v1, v2, v3}, Ld34;-><init>(IZ)V

    .line 13
    .line 14
    .line 15
    sput-object v1, Ld34;->p:Ld34;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception v1

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    :goto_0
    sget-object v1, Ld34;->p:Ld34;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    monitor-exit v0

    .line 23
    return-object v1

    .line 24
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    throw v1
.end method

.method public static G(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Ll61;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0, p0, p2}, Ln61;->g(ILjava/lang/String;Z)Ll61;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    const/4 v0, 0x2

    .line 7
    invoke-static {v0, p1, p2}, Ln61;->g(ILjava/lang/String;Z)Ll61;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const/4 v0, 0x3

    .line 12
    invoke-static {v0, p3, p2}, Ln61;->g(ILjava/lang/String;Z)Ll61;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    if-eqz p1, :cond_1

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_1
    return-object p2
.end method

.method public static I(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/eddyizm/tempus/interfaces/StarCallback;)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p0, p1, v0, p2}, Ld34;->G(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Ll61;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-static {v1}, Lcom/eddyizm/tempus/App;->f(Z)Lpn4;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Lpn4;->e()Lgp3;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const-string v2, "MediaAnnotationClient"

    .line 19
    .line 20
    const-string v3, "star()"

    .line 21
    .line 22
    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    iget-object v2, v1, Lgp3;->p:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v2, Lzi2;

    .line 28
    .line 29
    iget-object v1, v1, Lgp3;->o:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, Lpn4;

    .line 32
    .line 33
    invoke-virtual {v1}, Lpn4;->f()Ljava/util/HashMap;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-interface {v2, v1, p0, p1, p2}, Lzi2;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    new-instance p1, Lxc5;

    .line 42
    .line 43
    const/16 p2, 0x8

    .line 44
    .line 45
    invoke-direct {p1, p2, v0, p3}, Lxc5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-interface {p0, p1}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public static K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/eddyizm/tempus/interfaces/StarCallback;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, p1, v0, p2}, Ld34;->G(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Ll61;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-static {v0}, Lcom/eddyizm/tempus/App;->f(Z)Lpn4;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lpn4;->e()Lgp3;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const-string v2, "MediaAnnotationClient"

    .line 18
    .line 19
    const-string v3, "unstar()"

    .line 20
    .line 21
    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    iget-object v2, v0, Lgp3;->p:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v2, Lzi2;

    .line 27
    .line 28
    iget-object v0, v0, Lgp3;->o:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Lpn4;

    .line 31
    .line 32
    invoke-virtual {v0}, Lpn4;->f()Ljava/util/HashMap;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-interface {v2, v0, p0, p1, p2}, Lzi2;->b(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    new-instance p1, Lhd5;

    .line 41
    .line 42
    const/16 p2, 0x8

    .line 43
    .line 44
    invoke-direct {p1, p2, v1, p3}, Lhd5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-interface {p0, p1}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public static r(Ll61;Lcom/eddyizm/tempus/interfaces/StarCallback;)V
    .locals 3

    .line 1
    sget-object v0, Ln61;->a:Ljava/util/HashMap;

    .line 2
    .line 3
    const-class v0, Ln61;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    if-eqz p0, :cond_1

    .line 7
    .line 8
    :try_start_0
    sget-object v1, Ln61;->a:Ljava/util/HashMap;

    .line 9
    .line 10
    iget-object v2, p0, Ll61;->a:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Ll61;

    .line 17
    .line 18
    :goto_0
    if-eqz v1, :cond_0

    .line 19
    .line 20
    iget-boolean v2, v1, Ll61;->e:Z

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    iget-object v1, v1, Ll61;->c:Ll61;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    if-ne v1, p0, :cond_1

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    goto :goto_1

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    throw p0

    .line 34
    :cond_1
    const/4 v1, 0x0

    .line 35
    :goto_1
    monitor-exit v0

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    invoke-interface {p1}, Lcom/eddyizm/tempus/interfaces/StarCallback;->onError()V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    invoke-static {p0}, Ln61;->l(Ll61;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public static w(Lretrofit2/Response;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    sget-object v0, Lcom/eddyizm/tempus/subsonic/models/ResponseStatus;->FAILED:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {p0}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getStatus()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-eqz p0, :cond_0

    .line 40
    .line 41
    const/4 p0, 0x1

    .line 42
    return p0

    .line 43
    :cond_0
    const/4 p0, 0x0

    .line 44
    return p0
.end method


# virtual methods
.method public A()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object p0, p0, Ld34;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/lang/reflect/Type;

    .line 4
    .line 5
    instance-of v0, p0, Ljava/lang/reflect/ParameterizedType;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const-string v2, "Invalid EnumSet type: "

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    move-object v0, p0

    .line 13
    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v3, 0x0

    .line 20
    aget-object v0, v0, v3

    .line 21
    .line 22
    instance-of v3, v0, Ljava/lang/Class;

    .line 23
    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    check-cast v0, Ljava/lang/Class;

    .line 27
    .line 28
    invoke-static {v0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :cond_0
    invoke-static {p0, v2}, Lkf2;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-object v1

    .line 37
    :cond_1
    invoke-static {p0, v2}, Lkf2;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-object v1
.end method

.method public B(Lc72;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lc72;->G()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "DepthSortedSet.add called on an unattached node"

    .line 8
    .line 9
    invoke-static {v0}, Lcz1;->b(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object p0, p0, Ld34;->o:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lcj4;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public C(Lcom/eddyizm/tempus/model/Favorite;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Lcom/eddyizm/tempus/model/Favorite;->getTimestamp()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {}, Lcom/eddyizm/tempus/App;->a()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const-string v3, "homemusic_favorite_retries"

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    invoke-virtual {v2, v3, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {v2, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 29
    .line 30
    .line 31
    new-instance v0, Lo61;

    .line 32
    .line 33
    iget-object p0, p0, Ld34;->o:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p0, Li61;

    .line 36
    .line 37
    invoke-direct {v0, p0, p1, v4}, Lo61;-><init>(Li61;Lcom/eddyizm/tempus/model/Favorite;I)V

    .line 38
    .line 39
    .line 40
    new-instance p0, Ljava/lang/Thread;

    .line 41
    .line 42
    invoke-direct {p0, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public D()Lkl4;
    .locals 3

    .line 1
    invoke-static {}, Ltz0;->a()Ltz0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ltz0;->b()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    new-instance p0, Low1;

    .line 13
    .line 14
    invoke-direct {p0, v2}, Low1;-><init>(Z)V

    .line 15
    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-static {v1}, Luc5;->B(Ljava/lang/Object;)Lzd3;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    new-instance v2, Lhl0;

    .line 25
    .line 26
    invoke-direct {v2, v1, p0}, Lhl0;-><init>(Lzd3;Ld34;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v2}, Ltz0;->g(Lrz0;)V

    .line 30
    .line 31
    .line 32
    return-object v1
.end method

.method public F()V
    .locals 0

    .line 1
    iget-object p0, p0, Ld34;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lmc1;

    .line 4
    .line 5
    iget-object p0, p0, Lmc1;->D:Lmd1;

    .line 6
    .line 7
    invoke-virtual {p0}, Lld1;->P()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public H(Lc72;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Lc72;->G()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "DepthSortedSet.remove called on an unattached node"

    .line 8
    .line 9
    invoke-static {v0}, Lcz1;->b(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object p0, p0, Ld34;->o:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lcj4;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0
.end method

.method public J(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0, p1, p3}, Ln61;->k(ILjava/lang/String;Z)V

    .line 3
    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    invoke-static {v1, p2, p3}, Ln61;->k(ILjava/lang/String;Z)V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x3

    .line 10
    invoke-static {v1, p4, p3}, Ln61;->k(ILjava/lang/String;Z)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1, p2, p3, p4}, Ld34;->G(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Ll61;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 18
    .line 19
    .line 20
    move-result-wide v2

    .line 21
    sget-wide v4, Ld34;->t:J

    .line 22
    .line 23
    const-wide/16 v6, 0x1

    .line 24
    .line 25
    add-long/2addr v4, v6

    .line 26
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 27
    .line 28
    .line 29
    move-result-wide v2

    .line 30
    sput-wide v2, Ld34;->t:J

    .line 31
    .line 32
    if-nez v1, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-static {}, Lcom/eddyizm/tempus/App;->a()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    const-string v5, "homemusic_favorite_retries"

    .line 40
    .line 41
    const/4 v6, 0x0

    .line 42
    invoke-virtual {v4, v5, v6}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    iget-object v1, v1, Ll61;->f:Lk61;

    .line 55
    .line 56
    iget-object v1, v1, Lk61;->d:Ljava/lang/String;

    .line 57
    .line 58
    invoke-interface {v4, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 63
    .line 64
    .line 65
    :goto_0
    new-instance v1, Lo61;

    .line 66
    .line 67
    iget-object p0, p0, Ld34;->o:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p0, Li61;

    .line 70
    .line 71
    new-instance v2, Lcom/eddyizm/tempus/model/Favorite;

    .line 72
    .line 73
    sget-wide v3, Ld34;->t:J

    .line 74
    .line 75
    move-object v5, p1

    .line 76
    move-object v6, p2

    .line 77
    move v8, p3

    .line 78
    move-object v7, p4

    .line 79
    invoke-direct/range {v2 .. v8}, Lcom/eddyizm/tempus/model/Favorite;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 80
    .line 81
    .line 82
    invoke-direct {v1, p0, v2, v0}, Lo61;-><init>(Li61;Lcom/eddyizm/tempus/model/Favorite;I)V

    .line 83
    .line 84
    .line 85
    new-instance p0, Ljava/lang/Thread;

    .line 86
    .line 87
    invoke-direct {p0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    .line 91
    .line 92
    .line 93
    return-void
.end method

.method public a(Lqu2;Landroid/view/MenuItem;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ld34;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Luz;

    .line 4
    .line 5
    iget-object p0, p0, Luz;->s:Landroid/os/Handler;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public b()S
    .locals 0

    .line 1
    iget-object p0, p0, Ld34;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/media/audiofx/Equalizer;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/media/audiofx/Equalizer;->getNumberOfBands()S

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0
.end method

.method public build()Lld0;
    .locals 2

    .line 1
    new-instance v0, Lld0;

    .line 2
    .line 3
    new-instance v1, Lzh0;

    .line 4
    .line 5
    iget-object p0, p0, Ld34;->o:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Landroid/view/ContentInfo$Builder;

    .line 8
    .line 9
    invoke-static {p0}, Ldb;->f(Landroid/view/ContentInfo$Builder;)Landroid/view/ContentInfo;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-direct {v1, p0}, Lzh0;-><init>(Landroid/view/ContentInfo;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1}, Lld0;-><init>(Lkd0;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public c(Landroid/net/Uri;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ld34;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/view/ContentInfo$Builder;

    .line 4
    .line 5
    invoke-static {p0, p1}, Lhd0;->u(Landroid/view/ContentInfo$Builder;Landroid/net/Uri;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public d()[S
    .locals 0

    .line 1
    iget-object p0, p0, Ld34;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/media/audiofx/Equalizer;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/media/audiofx/Equalizer;->getBandLevelRange()[S

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method

.method public e()Z
    .locals 0

    .line 1
    iget-object p0, p0, Ld34;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lbg;

    .line 4
    .line 5
    invoke-virtual {p0}, Lbg;->G()V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lbg;->A:Ll93;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Ll93;->I()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    and-int/lit8 p0, p0, 0x4

    .line 17
    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public f(Landroid/content/Context;I)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, -0x1

    .line 3
    if-eq p2, v1, :cond_2

    .line 4
    .line 5
    if-eqz p2, :cond_2

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p1, p2}, Ld34;->o(Landroid/content/Context;I)V

    .line 22
    .line 23
    .line 24
    if-eqz p2, :cond_0

    .line 25
    .line 26
    if-eq p2, v1, :cond_0

    .line 27
    .line 28
    :try_start_0
    new-instance p1, Landroid/media/audiofx/Equalizer;

    .line 29
    .line 30
    invoke-direct {p1, v0, p2}, Landroid/media/audiofx/Equalizer;-><init>(II)V

    .line 31
    .line 32
    .line 33
    const/4 p2, 0x1

    .line 34
    invoke-virtual {p1, p2}, Landroid/media/audiofx/AudioEffect;->setEnabled(Z)I

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Ld34;->o:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catch_0
    const/4 p1, 0x0

    .line 41
    iput-object p1, p0, Ld34;->o:Ljava/lang/Object;

    .line 42
    .line 43
    :cond_0
    move p2, v0

    .line 44
    :goto_0
    if-eqz p2, :cond_1

    .line 45
    .line 46
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    const-string v1, "equalizer_enabled"

    .line 58
    .line 59
    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    invoke-virtual {p0, p1}, Ld34;->setEnabled(Z)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Ld34;->b()S

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    invoke-static {p1}, Lud3;->q(S)[S

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    :goto_1
    if-ge v0, p1, :cond_1

    .line 75
    .line 76
    int-to-short v2, v0

    .line 77
    aget-short v3, v1, v0

    .line 78
    .line 79
    invoke-virtual {p0, v2, v3}, Ld34;->v(SS)V

    .line 80
    .line 81
    .line 82
    add-int/lit8 v0, v0, 0x1

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_1
    return p2

    .line 86
    :cond_2
    return v0
.end method

.method public g()Ljava/lang/Object;
    .locals 8

    .line 1
    new-instance v0, Lm11;

    .line 2
    .line 3
    iget-object p0, p0, Ld34;->o:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Llv4;

    .line 6
    .line 7
    iget-object v1, p0, Llv4;->n:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lli1;

    .line 10
    .line 11
    iget-object v2, p0, Llv4;->o:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Lli1;

    .line 14
    .line 15
    iget-object v3, p0, Llv4;->p:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, Lli1;

    .line 18
    .line 19
    iget-object v4, p0, Llv4;->q:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v4, Lli1;

    .line 22
    .line 23
    iget-object v5, p0, Llv4;->r:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v5, Li11;

    .line 26
    .line 27
    iget-object v6, p0, Llv4;->s:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v6, Li11;

    .line 30
    .line 31
    iget-object p0, p0, Llv4;->t:Ljava/lang/Object;

    .line 32
    .line 33
    move-object v7, p0

    .line 34
    check-cast v7, Li61;

    .line 35
    .line 36
    invoke-direct/range {v0 .. v7}, Lm11;-><init>(Lli1;Lli1;Lli1;Lli1;Li11;Li11;Li61;)V

    .line 37
    .line 38
    .line 39
    return-object v0
.end method

.method public h()Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Ld34;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lbg;

    .line 4
    .line 5
    invoke-virtual {p0}, Lbg;->D()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public i(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Ld34;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/view/ContentInfo$Builder;

    .line 4
    .line 5
    invoke-static {p0, p1}, Ldb;->v(Landroid/view/ContentInfo$Builder;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public j(Landroid/graphics/Typeface;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ld34;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lk40;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lk40;->o(Landroid/graphics/Typeface;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    invoke-virtual {p0, p1}, Lk40;->i(Z)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public k(Lka0;)V
    .locals 1

    .line 1
    iget v0, p1, Lka0;->o:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    iget-object p0, p0, Ld34;->o:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Lcom/google/android/gms/common/internal/a;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    iget-object v0, p0, Lcom/google/android/gms/common/internal/a;->J:Ljava/util/Set;

    .line 16
    .line 17
    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/common/internal/a;->j0(Leu1;Ljava/util/Set;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    iget-object p0, p0, Lcom/google/android/gms/common/internal/a;->B:Lc05;

    .line 22
    .line 23
    if-eqz p0, :cond_2

    .line 24
    .line 25
    iget-object p0, p0, Lc05;->n:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Lhj1;

    .line 28
    .line 29
    invoke-interface {p0, p1}, Lhj1;->m(Lka0;)V

    .line 30
    .line 31
    .line 32
    :cond_2
    return-void
.end method

.method public l(Lqu2;Ltu2;)V
    .locals 9

    .line 1
    iget-object v0, p0, Ld34;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Luz;

    .line 4
    .line 5
    iget-object v1, v0, Luz;->s:Landroid/os/Handler;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, v0, Luz;->u:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    const/4 v4, 0x0

    .line 18
    :goto_0
    const/4 v5, -0x1

    .line 19
    if-ge v4, v3, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    check-cast v6, Ltz;

    .line 26
    .line 27
    iget-object v6, v6, Ltz;->b:Lqu2;

    .line 28
    .line 29
    if-ne p1, v6, :cond_0

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move v4, v5

    .line 36
    :goto_1
    if-ne v4, v5, :cond_2

    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-ge v4, v3, :cond_3

    .line 46
    .line 47
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    move-object v2, v0

    .line 52
    check-cast v2, Ltz;

    .line 53
    .line 54
    :cond_3
    move-object v5, v2

    .line 55
    new-instance v3, Lsz;

    .line 56
    .line 57
    const/4 v8, 0x0

    .line 58
    move-object v4, p0

    .line 59
    move-object v7, p1

    .line 60
    move-object v6, p2

    .line 61
    invoke-direct/range {v3 .. v8}, Lsz;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 62
    .line 63
    .line 64
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 65
    .line 66
    .line 67
    move-result-wide p0

    .line 68
    const-wide/16 v4, 0xc8

    .line 69
    .line 70
    add-long/2addr p0, v4

    .line 71
    invoke-virtual {v1, v3, v7, p0, p1}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public m(Lqu2;Landroid/view/MenuItem;)Z
    .locals 3

    .line 1
    iget-object p0, p0, Ld34;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/appcompat/widget/ActionMenuView;

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuView;->N:Lb5;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    if-eqz p0, :cond_3

    .line 9
    .line 10
    check-cast p0, Lom1;

    .line 11
    .line 12
    iget-object p0, p0, Lom1;->o:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Landroidx/appcompat/widget/Toolbar;

    .line 15
    .line 16
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->T:Lr20;

    .line 17
    .line 18
    iget-object v0, v0, Lr20;->p:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    const/4 v2, 0x1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Lcd1;

    .line 38
    .line 39
    iget-object v1, v1, Lcd1;->a:Lld1;

    .line 40
    .line 41
    invoke-virtual {v1, p2}, Lld1;->o(Landroid/view/MenuItem;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_0

    .line 46
    .line 47
    move p0, v2

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->V:Lav4;

    .line 50
    .line 51
    if-eqz p0, :cond_2

    .line 52
    .line 53
    invoke-interface {p0, p2}, Lav4;->onMenuItemClick(Landroid/view/MenuItem;)Z

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    goto :goto_0

    .line 58
    :cond_2
    move p0, p1

    .line 59
    :goto_0
    if-eqz p0, :cond_3

    .line 60
    .line 61
    return v2

    .line 62
    :cond_3
    return p1
.end method

.method public n(S)Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, Ld34;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/media/audiofx/Equalizer;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/media/audiofx/Equalizer;->getCenterFreq(S)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    div-int/lit16 p0, p0, 0x3e8

    .line 12
    .line 13
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return-object p0
.end method

.method public o(Landroid/content/Context;I)V
    .locals 0

    .line 1
    iget-object p1, p0, Ld34;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Landroid/media/audiofx/Equalizer;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/media/audiofx/AudioEffect;->release()V

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    iput-object p1, p0, Ld34;->o:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public onFailure(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget p1, p0, Ld34;->n:I

    .line 2
    .line 3
    const/4 p2, -0x1

    .line 4
    packed-switch p1, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Ld34;->o:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Lr8;

    .line 10
    .line 11
    invoke-virtual {p0, p2}, Lr8;->onLoadYear(I)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    iget-object p0, p0, Ld34;->o:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Lx7;

    .line 18
    .line 19
    invoke-virtual {p0, p2}, Lx7;->onLoadYear(I)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public onResponse(Lretrofit2/Call;Lretrofit2/Response;)V
    .locals 1

    .line 1
    iget p1, p0, Ld34;->n:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p1, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Lretrofit2/Response;->isSuccessful()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getAlbumList2()Lcom/eddyizm/tempus/subsonic/models/AlbumList2;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 40
    .line 41
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getAlbumList2()Lcom/eddyizm/tempus/subsonic/models/AlbumList2;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumList2;->getAlbums()Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    if-eqz p1, :cond_0

    .line 54
    .line 55
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    check-cast p1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 60
    .line 61
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getAlbumList2()Lcom/eddyizm/tempus/subsonic/models/AlbumList2;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumList2;->getAlbums()Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-nez p1, :cond_0

    .line 78
    .line 79
    iget-object p0, p0, Ld34;->o:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast p0, Lr8;

    .line 82
    .line 83
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    check-cast p1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 88
    .line 89
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getAlbumList2()Lcom/eddyizm/tempus/subsonic/models/AlbumList2;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumList2;->getAlbums()Ljava/util/List;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 106
    .line 107
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getYear()I

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    invoke-virtual {p0, p1}, Lr8;->onLoadYear(I)V

    .line 112
    .line 113
    .line 114
    :cond_0
    return-void

    .line 115
    :pswitch_0
    iget-object p0, p0, Ld34;->o:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast p0, Lx7;

    .line 118
    .line 119
    invoke-virtual {p2}, Lretrofit2/Response;->isSuccessful()Z

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    if-eqz p1, :cond_2

    .line 124
    .line 125
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    if-eqz p1, :cond_2

    .line 130
    .line 131
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    check-cast p1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 136
    .line 137
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getAlbumList2()Lcom/eddyizm/tempus/subsonic/models/AlbumList2;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    if-eqz p1, :cond_2

    .line 146
    .line 147
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    check-cast p1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 152
    .line 153
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getAlbumList2()Lcom/eddyizm/tempus/subsonic/models/AlbumList2;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumList2;->getAlbums()Ljava/util/List;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    if-eqz p1, :cond_2

    .line 166
    .line 167
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    check-cast p1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 172
    .line 173
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getAlbumList2()Lcom/eddyizm/tempus/subsonic/models/AlbumList2;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumList2;->getAlbums()Ljava/util/List;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 186
    .line 187
    .line 188
    move-result p1

    .line 189
    if-nez p1, :cond_1

    .line 190
    .line 191
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    check-cast p1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 196
    .line 197
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getAlbumList2()Lcom/eddyizm/tempus/subsonic/models/AlbumList2;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumList2;->getAlbums()Ljava/util/List;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 210
    .line 211
    .line 212
    move-result p1

    .line 213
    if-nez p1, :cond_1

    .line 214
    .line 215
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    check-cast p1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 220
    .line 221
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getAlbumList2()Lcom/eddyizm/tempus/subsonic/models/AlbumList2;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumList2;->getAlbums()Ljava/util/List;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 238
    .line 239
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getYear()I

    .line 240
    .line 241
    .line 242
    move-result p1

    .line 243
    invoke-virtual {p0, p1}, Lx7;->onLoadYear(I)V

    .line 244
    .line 245
    .line 246
    goto :goto_0

    .line 247
    :cond_1
    const/4 p1, -0x1

    .line 248
    invoke-virtual {p0, p1}, Lx7;->onLoadYear(I)V

    .line 249
    .line 250
    .line 251
    :cond_2
    :goto_0
    return-void

    .line 252
    nop

    .line 253
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public p(Landroid/net/Uri;)Landroid/database/Cursor;
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p0, p0, Ld34;->o:Ljava/lang/Object;

    .line 6
    .line 7
    move-object v0, p0

    .line 8
    check-cast v0, Landroid/content/ContentResolver;

    .line 9
    .line 10
    sget-object v1, Landroid/provider/MediaStore$Images$Thumbnails;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 11
    .line 12
    filled-new-array {p1}, [Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    const/4 v5, 0x0

    .line 17
    sget-object v2, Ld34;->s:[Ljava/lang/String;

    .line 18
    .line 19
    const-string v3, "kind = 1 AND image_id = ?"

    .line 20
    .line 21
    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public q(Landroid/graphics/drawable/Drawable;I)V
    .locals 0

    .line 1
    iget-object p0, p0, Ld34;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lbg;

    .line 4
    .line 5
    invoke-virtual {p0}, Lbg;->G()V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lbg;->A:Ll93;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Ll93;->i0(Landroid/graphics/drawable/Drawable;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p2}, Ll93;->h0(I)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public s(I)Lcx4;
    .locals 1

    .line 1
    const/4 v0, 0x5

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    sget-object p0, Lz53;->n:Lz53;

    .line 5
    .line 6
    return-object p0

    .line 7
    :cond_0
    iget-object p1, p0, Ld34;->o:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Lom0;

    .line 10
    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    new-instance p1, Lom0;

    .line 14
    .line 15
    const/16 v0, 0xb

    .line 16
    .line 17
    invoke-direct {p1, v0}, Lom0;-><init>(I)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Ld34;->o:Ljava/lang/Object;

    .line 21
    .line 22
    :cond_1
    iget-object p0, p0, Ld34;->o:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, Lom0;

    .line 25
    .line 26
    return-object p0
.end method

.method public setEnabled(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Ld34;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/media/audiofx/Equalizer;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/media/audiofx/AudioEffect;->setEnabled(Z)I

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setExtras(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ld34;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/view/ContentInfo$Builder;

    .line 4
    .line 5
    invoke-static {p0, p1}, Lhd0;->v(Landroid/view/ContentInfo$Builder;Landroid/os/Bundle;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public t()Landroid/graphics/drawable/Drawable;
    .locals 3

    .line 1
    iget-object p0, p0, Ld34;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lbg;

    .line 4
    .line 5
    invoke-virtual {p0}, Lbg;->D()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const v0, 0x7f040271

    .line 10
    .line 11
    .line 12
    filled-new-array {v0}, [I

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {p0, v1, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0, v1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    invoke-static {p0, v2}, Lzz1;->r(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    :goto_0
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 44
    .line 45
    .line 46
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Ld34;->n:I

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
    iget-object p0, p0, Ld34;->o:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Lcj4;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :sswitch_1
    const-string p0, "Bradford"

    .line 21
    .line 22
    return-object p0

    .line 23
    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x15 -> :sswitch_0
    .end sparse-switch
.end method

.method public u(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Ld34;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lbg;

    .line 4
    .line 5
    invoke-virtual {p0}, Lbg;->G()V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lbg;->A:Ll93;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Ll93;->h0(I)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public v(SS)V
    .locals 0

    .line 1
    iget-object p0, p0, Ld34;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/media/audiofx/Equalizer;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Landroid/media/audiofx/Equalizer;->setBandLevel(SS)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public x(Landroid/view/View;Lpb5;)Lpb5;
    .locals 1

    .line 1
    iget-object p0, p0, Ld34;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lyt;

    .line 4
    .line 5
    iget-object p1, p0, Lyt;->A:Lxt;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lyt;->t:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 10
    .line 11
    iget-object v0, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->j0:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    :cond_0
    new-instance p1, Lxt;

    .line 17
    .line 18
    iget-object v0, p0, Lyt;->w:Landroid/widget/FrameLayout;

    .line 19
    .line 20
    invoke-direct {p1, v0, p2}, Lxt;-><init>(Landroid/view/View;Lpb5;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lyt;->A:Lxt;

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p1, v0}, Lxt;->e(Landroid/view/Window;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lyt;->t:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 33
    .line 34
    iget-object p0, p0, Lyt;->A:Lxt;

    .line 35
    .line 36
    invoke-virtual {p1, p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->w(Lut;)V

    .line 37
    .line 38
    .line 39
    return-object p2
.end method

.method public y(Lqu2;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ld34;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/appcompat/widget/ActionMenuView;

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuView;->I:Lou2;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-interface {p0, p1}, Lou2;->y(Lqu2;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public z(S)Ljava/lang/Short;
    .locals 0

    .line 1
    iget-object p0, p0, Ld34;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/media/audiofx/Equalizer;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/media/audiofx/Equalizer;->getBandLevel(S)S

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    invoke-static {p0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return-object p0
.end method
