.class public final Lcom/eddyizm/tempus/subsonic/models/License;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private email:Ljava/lang/String;

.field private isValid:Z

.field private licenseExpires:Ljava/util/Date;

.field private trialExpires:Ljava/util/Date;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final getEmail()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/License;->email:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getLicenseExpires()Ljava/util/Date;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/License;->licenseExpires:Ljava/util/Date;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getTrialExpires()Ljava/util/Date;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/License;->trialExpires:Ljava/util/Date;

    .line 2
    .line 3
    return-object p0
.end method

.method public final isValid()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/eddyizm/tempus/subsonic/models/License;->isValid:Z

    .line 2
    .line 3
    return p0
.end method

.method public final setEmail(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/License;->email:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setLicenseExpires(Ljava/util/Date;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/License;->licenseExpires:Ljava/util/Date;

    .line 2
    .line 3
    return-void
.end method

.method public final setTrialExpires(Ljava/util/Date;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/License;->trialExpires:Ljava/util/Date;

    .line 2
    .line 3
    return-void
.end method

.method public final setValid(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/eddyizm/tempus/subsonic/models/License;->isValid:Z

    .line 2
    .line 3
    return-void
.end method
