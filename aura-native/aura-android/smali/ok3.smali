.class public final synthetic Lok3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lqk3;


# direct methods
.method public synthetic constructor <init>(Lqk3;I)V
    .locals 0

    .line 1
    iput p2, p0, Lok3;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lok3;->o:Lqk3;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    .line 1
    iget p1, p0, Lok3;->n:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    iget-object p0, p0, Lok3;->o:Lqk3;

    .line 5
    .line 6
    packed-switch p1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lqk3;->m0:Laj3;

    .line 10
    .line 11
    iget-object v1, p1, Laj3;->n:Lk03;

    .line 12
    .line 13
    invoke-virtual {v1}, Lad2;->d()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    :goto_0
    move v0, v2

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    iget-object v3, p1, Laj3;->k:Lk03;

    .line 25
    .line 26
    invoke-virtual {v3}, Lad2;->d()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Lcom/eddyizm/tempus/subsonic/models/LyricsList;

    .line 31
    .line 32
    iget-object v4, p1, Laj3;->j:Lk03;

    .line 33
    .line 34
    invoke-virtual {v4}, Lad2;->d()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    check-cast v4, Ljava/lang/String;

    .line 39
    .line 40
    if-eqz v3, :cond_1

    .line 41
    .line 42
    invoke-static {v3}, Laj3;->d(Lcom/eddyizm/tempus/subsonic/models/LyricsList;)Z

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    if-nez v5, :cond_2

    .line 47
    .line 48
    :cond_1
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-eqz v5, :cond_2

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    invoke-virtual {p1, v1, v4, v3}, Laj3;->g(Lcom/eddyizm/tempus/subsonic/models/Child;Ljava/lang/String;Lcom/eddyizm/tempus/subsonic/models/LyricsList;)V

    .line 56
    .line 57
    .line 58
    :goto_1
    invoke-virtual {p0}, Lkc1;->n()Landroid/content/Context;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-eqz p1, :cond_4

    .line 63
    .line 64
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    if-eqz v0, :cond_3

    .line 69
    .line 70
    const p1, 0x7f1303d3

    .line 71
    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_3
    const p1, 0x7f1303d2

    .line 75
    .line 76
    .line 77
    :goto_2
    invoke-static {p0, p1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 82
    .line 83
    .line 84
    :cond_4
    return-void

    .line 85
    :pswitch_0
    iget-object p0, p0, Lqk3;->m0:Laj3;

    .line 86
    .line 87
    iget-boolean p1, p0, Laj3;->s:Z

    .line 88
    .line 89
    xor-int/2addr p1, v0

    .line 90
    iput-boolean p1, p0, Laj3;->s:Z

    .line 91
    .line 92
    return-void

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
