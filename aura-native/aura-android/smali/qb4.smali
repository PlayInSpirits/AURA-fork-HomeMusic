.class public final synthetic Lqb4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lbp3;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lvb4;

.field public final synthetic p:Landroidx/preference/ListPreference;


# direct methods
.method public synthetic constructor <init>(Lvb4;Landroidx/preference/ListPreference;I)V
    .locals 0

    .line 1
    iput p3, p0, Lqb4;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lqb4;->o:Lvb4;

    .line 4
    .line 5
    iput-object p2, p0, Lqb4;->p:Landroidx/preference/ListPreference;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final g(Landroidx/preference/Preference;Ljava/lang/Object;)Z
    .locals 3

    .line 1
    iget p1, p0, Lqb4;->n:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    iget-object v1, p0, Lqb4;->p:Landroidx/preference/ListPreference;

    .line 5
    .line 6
    iget-object p0, p0, Lqb4;->o:Lvb4;

    .line 7
    .line 8
    packed-switch p1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p2, Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v1, p2}, Landroidx/preference/ListPreference;->E(Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-ltz p1, :cond_0

    .line 18
    .line 19
    iget-object v2, v1, Landroidx/preference/ListPreference;->h0:[Ljava/lang/CharSequence;

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    aget-object p1, v2, p1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const-string p1, ""

    .line 27
    .line 28
    :goto_0
    invoke-virtual {v1, p1}, Landroidx/preference/ListPreference;->x(Ljava/lang/CharSequence;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    const-string v1, "selected_equalizer"

    .line 50
    .line 51
    invoke-interface {p1, v1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Lvb4;->p0()V

    .line 59
    .line 60
    .line 61
    new-instance p1, Landroid/content/Intent;

    .line 62
    .line 63
    invoke-virtual {p0}, Lkc1;->n()Landroid/content/Context;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    const-class v1, Lcom/eddyizm/tempus/service/MediaService;

    .line 72
    .line 73
    invoke-direct {p1, p2, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 74
    .line 75
    .line 76
    const-string p2, "com.eddyizm.tempus.service.ACTION_RELOAD_EQUALIZER"

    .line 77
    .line 78
    invoke-virtual {p1, p2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Lkc1;->n()Landroid/content/Context;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-static {p0, p1}, Lud3;->G0(Landroid/content/Context;Landroid/content/Intent;)V

    .line 90
    .line 91
    .line 92
    return v0

    .line 93
    :pswitch_0
    check-cast p2, Ljava/lang/String;

    .line 94
    .line 95
    invoke-virtual {v1, p2}, Landroidx/preference/ListPreference;->H(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    iget-object p1, p0, Lvb4;->v0:Lvf2;

    .line 99
    .line 100
    invoke-virtual {p1, p2}, Lvf2;->d(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0, v1}, Lvb4;->s0(Landroidx/preference/ListPreference;)V

    .line 104
    .line 105
    .line 106
    return v0

    .line 107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
