.class public final synthetic Landroidx/credentials/playservices/b;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ldefpackage/vf0;

.field public final synthetic p:Ljava/io/Serializable;


# direct methods
.method public synthetic constructor <init>(Ldefpackage/vf0;Ljava/io/Serializable;I)V
    .locals 0

    .line 1
    iput p3, p0, Landroidx/credentials/playservices/b;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/credentials/playservices/b;->o:Ldefpackage/vf0;

    .line 4
    .line 5
    iput-object p2, p0, Landroidx/credentials/playservices/b;->p:Ljava/io/Serializable;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/credentials/playservices/b;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/credentials/playservices/b;->p:Ljava/io/Serializable;

    .line 7
    .line 8
    check-cast v0, Ljava/lang/Exception;

    .line 9
    .line 10
    iget-object p0, p0, Landroidx/credentials/playservices/b;->o:Ldefpackage/vf0;

    .line 11
    .line 12
    invoke-static {p0, v0}, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl$onClearCredential$5$1$1;->$r8$lambda$yCNh6NAz004VK85kWepukKhfXQI(Ldefpackage/vf0;Ljava/lang/Exception;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object v0, p0, Landroidx/credentials/playservices/b;->p:Ljava/io/Serializable;

    .line 17
    .line 18
    check-cast v0, Ldefpackage/jx3;

    .line 19
    .line 20
    iget-object p0, p0, Landroidx/credentials/playservices/b;->o:Ldefpackage/vf0;

    .line 21
    .line 22
    invoke-static {p0, v0}, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl$onClearCredential$3$1;->$r8$lambda$T2CNREWclnozpdsmbRQwPRefiOQ(Ldefpackage/vf0;Ldefpackage/jx3;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
