.class public final Lcom/eddyizm/tempus/homemusic/HubAuthOptions;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private emailSignup:Z
    .annotation runtime Lka4;
        value = "email_signup"
    .end annotation
.end field

.field private googleClientId:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "google_client_id"
    .end annotation
.end field

.field private invites:Z

.field private musicUrl:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "music_url"
    .end annotation
.end field


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
.method public final getEmailSignup()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/eddyizm/tempus/homemusic/HubAuthOptions;->emailSignup:Z

    .line 2
    .line 3
    return p0
.end method

.method public final getGoogleClientId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubAuthOptions;->googleClientId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getInvites()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/eddyizm/tempus/homemusic/HubAuthOptions;->invites:Z

    .line 2
    .line 3
    return p0
.end method

.method public final getMusicUrl()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubAuthOptions;->musicUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final setEmailSignup(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/eddyizm/tempus/homemusic/HubAuthOptions;->emailSignup:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setGoogleClientId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubAuthOptions;->googleClientId:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setInvites(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/eddyizm/tempus/homemusic/HubAuthOptions;->invites:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setMusicUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubAuthOptions;->musicUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method
