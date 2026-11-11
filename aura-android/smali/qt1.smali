.class public final synthetic Lqt1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Landroid/app/Activity;

.field public final synthetic p:Lcom/eddyizm/tempus/homemusic/HubAppRelease;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Lcom/eddyizm/tempus/homemusic/HubAppRelease;I)V
    .locals 0

    .line 1
    iput p3, p0, Lqt1;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lqt1;->o:Landroid/app/Activity;

    .line 4
    .line 5
    iput-object p2, p0, Lqt1;->p:Lcom/eddyizm/tempus/homemusic/HubAppRelease;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 1
    iget v0, p0, Lqt1;->n:I

    .line 2
    .line 3
    iget-object v1, p0, Lqt1;->p:Lcom/eddyizm/tempus/homemusic/HubAppRelease;

    .line 4
    .line 5
    iget-object p0, p0, Lqt1;->o:Landroid/app/Activity;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-static {p0, v1, p1, p2}, Lcom/eddyizm/tempus/homemusic/HubUpdater;->h(Landroid/app/Activity;Lcom/eddyizm/tempus/homemusic/HubAppRelease;Landroid/content/DialogInterface;I)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    invoke-static {p0, v1, p1, p2}, Lcom/eddyizm/tempus/homemusic/HubUpdater;->d(Landroid/app/Activity;Lcom/eddyizm/tempus/homemusic/HubAppRelease;Landroid/content/DialogInterface;I)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
