.class public final synthetic Lyj3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lik;

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:Lkc1;


# direct methods
.method public synthetic constructor <init>(Lkc1;Lik;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p4, p0, Lyj3;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lyj3;->q:Lkc1;

    .line 4
    .line 5
    iput-object p2, p0, Lyj3;->o:Lik;

    .line 6
    .line 7
    iput-object p3, p0, Lyj3;->p:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 5

    .line 1
    iget p1, p0, Lyj3;->n:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    const v2, 0x7f13007a

    .line 6
    .line 7
    .line 8
    iget-object v3, p0, Lyj3;->p:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v4, p0, Lyj3;->o:Lik;

    .line 11
    .line 12
    iget-object p0, p0, Lyj3;->q:Lkc1;

    .line 13
    .line 14
    packed-switch p1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;

    .line 18
    .line 19
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {p1, v4}, Ll93;->t(Landroid/content/Context;Lik;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {p0, v2, v3}, Lkc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-static {p1, p0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 43
    .line 44
    .line 45
    return v0

    .line 46
    :pswitch_0
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;

    .line 47
    .line 48
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-static {p1, v4}, Ll93;->t(Landroid/content/Context;Lik;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-virtual {p0, v2, v3}, Lkc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-static {p1, p0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 72
    .line 73
    .line 74
    return v0

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
