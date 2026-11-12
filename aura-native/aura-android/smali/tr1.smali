.class public final synthetic Ltr1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lcom/eddyizm/tempus/subsonic/models/Child;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/subsonic/models/Child;I)V
    .locals 0

    .line 1
    iput p2, p0, Ltr1;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ltr1;->o:Lcom/eddyizm/tempus/subsonic/models/Child;

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
    .locals 2

    .line 1
    iget v0, p0, Ltr1;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Ltr1;->o:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {v0, p0}, Lot1;->e(Landroid/content/Context;Lcom/eddyizm/tempus/subsonic/models/Child;)V

    .line 16
    .line 17
    .line 18
    instance-of v0, p1, Landroid/widget/CompoundButton;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    check-cast p1, Landroid/widget/CompoundButton;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 p1, 0x0

    .line 26
    :goto_0
    if-eqz p1, :cond_2

    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getStarred()Ljava/util/Date;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    const/4 v1, 0x1

    .line 37
    if-eqz p0, :cond_1

    .line 38
    .line 39
    move p0, v1

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const/4 p0, 0x0

    .line 42
    :goto_1
    invoke-static {v1, v0, p0}, Ln61;->f(ILjava/lang/String;Z)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    invoke-virtual {p1, p0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 47
    .line 48
    .line 49
    :cond_2
    return-void

    .line 50
    :pswitch_0
    sget-object v0, Lur1;->a:Ljava/util/concurrent/ExecutorService;

    .line 51
    .line 52
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-static {p1}, Lur1;->a(Landroid/content/Context;)Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-nez p1, :cond_3

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_3
    if-eqz p0, :cond_4

    .line 64
    .line 65
    invoke-static {p1, p0}, Lur1;->c(Lcom/eddyizm/tempus/ui/activity/MainActivity;Lcom/eddyizm/tempus/subsonic/models/Child;)V

    .line 66
    .line 67
    .line 68
    :cond_4
    :goto_2
    return-void

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
