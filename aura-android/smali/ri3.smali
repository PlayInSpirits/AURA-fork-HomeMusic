.class public final synthetic Lri3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lxi3;


# direct methods
.method public synthetic constructor <init>(Lxi3;I)V
    .locals 0

    .line 1
    iput p2, p0, Lri3;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lri3;->o:Lxi3;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lri3;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Lri3;->o:Lxi3;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lxi3;->o0:Lns3;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, Lns3;->q:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lae1;

    .line 15
    .line 16
    iget-object p0, p0, Lae1;->e:Landroid/view/View;

    .line 17
    .line 18
    check-cast p0, Landroid/widget/ImageButton;

    .line 19
    .line 20
    const/16 v0, 0x8

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void

    .line 26
    :pswitch_0
    :try_start_0
    iget-object v0, p0, Lxi3;->q0:Lbl2;

    .line 27
    .line 28
    invoke-virtual {v0}, Lu0;->get()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Lbj2;

    .line 33
    .line 34
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const-string v2, "shuffle_mode"

    .line 46
    .line 47
    const/4 v3, 0x0

    .line 48
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    invoke-virtual {v0, v1}, Lsk2;->s(Z)V

    .line 53
    .line 54
    .line 55
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    const-string v2, "repeat_mode"

    .line 67
    .line 68
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    invoke-virtual {v0, v1}, Lsk2;->p0(I)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, v0}, Lxi3;->j0(Lbj2;)V

    .line 76
    .line 77
    .line 78
    sget-object v0, Lcom/eddyizm/tempus/homemusic/a;->f:Lk03;

    .line 79
    .line 80
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    new-instance v2, Lsi3;

    .line 85
    .line 86
    const/4 v3, 0x1

    .line 87
    invoke-direct {v2, p0, v3}, Lsi3;-><init>(Lxi3;I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v1, v2}, Lad2;->e(Lba2;La83;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :catch_0
    move-exception p0

    .line 95
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 96
    .line 97
    .line 98
    :goto_0
    return-void

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
