.class public Ldefpackage/zh0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/st4;
.implements Ldefpackage/r83;
.implements Ldefpackage/fv2;
.implements Lretrofit2/Callback;
.implements Ldefpackage/d14;
.implements Ldefpackage/qn4;
.implements Ldefpackage/o73;
.implements Ldefpackage/kd0;
.implements Ldefpackage/yh0;
.implements Ldefpackage/f4;
.implements Ldefpackage/f51;
.implements Ldefpackage/p5;
.implements Ldefpackage/jj1;


# static fields
.field public static final p:Ldefpackage/sw;

.field public static final q:[Ljava/lang/String;


# instance fields
.field public final synthetic n:I

.field public o:Ljava/lang/Object;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldefpackage/sw;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Ldefpackage/sw;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ldefpackage/zh0;->p:Ldefpackage/sw;

    .line 8
    .line 9
    const-string v0, "_data"

    .line 10
    .line 11
    filled-new-array {v0}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Ldefpackage/zh0;->q:[Ljava/lang/String;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(I)V
    .locals 3

    .line 1
    iput p1, p0, Ldefpackage/zh0;->n:I

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
    new-instance p1, Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Ldefpackage/zh0;->o:Ljava/lang/Object;

    .line 15
    .line 16
    return-void

    .line 17
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance p1, Ldefpackage/ef1;

    .line 21
    .line 22
    const/high16 v0, 0x3f800000    # 1.0f

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    const/4 v2, 0x5

    .line 26
    invoke-direct {p1, v2, v0, v1}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Ldefpackage/zh0;->o:Ljava/lang/Object;

    .line 30
    .line 31
    return-void

    .line 32
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-static {}, Lcom/eddyizm/tempus/database/AppDatabase;->y()Lcom/eddyizm/tempus/database/AppDatabase;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Lcom/eddyizm/tempus/database/AppDatabase;->v()Ldefpackage/r20;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iput-object p1, p0, Ldefpackage/zh0;->o:Ljava/lang/Object;

    .line 48
    .line 49
    return-void

    .line 50
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    .line 52
    .line 53
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 54
    .line 55
    const/16 v0, 0x1a

    .line 56
    .line 57
    if-lt p1, v0, :cond_0

    .line 58
    .line 59
    new-instance p1, Ldefpackage/x3;

    .line 60
    .line 61
    invoke-direct {p1, p0}, Ldefpackage/w3;-><init>(Ldefpackage/zh0;)V

    .line 62
    .line 63
    .line 64
    iput-object p1, p0, Ldefpackage/zh0;->o:Ljava/lang/Object;

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    new-instance p1, Ldefpackage/w3;

    .line 68
    .line 69
    invoke-direct {p1, p0}, Ldefpackage/w3;-><init>(Ldefpackage/zh0;)V

    .line 70
    .line 71
    .line 72
    iput-object p1, p0, Ldefpackage/zh0;->o:Ljava/lang/Object;

    .line 73
    .line 74
    :goto_0
    return-void

    .line 75
    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_3
        0xd -> :sswitch_2
        0x1a -> :sswitch_1
        0x1b -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 75
    iput p1, p0, Ldefpackage/zh0;->n:I

    iput-object p2, p0, Ldefpackage/zh0;->o:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/view/ContentInfo;)V
    .locals 1

    const/16 v0, 0x11

    iput v0, p0, Ldefpackage/zh0;->n:I

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    invoke-static {p1}, Ldefpackage/hd0;->m(Ljava/lang/Object;)Landroid/view/ContentInfo;

    move-result-object p1

    iput-object p1, p0, Ldefpackage/zh0;->o:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    const/16 v0, 0x16

    iput v0, p0, Ldefpackage/zh0;->n:I

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    new-instance v0, Ldefpackage/j01;

    invoke-direct {v0, p1}, Ldefpackage/j01;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Ldefpackage/zh0;->o:Ljava/lang/Object;

    return-void
.end method

.method public static B(Ljava/util/List;)V
    .locals 1

    .line 1
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-static {p0}, Ldefpackage/xa3;->d(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    throw p0
.end method

.method public static E(Ldefpackage/be3;)Ldefpackage/zh0;
    .locals 6

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0}, Ldefpackage/be3;->O(I)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/be3;->A()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    shr-int/lit8 v1, v0, 0x1

    .line 10
    .line 11
    and-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    const/4 v2, 0x5

    .line 14
    shl-int/2addr v0, v2

    .line 15
    invoke-virtual {p0}, Ldefpackage/be3;->A()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    shr-int/lit8 p0, p0, 0x3

    .line 20
    .line 21
    and-int/lit8 p0, p0, 0x1f

    .line 22
    .line 23
    or-int/2addr p0, v0

    .line 24
    const/4 v0, 0x4

    .line 25
    const/16 v3, 0xa

    .line 26
    .line 27
    if-eq v1, v0, :cond_3

    .line 28
    .line 29
    if-eq v1, v2, :cond_3

    .line 30
    .line 31
    const/4 v0, 0x7

    .line 32
    if-eq v1, v0, :cond_3

    .line 33
    .line 34
    const/16 v0, 0x8

    .line 35
    .line 36
    if-ne v1, v0, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/16 v0, 0x9

    .line 40
    .line 41
    if-ne v1, v0, :cond_1

    .line 42
    .line 43
    const-string v0, "dvav"

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    if-ne v1, v3, :cond_2

    .line 47
    .line 48
    const-string v0, "dav1"

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    const/4 p0, 0x0

    .line 52
    return-object p0

    .line 53
    :cond_3
    :goto_0
    const-string v0, "dvhe"

    .line 54
    .line 55
    :goto_1
    invoke-static {v0}, Ldefpackage/xa3;->i(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    const-string v2, "."

    .line 60
    .line 61
    const-string v4, ".0"

    .line 62
    .line 63
    if-ge v1, v3, :cond_4

    .line 64
    .line 65
    move-object v5, v4

    .line 66
    goto :goto_2

    .line 67
    :cond_4
    move-object v5, v2

    .line 68
    :goto_2
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    if-ge p0, v3, :cond_5

    .line 75
    .line 76
    move-object v2, v4

    .line 77
    :cond_5
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    new-instance v0, Ldefpackage/zh0;

    .line 88
    .line 89
    const/16 v1, 0x14

    .line 90
    .line 91
    invoke-direct {v0, v1, p0}, Ldefpackage/zh0;-><init>(ILjava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    return-object v0
.end method


# virtual methods
.method public A()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Ldefpackage/zh0;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/zh0;->o:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Ljava/lang/reflect/Type;

    .line 9
    .line 10
    instance-of v0, p0, Ljava/lang/reflect/ParameterizedType;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    const-string v2, "Invalid EnumMap type: "

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    move-object v0, p0

    .line 18
    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const/4 v3, 0x0

    .line 25
    aget-object v0, v0, v3

    .line 26
    .line 27
    instance-of v3, v0, Ljava/lang/Class;

    .line 28
    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    new-instance v1, Ljava/util/EnumMap;

    .line 32
    .line 33
    check-cast v0, Ljava/lang/Class;

    .line 34
    .line 35
    invoke-direct {v1, v0}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-static {p0, v2}, Ldefpackage/kf2;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-static {p0, v2}, Ldefpackage/kf2;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :goto_0
    return-object v1

    .line 47
    :pswitch_0
    iget-object p0, p0, Ldefpackage/zh0;->o:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p0, Ljava/lang/Class;

    .line 50
    .line 51
    :try_start_0
    sget-object v0, Ldefpackage/w15;->a:Ldefpackage/w15;

    .line 52
    .line 53
    invoke-virtual {v0, p0}, Ldefpackage/w15;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    return-object p0

    .line 58
    :catch_0
    move-exception v0

    .line 59
    new-instance v1, Ljava/lang/RuntimeException;

    .line 60
    .line 61
    new-instance v2, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    const-string v3, "Unable to create instance of "

    .line 64
    .line 65
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string p0, ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem."

    .line 72
    .line 73
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-direct {v1, p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    throw v1

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_0
    .end packed-switch
.end method

.method public C(I)Ldefpackage/v3;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public D(Ldefpackage/nq2;Ldefpackage/sp2;Ljava/util/Collection;)V
    .locals 8

    .line 1
    iget-object p0, p0, Ldefpackage/zh0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, p0

    .line 4
    check-cast v1, Ldefpackage/ui1;

    .line 5
    .line 6
    iget-object p0, v1, Ldefpackage/ui1;->w:Ldefpackage/nq2;

    .line 7
    .line 8
    if-ne p1, p0, :cond_2

    .line 9
    .line 10
    if-eqz p2, :cond_2

    .line 11
    .line 12
    iget-object p0, v1, Ldefpackage/ui1;->v:Ldefpackage/wq2;

    .line 13
    .line 14
    iget-object p0, p0, Ldefpackage/wq2;->a:Ldefpackage/vq2;

    .line 15
    .line 16
    invoke-virtual {p2}, Ldefpackage/sp2;->d()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {v1, p0, p1}, Ldefpackage/ui1;->b(Ldefpackage/vq2;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-instance v2, Ldefpackage/tq2;

    .line 25
    .line 26
    invoke-direct {v2, p0, p1, v0}, Ldefpackage/tq2;-><init>(Ldefpackage/vq2;Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, p2}, Ldefpackage/wq2;->i(Ldefpackage/sp2;)I

    .line 30
    .line 31
    .line 32
    iget-object p0, v1, Ldefpackage/ui1;->c:Ldefpackage/wq2;

    .line 33
    .line 34
    if-ne p0, v2, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget-object v3, v1, Ldefpackage/ui1;->w:Ldefpackage/nq2;

    .line 38
    .line 39
    iget-object v6, v1, Ldefpackage/ui1;->v:Ldefpackage/wq2;

    .line 40
    .line 41
    iget-object p0, v1, Ldefpackage/ui1;->e:Ldefpackage/uq2;

    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    if-eqz p0, :cond_1

    .line 45
    .line 46
    invoke-virtual {p0}, Ldefpackage/uq2;->a()V

    .line 47
    .line 48
    .line 49
    iput-object p1, v1, Ldefpackage/ui1;->e:Ldefpackage/uq2;

    .line 50
    .line 51
    :cond_1
    new-instance v0, Ldefpackage/uq2;

    .line 52
    .line 53
    const/4 v4, 0x3

    .line 54
    const/4 v5, 0x1

    .line 55
    move-object v7, p3

    .line 56
    invoke-direct/range {v0 .. v7}, Ldefpackage/uq2;-><init>(Ldefpackage/ui1;Ldefpackage/wq2;Ldefpackage/oq2;IZLdefpackage/wq2;Ljava/util/Collection;)V

    .line 57
    .line 58
    .line 59
    iput-object v0, v1, Ldefpackage/ui1;->e:Ldefpackage/uq2;

    .line 60
    .line 61
    invoke-virtual {v0}, Ldefpackage/uq2;->b()V

    .line 62
    .line 63
    .line 64
    iput-object p1, v1, Ldefpackage/ui1;->v:Ldefpackage/wq2;

    .line 65
    .line 66
    iput-object p1, v1, Ldefpackage/ui1;->w:Ldefpackage/nq2;

    .line 67
    .line 68
    return-void

    .line 69
    :cond_2
    move-object v7, p3

    .line 70
    iget-object p0, v1, Ldefpackage/ui1;->d:Ldefpackage/oq2;

    .line 71
    .line 72
    if-ne p1, p0, :cond_4

    .line 73
    .line 74
    if-eqz p2, :cond_3

    .line 75
    .line 76
    iget-object p0, v1, Ldefpackage/ui1;->c:Ldefpackage/wq2;

    .line 77
    .line 78
    invoke-virtual {v1, p0, p2}, Ldefpackage/ui1;->n(Ldefpackage/wq2;Ldefpackage/sp2;)I

    .line 79
    .line 80
    .line 81
    :cond_3
    iget-object p0, v1, Ldefpackage/ui1;->c:Ldefpackage/wq2;

    .line 82
    .line 83
    invoke-virtual {p0}, Ldefpackage/wq2;->a()Ldefpackage/tq2;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    if-eqz p0, :cond_4

    .line 88
    .line 89
    invoke-virtual {p0, v7}, Ldefpackage/tq2;->o(Ljava/util/Collection;)V

    .line 90
    .line 91
    .line 92
    :cond_4
    :goto_0
    return-void
.end method

.method public F(IILandroid/os/Bundle;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public a(Ldefpackage/qu2;Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/zh0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/bg;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ldefpackage/bg;->v(Ldefpackage/qu2;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public b()I
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/zh0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->getCollapsedSize()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public c()V
    .locals 0

    .line 1
    return-void
.end method

.method public d()I
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/zh0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->getCollapsedSize()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public e(J)I
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long p0, p1, v0

    .line 4
    .line 5
    if-gez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, -0x1

    .line 10
    return p0
.end method

.method public f()Landroid/content/ClipData;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/zh0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/view/ContentInfo;

    .line 4
    .line 5
    invoke-static {p0}, Ldefpackage/hd0;->d(Landroid/view/ContentInfo;)Landroid/content/ClipData;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public g(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldefpackage/zh0;->o:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, Ldefpackage/fo1;

    .line 7
    .line 8
    invoke-virtual {p0}, Ldefpackage/fo1;->c()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    new-instance v0, Ldefpackage/jo;

    .line 16
    .line 17
    const/4 v1, 0x4

    .line 18
    invoke-direct {v0, p0, p1, p2, v1}, Ldefpackage/jo;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 19
    .line 20
    .line 21
    new-instance p2, Ldefpackage/do1;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-direct {p2, v1, p1}, Ldefpackage/do1;-><init>(ILjava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    invoke-virtual {p0, p1}, Ldefpackage/fo1;->r(Z)V

    .line 29
    .line 30
    .line 31
    sget-object p1, Ldefpackage/io1;->a:Ljava/util/concurrent/ExecutorService;

    .line 32
    .line 33
    new-instance v1, Ldefpackage/v6;

    .line 34
    .line 35
    const/16 v2, 0xa

    .line 36
    .line 37
    invoke-direct {v1, p2, p0, v0, v2}, Ldefpackage/v6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 38
    .line 39
    .line 40
    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public h(Landroid/view/View;)Z
    .locals 2

    .line 1
    iget-object p0, p0, Ldefpackage/zh0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/drawerlayout/widget/DrawerLayout;

    .line 4
    .line 5
    invoke-static {p1}, Landroidx/drawerlayout/widget/DrawerLayout;->m(Landroid/view/View;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Landroidx/drawerlayout/widget/DrawerLayout;->i(Landroid/view/View;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x2

    .line 16
    if-eq v0, v1, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    invoke-virtual {p0, p1, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->c(Landroid/view/View;Z)V

    .line 20
    .line 21
    .line 22
    return v0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method public i(Ljava/lang/Object;)V
    .locals 5

    .line 1
    check-cast p1, Ljava/util/Map;

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/zh0;->o:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ldefpackage/ld1;

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x0

    .line 12
    new-array v3, v2, [Ljava/lang/String;

    .line 13
    .line 14
    invoke-interface {v1, v3}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, [Ljava/lang/String;

    .line 19
    .line 20
    new-instance v1, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    new-array p1, p1, [I

    .line 34
    .line 35
    move v3, v2

    .line 36
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-ge v3, v4, :cond_1

    .line 41
    .line 42
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    check-cast v4, Ljava/lang/Boolean;

    .line 47
    .line 48
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-eqz v4, :cond_0

    .line 53
    .line 54
    move v4, v2

    .line 55
    goto :goto_1

    .line 56
    :cond_0
    const/4 v4, -0x1

    .line 57
    :goto_1
    aput v4, p1, v3

    .line 58
    .line 59
    add-int/lit8 v3, v3, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    iget-object p1, v0, Ldefpackage/ld1;->E:Ljava/util/ArrayDeque;

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    check-cast p1, Ldefpackage/gd1;

    .line 69
    .line 70
    const-string v1, "FragmentManager"

    .line 71
    .line 72
    if-nez p1, :cond_2

    .line 73
    .line 74
    new-instance p1, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    const-string v0, "No permissions were requested for "

    .line 77
    .line 78
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-static {v1, p0}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_2
    iget-object p0, p1, Ldefpackage/gd1;->n:Ljava/lang/String;

    .line 93
    .line 94
    iget-object p1, v0, Ldefpackage/ld1;->c:Ldefpackage/ss0;

    .line 95
    .line 96
    invoke-virtual {p1, p0}, Ldefpackage/ss0;->u(Ljava/lang/String;)Ldefpackage/kc1;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    if-nez p1, :cond_3

    .line 101
    .line 102
    new-instance p1, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    const-string v0, "Permission request result delivered for unknown Fragment "

    .line 105
    .line 106
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    invoke-static {v1, p0}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 117
    .line 118
    .line 119
    :cond_3
    return-void
.end method

.method public j()I
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/zh0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->getCollapsedPadding()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public k(I)J
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/4 p0, 0x0

    .line 6
    :goto_0
    invoke-static {p0}, Ldefpackage/rr2;->l(Z)V

    .line 7
    .line 8
    .line 9
    const-wide/16 p0, 0x0

    .line 10
    .line 11
    return-wide p0
.end method

.method public l()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/zh0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public m(J)Ljava/util/List;
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long p1, p1, v0

    .line 4
    .line 5
    if-ltz p1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Ldefpackage/zh0;->o:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Ljava/util/List;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 13
    .line 14
    return-object p0
.end method

.method public n()I
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public o()Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .line 1
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/zh0;->o:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->getCollapsedSize()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {p0}, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->getCollapsedSize()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    invoke-direct {v0, v1, p0}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public onFailure(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/zh0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/hj;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/hj;->c:Ldefpackage/k03;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-static {p1}, Ldefpackage/kb4;->h(Ljava/util/ArrayList;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p0, p1}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public onResponse(Lretrofit2/Call;Lretrofit2/Response;)V
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/zh0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/hj;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/hj;->c:Ldefpackage/k03;

    .line 6
    .line 7
    invoke-virtual {p2}, Lretrofit2/Response;->isSuccessful()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_1

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
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getArtists()Lcom/eddyizm/tempus/subsonic/models/ArtistsID3;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    new-instance p1, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    check-cast p2, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 45
    .line 46
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getArtists()Lcom/eddyizm/tempus/subsonic/models/ArtistsID3;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/ArtistsID3;->getIndices()Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_0

    .line 67
    .line 68
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    check-cast v0, Lcom/eddyizm/tempus/subsonic/models/IndexID3;

    .line 73
    .line 74
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/IndexID3;->getArtists()Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_0
    invoke-static {p1}, Ldefpackage/kb4;->h(Ljava/util/ArrayList;)Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {p0, p1}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_1
    const/4 p1, 0x0

    .line 91
    invoke-static {p1}, Ldefpackage/kb4;->h(Ljava/util/ArrayList;)Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-virtual {p0, p1}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    return-void
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
    iget-object p0, p0, Ldefpackage/zh0;->o:Ljava/lang/Object;

    .line 6
    .line 7
    move-object v0, p0

    .line 8
    check-cast v0, Landroid/content/ContentResolver;

    .line 9
    .line 10
    sget-object v1, Landroid/provider/MediaStore$Video$Thumbnails;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

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
    sget-object v2, Ldefpackage/zh0;->q:[Ljava/lang/String;

    .line 18
    .line 19
    const-string v3, "kind = 1 AND video_id = ?"

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

.method public q(Ldefpackage/q04;Ldefpackage/db3;)Ldefpackage/q04;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/zh0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/content/res/Resources;

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    new-instance p2, Ldefpackage/at;

    .line 10
    .line 11
    invoke-direct {p2, p0, p1}, Ldefpackage/at;-><init>(Landroid/content/res/Resources;Ldefpackage/q04;)V

    .line 12
    .line 13
    .line 14
    return-object p2
.end method

.method public r()I
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/zh0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/view/ContentInfo;

    .line 4
    .line 5
    invoke-static {p0}, Ldefpackage/hd0;->c(Landroid/view/ContentInfo;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public s()I
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/zh0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->getCollapsedPadding()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public t()Landroid/view/ContentInfo;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/zh0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/view/ContentInfo;

    .line 4
    .line 5
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Ldefpackage/zh0;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

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
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "ContentInfoCompat{"

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Ldefpackage/zh0;->o:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Landroid/view/ContentInfo;

    .line 21
    .line 22
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string p0, "}"

    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_0
    .end packed-switch
.end method

.method public u()I
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/zh0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/view/ContentInfo;

    .line 4
    .line 5
    invoke-static {p0}, Ldefpackage/hd0;->x(Landroid/view/ContentInfo;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public v(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/zh0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/fo1;

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/fo1;->c()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p0, v0}, Ldefpackage/fo1;->r(Z)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Ldefpackage/fo1;->t(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public w(Ldefpackage/qu2;)Z
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/zh0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/bg;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/bg;->y:Landroid/view/Window;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const/16 v0, 0x6c

    .line 14
    .line 15
    invoke-interface {p0, v0, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 16
    .line 17
    .line 18
    :cond_0
    const/4 p0, 0x1

    .line 19
    return p0
.end method

.method public x(Landroid/view/View;Ldefpackage/pb5;)Ldefpackage/pb5;
    .locals 1

    .line 1
    iget p1, p0, Ldefpackage/zh0;->n:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p1, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Ldefpackage/zh0;->o:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;

    .line 10
    .line 11
    sget-object p1, Ldefpackage/j65;->a:Ljava/util/WeakHashMap;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getFitsSystemWindows()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    move-object v0, p2

    .line 20
    :cond_0
    iget-object p1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->N:Ldefpackage/pb5;

    .line 21
    .line 22
    invoke-static {p1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-nez p1, :cond_1

    .line 27
    .line 28
    iput-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->N:Ldefpackage/pb5;

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 31
    .line 32
    .line 33
    :cond_1
    iget-object p0, p2, Ldefpackage/pb5;->a:Ldefpackage/mb5;

    .line 34
    .line 35
    invoke-virtual {p0}, Ldefpackage/mb5;->c()Ldefpackage/pb5;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_0
    iget-object p0, p0, Ldefpackage/zh0;->o:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p0, Lcom/google/android/material/appbar/AppBarLayout;

    .line 43
    .line 44
    sget-object p1, Ldefpackage/j65;->a:Ljava/util/WeakHashMap;

    .line 45
    .line 46
    invoke-virtual {p0}, Landroid/view/View;->getFitsSystemWindows()Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    move-object v0, p2

    .line 53
    :cond_2
    iget-object p1, p0, Lcom/google/android/material/appbar/AppBarLayout;->t:Ldefpackage/pb5;

    .line 54
    .line 55
    invoke-static {p1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-nez p1, :cond_4

    .line 60
    .line 61
    iput-object v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->t:Ldefpackage/pb5;

    .line 62
    .line 63
    iget-object p1, p0, Lcom/google/android/material/appbar/AppBarLayout;->I:Landroid/graphics/drawable/Drawable;

    .line 64
    .line 65
    const/4 v0, 0x1

    .line 66
    if-eqz p1, :cond_3

    .line 67
    .line 68
    invoke-virtual {p0}, Lcom/google/android/material/appbar/AppBarLayout;->getTopInset()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-lez p1, :cond_3

    .line 73
    .line 74
    move p1, v0

    .line 75
    goto :goto_0

    .line 76
    :cond_3
    const/4 p1, 0x0

    .line 77
    :goto_0
    xor-int/2addr p1, v0

    .line 78
    invoke-virtual {p0, p1}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 82
    .line 83
    .line 84
    :cond_4
    return-object p2

    .line 85
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
    .end packed-switch
.end method

.method public y(ILdefpackage/v3;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method public z(I)Ldefpackage/v3;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method
