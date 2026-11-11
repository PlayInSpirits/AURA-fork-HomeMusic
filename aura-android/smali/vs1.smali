.class public final synthetic Lvs1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, Lvs1;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lvs1;->o:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lvs1;->p:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lvs1;->q:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p4, p0, Lvs1;->r:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 9

    .line 1
    iget p1, p0, Lvs1;->n:I

    .line 2
    .line 3
    iget-object p2, p0, Lvs1;->r:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v0, p0, Lvs1;->q:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v1, p0, Lvs1;->p:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object p0, p0, Lvs1;->o:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch p1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p0, Landroid/content/SharedPreferences;

    .line 15
    .line 16
    check-cast v1, Ly42;

    .line 17
    .line 18
    check-cast v0, Lh62;

    .line 19
    .line 20
    check-cast p2, Landroid/net/nsd/NsdServiceInfo;

    .line 21
    .line 22
    sget-object p1, Lz01;->n:Lz01;

    .line 23
    .line 24
    const-string v2, "receivers"

    .line 25
    .line 26
    invoke-interface {p0, v2, p1}, Landroid/content/SharedPreferences;->getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    check-cast p1, Ljava/lang/Iterable;

    .line 34
    .line 35
    invoke-static {p1}, Lq40;->T0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iget-object v1, v1, Ly42;->a:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {p1, v1}, Lkb4;->Q(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-interface {p0, v2, p1}, Landroid/content/SharedPreferences$Editor;->putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, p2}, Lh62;->k0(Landroid/net/nsd/NsdServiceInfo;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :pswitch_0
    move-object v6, p0

    .line 61
    check-cast v6, Lvb4;

    .line 62
    .line 63
    move-object v3, v1

    .line 64
    check-cast v3, Ljx3;

    .line 65
    .line 66
    move-object v5, v0

    .line 67
    check-cast v5, Ljx3;

    .line 68
    .line 69
    move-object v7, p2

    .line 70
    check-cast v7, Landroidx/preference/Preference;

    .line 71
    .line 72
    new-instance v2, Le90;

    .line 73
    .line 74
    const/16 p0, 0x12

    .line 75
    .line 76
    invoke-direct {v2, p0}, Le90;-><init>(I)V

    .line 77
    .line 78
    .line 79
    const p0, 0x7f130215

    .line 80
    .line 81
    .line 82
    invoke-virtual {v6, p0}, Lkc1;->s(I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    sget-object p0, Lio1;->a:Ljava/util/concurrent/ExecutorService;

    .line 90
    .line 91
    new-instance v1, Lup;

    .line 92
    .line 93
    const/4 v8, 0x2

    .line 94
    invoke-direct/range {v1 .. v8}, Lup;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 95
    .line 96
    .line 97
    invoke-interface {p0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
