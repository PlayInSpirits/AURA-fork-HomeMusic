.class public final synthetic Lrd2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lgf1;


# instance fields
.field public final synthetic n:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lrd2;->n:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget p0, p0, Lrd2;->n:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    sget-object p0, Lj15;->a:Lj15;

    .line 8
    .line 9
    return-object p0

    .line 10
    :pswitch_0
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 11
    .line 12
    return-object p0

    .line 13
    :pswitch_1
    sget-object p0, Lc94;->a:Ll90;

    .line 14
    .line 15
    return-object v0

    .line 16
    :pswitch_2
    sget-object p0, Lz44;->a:Lwl4;

    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_3
    new-instance p0, Lw44;

    .line 20
    .line 21
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0, v0}, Lw44;-><init>(Ljava/util/Map;)V

    .line 27
    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_4
    sget-object p0, Lfg3;->a:Ll90;

    .line 31
    .line 32
    return-object v0

    .line 33
    :pswitch_5
    new-instance p0, Loc;

    .line 34
    .line 35
    new-instance v0, Landroid/graphics/PathMeasure;

    .line 36
    .line 37
    invoke-direct {v0}, Landroid/graphics/PathMeasure;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-direct {p0, v0}, Loc;-><init>(Landroid/graphics/PathMeasure;)V

    .line 41
    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_6
    new-instance p0, Lqb3;

    .line 45
    .line 46
    invoke-direct {p0}, Lqb3;-><init>()V

    .line 47
    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_7
    sget-object p0, Lq01;->n:Lq01;

    .line 51
    .line 52
    invoke-static {p0}, Lte5;->a(Lne0;)Ltd0;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-static {p0, v0}, Lte5;->g(Lwe0;Landroidx/compose/ui/ModifierNodeDetachedCancellationException;)V

    .line 57
    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_8
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 61
    .line 62
    const-string v0, "CompositionLocal LocalSavedStateRegistryOwner not present"

    .line 63
    .line 64
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p0

    .line 68
    :pswitch_9
    sget-object p0, Lsd2;->a:Lwl4;

    .line 69
    .line 70
    sget-object p0, Lfz0;->b0:Lfz0;

    .line 71
    .line 72
    return-object p0

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
