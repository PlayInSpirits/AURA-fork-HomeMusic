.class final Landroidx/credentials/playservices/HiddenActivity$handleCreatePassword$1$1;
.super Ldefpackage/q42;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/if1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/credentials/playservices/HiddenActivity;->handleCreatePassword()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ldefpackage/q42;",
        "Ldefpackage/if1;"
    }
.end annotation


# instance fields
.field final synthetic $requestCode:I

.field final synthetic this$0:Landroidx/credentials/playservices/HiddenActivity;


# direct methods
.method public constructor <init>(Landroidx/credentials/playservices/HiddenActivity;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/credentials/playservices/HiddenActivity$handleCreatePassword$1$1;->this$0:Landroidx/credentials/playservices/HiddenActivity;

    .line 2
    .line 3
    iput p2, p0, Landroidx/credentials/playservices/HiddenActivity$handleCreatePassword$1$1;->$requestCode:I

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Ldefpackage/q42;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 61
    check-cast p1, Ldefpackage/s44;

    invoke-virtual {p0, p1}, Landroidx/credentials/playservices/HiddenActivity$handleCreatePassword$1$1;->invoke(Ldefpackage/s44;)V

    sget-object p0, Ldefpackage/j15;->a:Ldefpackage/j15;

    return-object p0
.end method

.method public final invoke(Ldefpackage/s44;)V
    .locals 10

    .line 1
    :try_start_0
    iget-object v0, p0, Landroidx/credentials/playservices/HiddenActivity$handleCreatePassword$1$1;->this$0:Landroidx/credentials/playservices/HiddenActivity;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1}, Landroidx/credentials/playservices/HiddenActivity;->access$setMWaitingForActivityResult$p(Landroidx/credentials/playservices/HiddenActivity;Z)V

    .line 5
    .line 6
    .line 7
    iget-object v2, p0, Landroidx/credentials/playservices/HiddenActivity$handleCreatePassword$1$1;->this$0:Landroidx/credentials/playservices/HiddenActivity;

    .line 8
    .line 9
    iget-object p1, p1, Ldefpackage/s44;->n:Landroid/app/PendingIntent;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    iget v4, p0, Landroidx/credentials/playservices/HiddenActivity$handleCreatePassword$1$1;->$requestCode:I

    .line 16
    .line 17
    const/4 v8, 0x0

    .line 18
    const/4 v9, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v7, 0x0

    .line 22
    invoke-virtual/range {v2 .. v9}, Landroid/app/Activity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :catch_0
    move-exception v0

    .line 27
    move-object p1, v0

    .line 28
    iget-object p0, p0, Landroidx/credentials/playservices/HiddenActivity$handleCreatePassword$1$1;->this$0:Landroidx/credentials/playservices/HiddenActivity;

    .line 29
    .line 30
    invoke-static {p0}, Landroidx/credentials/playservices/HiddenActivity;->access$getResultReceiver$p(Landroidx/credentials/playservices/HiddenActivity;)Landroid/os/ResultReceiver;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    new-instance v1, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string v2, "During save password, found UI intent sender failure: "

    .line 40
    .line 41
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    const-string v1, "CREATE_UNKNOWN"

    .line 56
    .line 57
    invoke-static {p0, v0, v1, p1}, Landroidx/credentials/playservices/HiddenActivity;->access$setupFailure(Landroidx/credentials/playservices/HiddenActivity;Landroid/os/ResultReceiver;Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method
