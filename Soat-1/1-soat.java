function updateClock() {
    const hourElement = document.getElementById('hour');
    const minuteElement = document.getElementById('minute');
    const secondElement = document.getElementById('second');
    
    const date = new Date();
    
    let hours = date.getHours();
    let minutes = date.getMinutes();
    let seconds = date.getSeconds();
    
    // Sekund va minutlar uchun burchaklar
    const secondDeg = (seconds / 60) * 360;
    const minuteDeg = (minutes / 60) * 360 + (seconds / 60) * 6; // Sekundlar ta'siri
    const hourDeg = (hours / 12) * 360 + (minutes / 60) * 30; // Daqiqalar ta'siri
    
    // Sekund, daqiqa va soatni moslashtirish
    secondElement.style.transform = rotate(${secondDeg}deg);
    minuteElement.style.transform = rotate(${minuteDeg}deg);
    hourElement.style.transform = rotate(${hourDeg}deg);
}

// Har soniyada soatni yangilash
setInterval(updateClock, 1000);