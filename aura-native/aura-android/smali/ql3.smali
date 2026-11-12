.class public final synthetic Lql3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lom1;


# direct methods
.method public synthetic constructor <init>(Lom1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lql3;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lql3;->o:Lom1;

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
    .locals 3

    .line 1
    iget v0, p0, Lql3;->n:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, Lql3;->o:Lom1;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lom1;->o:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lsl3;

    .line 12
    .line 13
    invoke-virtual {p0}, Lkc1;->n()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const v2, 0x7f1303f7

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lsl3;->F0:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Lcom/eddyizm/tempus/interfaces/PlaylistCallback;

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    iget-object v1, p0, Lsl3;->E0:Lhd;

    .line 34
    .line 35
    check-cast v1, Lwl3;

    .line 36
    .line 37
    iget-object v1, v1, Lwl3;->f:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 38
    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    iget-object v1, p0, Lsl3;->C0:Ljava/lang/String;

    .line 42
    .line 43
    invoke-interface {v0, v1}, Lcom/eddyizm/tempus/interfaces/PlaylistCallback;->onRenamed(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    iget-object p0, p0, Lpp0;->w0:Landroid/app/Dialog;

    .line 47
    .line 48
    if-eqz p0, :cond_1

    .line 49
    .line 50
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 51
    .line 52
    .line 53
    :cond_1
    return-void

    .line 54
    :pswitch_0
    iget-object p0, p0, Lom1;->o:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p0, Lsl3;

    .line 57
    .line 58
    invoke-virtual {p0}, Lkc1;->n()Landroid/content/Context;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    const v0, 0x7f1303f6

    .line 63
    .line 64
    .line 65
    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
