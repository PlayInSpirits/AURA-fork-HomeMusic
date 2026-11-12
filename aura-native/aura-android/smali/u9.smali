.class public final synthetic Lu9;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lw9;


# direct methods
.method public synthetic constructor <init>(Lw9;I)V
    .locals 0

    .line 1
    iput p2, p0, Lu9;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lu9;->o:Lw9;

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
    .locals 5

    .line 1
    iget v0, p0, Lu9;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Lu9;->o:Lw9;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, Lw9;->g:Landroid/net/Uri;

    .line 9
    .line 10
    invoke-virtual {p0}, Lw9;->a()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object v0, p0, Lw9;->d:Lv9;

    .line 15
    .line 16
    new-instance v1, Landroid/content/IntentFilter;

    .line 17
    .line 18
    const-string v2, "androidx.car.app.connection.action.CAR_CONNECTION_UPDATED"

    .line 19
    .line 20
    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 24
    .line 25
    iget-object v3, p0, Lw9;->a:Landroid/content/Context;

    .line 26
    .line 27
    const/16 v4, 0x21

    .line 28
    .line 29
    if-lt v2, v4, :cond_0

    .line 30
    .line 31
    invoke-static {v3, v0, v1}, Lj3;->p(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {v3, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 36
    .line 37
    .line 38
    :goto_0
    invoke-virtual {p0}, Lw9;->a()V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_1
    iget-object v0, p0, Lw9;->a:Landroid/content/Context;

    .line 43
    .line 44
    iget-object p0, p0, Lw9;->d:Lv9;

    .line 45
    .line 46
    invoke-virtual {v0, p0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
