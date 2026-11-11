.class public final Lcom/eddyizm/tempus/homemusic/HubMixToday;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private building:Z

.field private mix:Lcom/eddyizm/tempus/homemusic/HubMix;

.field private onboarding:Z


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
.method public final getBuilding()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/eddyizm/tempus/homemusic/HubMixToday;->building:Z

    .line 2
    .line 3
    return p0
.end method

.method public final getMix()Lcom/eddyizm/tempus/homemusic/HubMix;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubMixToday;->mix:Lcom/eddyizm/tempus/homemusic/HubMix;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getOnboarding()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/eddyizm/tempus/homemusic/HubMixToday;->onboarding:Z

    .line 2
    .line 3
    return p0
.end method

.method public final setBuilding(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/eddyizm/tempus/homemusic/HubMixToday;->building:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setMix(Lcom/eddyizm/tempus/homemusic/HubMix;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubMixToday;->mix:Lcom/eddyizm/tempus/homemusic/HubMix;

    .line 2
    .line 3
    return-void
.end method

.method public final setOnboarding(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/eddyizm/tempus/homemusic/HubMixToday;->onboarding:Z

    .line 2
    .line 3
    return-void
.end method
