.class public final synthetic Landroidx/credentials/playservices/controllers/a;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Ldefpackage/vf0;

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ldefpackage/vf0;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/credentials/playservices/controllers/a;->n:Ldefpackage/vf0;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/credentials/playservices/controllers/a;->o:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/credentials/playservices/controllers/a;->n:Ldefpackage/vf0;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/credentials/playservices/controllers/a;->o:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-static {v0, p0}, Landroidx/credentials/playservices/controllers/CredentialProviderController$maybeReportErrorFromResultReceiver$1;->$r8$lambda$z8E-SnyVHcJpaCU3Q58tSGSDt4I(Ldefpackage/vf0;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
