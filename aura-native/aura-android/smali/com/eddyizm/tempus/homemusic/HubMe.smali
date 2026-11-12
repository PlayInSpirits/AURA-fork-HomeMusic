.class public final Lcom/eddyizm/tempus/homemusic/HubMe;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private email:Ljava/lang/String;

.field private googleEmail:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "google_email"
    .end annotation
.end field

.field private id:I

.field private isAdmin:Z
    .annotation runtime Lka4;
        value = "is_admin"
    .end annotation
.end field

.field private username:Ljava/lang/String;


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
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubMe;->email:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getGoogleEmail()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubMe;->googleEmail:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getId()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/eddyizm/tempus/homemusic/HubMe;->id:I

    .line 2
    .line 3
    return p0
.end method

.method public final getUsername()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubMe;->username:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final isAdmin()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/eddyizm/tempus/homemusic/HubMe;->isAdmin:Z

    .line 2
    .line 3
    return p0
.end method

.method public final setAdmin(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/eddyizm/tempus/homemusic/HubMe;->isAdmin:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setEmail(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubMe;->email:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setGoogleEmail(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubMe;->googleEmail:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setId(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/eddyizm/tempus/homemusic/HubMe;->id:I

    .line 2
    .line 3
    return-void
.end method

.method public final setUsername(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubMe;->username:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method
